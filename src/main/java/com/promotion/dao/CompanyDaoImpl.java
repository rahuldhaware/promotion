package com.promotion.dao;

import org.springframework.stereotype.Repository;

import com.promotion.model.Company;

@Repository("companyDao")
public class CompanyDaoImpl extends AbstractDaoImpl<Long, Company> implements CompanyDao{

}
