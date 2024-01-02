package com.ssafy.myhome.apt.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.myhome.apt.model.AptDto;
import com.ssafy.myhome.apt.model.DealDto;

public interface AptService {
	List<AptDto> getApt(Map<String,String> map) throws Exception;
	void saveKeyword(String keyword,String userId) throws Exception;
	List<DealDto> dealSearch(String aptCode) throws Exception;
	void likeApt(String userId,String aptCode) throws Exception;
	List<Integer> getValidYear(String aptCode)	throws Exception;
	void deletelikeApt(Map<String, String> map) throws Exception;
}
