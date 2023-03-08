package com.cp.license.trans.utils;

import org.apache.ibatis.session.SqlSession;

import com.cp.license.trans.dao.Rec_STMapper;
import com.cp.license.trans.model.Rec_ST;

public class Rec_STUtils {
	public static Rec_ST findByName(String name) {
		SqlSession session = MybatisUtils.getSqlSession();
		Rec_STMapper mapper = session.getMapper(Rec_STMapper.class);
		Rec_ST rst = mapper.findByName(name);
		session.close();
		return rst;
	}
}
