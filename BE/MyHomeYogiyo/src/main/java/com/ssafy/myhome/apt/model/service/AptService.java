package com.ssafy.myhome.apt.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.ssafy.myhome.apt.model.AptDto;
import com.ssafy.myhome.apt.model.DealDto;

public interface AptService {
	List<AptDto> getApt(Map<String,String> map) throws Exception;
	void saveKeyword(String keyword,String userId) throws Exception;
	List<DealDto> dealSearch(String aptCode) throws Exception;
}
