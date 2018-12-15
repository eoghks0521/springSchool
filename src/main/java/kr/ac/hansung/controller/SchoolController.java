package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Expect;
import kr.ac.hansung.model.PassYS;
import kr.ac.hansung.model.School;
import kr.ac.hansung.service.SchoolService;

@Controller
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping("/school")
	public String showSchool(Model model,@Valid PassYS passYS, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("===Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
				
			}
			return "schoolpoint";
		}
		List<School>schools = schoolService.getList(passYS);
		model.addAttribute("schools",schools);
		return "list";
	}
	
	@RequestMapping("/schoolpoint")
	public String point(Model model) {
		
		model.addAttribute("passYS",new PassYS());
		return "schoolpoint";
	}
	
	
	@RequestMapping("/createschool")
	public String createOffer(Model model) {

		model.addAttribute("expect",new Expect());
		return "createschool";
	}
	
	
	@RequestMapping("/nextYear")
	public String create(Model model, @Valid Expect expect, BindingResult result) {

		if(result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createschool";
		}
		schoolService.insert(expect);
		
		return "upload";
	}
	
	
	@RequestMapping("/expects")
	public String showExpects(Model model) {
		List<Expect>expects = schoolService.getCurrent();
		model.addAttribute("expects",expects);
		
		return "expectlist";
	}
}
