package com.ssafy.myhome.apt.model.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ssafy.myhome.apt.model.AptDto;
import com.ssafy.myhome.apt.model.DealDto;

public interface AptMapper {
	List<AptDto> getApt(Map	<String,String> map) throws SQLException;
	void saveKeyword(Map<String,String> map) throws SQLException;
	List<DealDto> dealSearch(String aptCode) throws SQLException;
}
