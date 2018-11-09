package com.books.util;

import java.io.InputStream;
import java.util.Properties;


/**
* @ClassName: PropertiesUtil
* @Description: 封装连接数据库的信息
* @author 李勇超
* @date 2018年11月9日下午4:14:56
*
*/
public class PropertiesUtil {
	
	public static String getValue(String key) {
		Properties pt=new Properties();
		InputStream in=new PropertiesUtil().getClass().getResourceAsStream("/jdbc.properties");
		try {
			pt.load(in);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return pt.getProperty(key);
	}

}
