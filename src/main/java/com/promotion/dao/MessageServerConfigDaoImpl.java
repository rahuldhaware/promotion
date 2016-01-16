package com.promotion.dao;

import org.springframework.stereotype.Repository;

import com.promotion.model.MessageServerConfig;

@Repository("messageServerConfigDao")
public class MessageServerConfigDaoImpl extends AbstractDaoImpl<Long, MessageServerConfig> implements MessageServerConfigDao{

}
