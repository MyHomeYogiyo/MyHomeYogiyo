package com.ssafy.myhome.apt.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.ssafy.myhome.apt.model.AptDto;

public interface AptService {
	List<AptDto> getApt(Map<String,String> map) throws Exception;
	void saveKeyword(String keyword,String userId) throws Exception;
}
