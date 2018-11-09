package com.books.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* @ClassName: DbUtil
* @Description: 连接数据库
* @author 李勇超
* @date 2018年11月9日下午4:15:38
*
*/
public class DbUtil {
	
	public Connection getCon() throws Exception{
		Class.forName(PropertiesUtil.getValue("jdbcName"));
		Connection con=DriverManager.getConnection(PropertiesUtil.getValue("dbUrl"),PropertiesUtil.getValue("dbUserName"),PropertiesUtil.getValue("dbPassword"));
		return con;
	}
	//关闭数据库
	public void colseCon(Connection con) throws Exception{
		if(con!=null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("数据库连接成功！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
