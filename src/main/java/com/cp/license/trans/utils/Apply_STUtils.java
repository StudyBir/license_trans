package com.cp.license.trans.utils;

import org.apache.ibatis.session.SqlSession;

import com.cp.license.trans.dao.Apply_STMapper;
import com.cp.license.trans.model.Apply_ST;

public class Apply_STUtils {
	
	public static Apply_ST findByName(String name) {
		SqlSession session = MybatisUtils.getSqlSession();
		Apply_STMapper mapper = session.getMapper(Apply_STMapper.class);
		Apply_ST ast = mapper.findByName(name);
		session.close();
		return ast;
	}

}
