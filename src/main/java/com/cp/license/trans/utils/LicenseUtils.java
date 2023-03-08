package com.cp.license.trans.utils;

import org.apache.ibatis.session.SqlSession;

import com.cp.license.trans.dao.LicenseMapper;
import com.cp.license.trans.model.License;

public class LicenseUtils {
	public static License findByName(String name) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisUtils.getSqlSession();
		LicenseMapper mapper = session.getMapper(LicenseMapper.class);
		License license = mapper.findByName(name);
		session.close();
		return license;
	}
	
}
