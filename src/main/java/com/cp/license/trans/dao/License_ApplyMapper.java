package com.cp.license.trans.dao;

import org.apache.ibatis.annotations.Param;

import com.cp.license.trans.model.License_Apply;

public interface License_ApplyMapper {

	int useCount(String name);
	
	int insert(License_Apply la);
	
	int update(@Param(value="Id") int Id, @Param(value="EndTime") String EndTime);

}
