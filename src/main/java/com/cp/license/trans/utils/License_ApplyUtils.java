package com.cp.license.trans.utils;

import org.apache.ibatis.session.SqlSession;
import com.cp.license.trans.dao.License_ApplyMapper;
import com.cp.license.trans.model.License_Apply;

public class License_ApplyUtils {

	public static int useCount(String name) {
		SqlSession session = MybatisUtils.getSqlSession();
		License_ApplyMapper mapper = session.getMapper(License_ApplyMapper.class);
		int la = mapper.useCount(name);
		session.close();
		return la;
	}

	public static int insert(License_Apply la) {
		SqlSession session = MybatisUtils.getSqlSession();
		License_ApplyMapper mapper = session.getMapper(License_ApplyMapper.class);
		int Id = mapper.insert(la);
		session.close();
		return Id;
	}
	
	public static int update(int Id, String EndTime) {
		SqlSession session = MybatisUtils.getSqlSession();
		License_ApplyMapper mapper = session.getMapper(License_ApplyMapper.class);
		int res = mapper.update(Id, EndTime);
		session.close();
		return res;
	}
}
