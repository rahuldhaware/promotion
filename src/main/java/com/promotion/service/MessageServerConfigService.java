package com.promotion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promotion.dao.MessageServerConfigDao;

@Service
public class MessageServerConfigService {

	@Autowired
	private MessageServerConfigDao messageServerConfigDao;
	
}
