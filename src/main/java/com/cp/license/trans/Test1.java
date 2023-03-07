package com.cp.license.trans;

import org.apache.ibatis.session.SqlSession;

import com.cp.license.trans.dao.LicenseMapper;
import com.cp.license.trans.model.License;
import com.cp.license.trans.utils.MybatisUtils;

public class Test1 {

	public static void main(String[] args) {
		SqlSession session = MybatisUtils.getSqlSession();
		 
        LicenseMapper mapper = session.getMapper(LicenseMapper.class);
 
        License license = mapper.findByName("aaa");
 
        System.out.println(license);
 
        //SqlSession对象用完即销毁
        session.close();
	}

}
