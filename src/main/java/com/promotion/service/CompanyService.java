package com.promotion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promotion.dao.CompanyDao;

@Service
public class CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
}
