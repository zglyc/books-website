package com.books.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* @ClassName: DbUtil
* @Description: �������ݿ�
* @author ���³�
* @date 2018��11��9������4:15:38
*
*/
public class DbUtil {
	
	public Connection getCon() throws Exception{
		Class.forName(PropertiesUtil.getValue("jdbcName"));
		Connection con=DriverManager.getConnection(PropertiesUtil.getValue("dbUrl"),PropertiesUtil.getValue("dbUserName"),PropertiesUtil.getValue("dbPassword"));
		return con;
	}
	//�ر����ݿ�
	public void colseCon(Connection con) throws Exception{
		if(con!=null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("���ݿ����ӳɹ���");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
