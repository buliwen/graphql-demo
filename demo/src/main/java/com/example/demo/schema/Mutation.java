package com.example.demo.schema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.User;
import com.example.demo.schema.input.UserInput;
import com.example.demo.schema.type.Result;
import com.example.demo.service.UserService;

@Component
public class Mutation implements GraphQLMutationResolver {
	
	@Autowired
	UserService userService;
	
	public Result userRegist(UserInput input) {
		User user = new User();
		user.setId(input.getId());
		user.setName(input.getName());
		user.setAge(input.getAge());
		user.setIntro(input.getIntro());
		return new Result(userService.userRegist(user));
	}
}
