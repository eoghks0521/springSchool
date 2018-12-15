package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.NextDAO;
import kr.ac.hansung.model.Next;

@Service
public class NextService {
	
	@Autowired
	private NextDAO nextDao;
	
	public List<Next> getCurrent(String name) {
		return nextDao.getNexts(name);
	}
	
	public void insert (Next next) {
		nextDao.insert(next);
	}

}
