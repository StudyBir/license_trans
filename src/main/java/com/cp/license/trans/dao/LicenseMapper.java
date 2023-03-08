package com.cp.license.trans.dao;

import com.cp.license.trans.model.License;

public interface LicenseMapper {

	License findByName(String name);
	
}
