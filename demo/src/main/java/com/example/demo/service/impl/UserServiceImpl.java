package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserExample;import com.example.demo.service.UserService;

import com.github.liyiorg.mbg.support.service.MbgServiceSupport;
import com.github.liyiorg.mbg.template.factory.MbgMapperTemplateFactory;

@Service
public class UserServiceImpl extends MbgServiceSupport<UserMapper, Integer, User, User, UserExample> implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private void initService(MbgMapperTemplateFactory mbgMapperTemplateFactory){
		super.mbgMapperTemplate = mbgMapperTemplateFactory.getMbgMapperTemplate(userMapper);
	}

	@Override
	public int userRegist(User user) {
		return this.insertSelective(user);
	}
}