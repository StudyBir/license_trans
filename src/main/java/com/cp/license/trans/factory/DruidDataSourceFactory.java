package com.cp.license.trans.factory;

import java.sql.SQLException;

import javax.sql.DataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import com.alibaba.druid.pool.DruidDataSource;

public class DruidDataSourceFactory extends UnpooledDataSourceFactory {
	public DruidDataSourceFactory() {
		this.dataSource = new DruidDataSource();
	}

	/**
	 * 重写getDataSource
	 */
	@Override
	public DataSource getDataSource() {
		try {
			((DruidDataSource) this.dataSource).init();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.dataSource;
	}
}
