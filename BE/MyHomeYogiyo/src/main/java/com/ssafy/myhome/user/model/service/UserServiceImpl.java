package com.ssafy.myhome.user.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.myhome.user.model.UserDto;
import com.ssafy.myhome.user.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	UserMapper mapper; 
	
	public UserServiceImpl(UserMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@Override
	public UserDto login(UserDto userDto) throws Exception {
		System.out.println(userDto);
		System.out.println("login Service!!!!!!!!!");
		return mapper.login(userDto);
	}

	@Override
	public UserDto userInfo(String userId) throws Exception {
		System.out.println("userInfo Service!!!!!!!!!");
		return mapper.userInfo(userId);
	}

	@Override
	public void saveRefreshToken(String userId, String refreshToken) throws Exception {
		System.out.println("saveRefreshToken Service!!!!!!!!!");
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", userId);
		map.put("token", refreshToken);
		mapper.saveRefreshToken(map);

	}

	@Override
	public Object getRefreshToken(String userId) throws Exception {
		System.out.println("getRefreshToken Service!!!!!!!!!");
		return mapper.getRefreshToken(userId);
	}

	@Override
	public void deleRefreshToken(String userId) throws Exception {
		System.out.println("deleRefreshToken Service!!!!!!!!!");
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", userId);
		map.put("token", null);
		mapper.deleteRefreshToken(map);
	}

	@Override
	public void regist(UserDto userDto) throws Exception {
		System.out.println("Regist Service");
		mapper.regist(userDto); 
		
	}

	@Override
	public void modifyPassword(String userId) throws Exception {
		mapper.modifyPassword(userId); 
	}

	@Override
	public void deleteUser(String userId) throws Exception {
		mapper.deleteUser(userId); 
		
	}

}
