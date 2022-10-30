package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SurveyDao;
import com.example.demo.entity.Survey;

@Service
public class SurveyServiceImpl implements SurveyService {
	
	private final SurveyDao dao;
	
	@Autowired SurveyServiceImpl(SurveyDao dao) {
		
		this.dao = dao;
		
	}
		

	@Override
	public void save(Survey survey) {

		dao.insertSurvey(survey);

	}

	@Override
	public List<Survey> getAll() {
		
		return dao.getAll();
		
	}

}
