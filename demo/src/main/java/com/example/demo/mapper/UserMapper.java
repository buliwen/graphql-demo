package com.example.demo.mapper;

import com.example.demo.model.User;
import com.example.demo.model.UserExample;
import com.github.liyiorg.mbg.support.mapper.MbgReadMapper;
import com.github.liyiorg.mbg.support.mapper.MbgWriteMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MbgReadMapper<Integer, User, User, UserExample>, MbgWriteMapper<Integer, User, User, UserExample> {
}