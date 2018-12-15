package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.SchoolDAO;
import kr.ac.hansung.model.Expect;
import kr.ac.hansung.model.PassYS;
import kr.ac.hansung.model.School;

@Service
public class SchoolService {
	
	@Autowired
	private SchoolDAO schoolDao;
	
	public List<School> getList(PassYS passYS){
		System.out.println("여기는 서비스");
		return schoolDao.getName(passYS);
	}
	
	public void insert(Expect expect) {
		schoolDao.insert(expect);
		
	}
	
	
	public List<Expect> getCurrent() {
		return schoolDao.getAll();
	}


}
