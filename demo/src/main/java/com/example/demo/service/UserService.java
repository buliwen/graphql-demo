package com.example.demo.service;

import com.example.demo.model.UserExample;
import com.example.demo.model.User;
import com.github.liyiorg.mbg.support.service.MbgReadService;
import com.github.liyiorg.mbg.support.service.MbgWriteService;
import com.github.liyiorg.mbg.support.service.MbgUpsertService;

public interface UserService extends MbgReadService<Integer, User, User, UserExample>,MbgWriteService<Integer, User, User, UserExample>,MbgUpsertService<Integer, User, User, UserExample>{
	
	public int userRegist(User user);
}