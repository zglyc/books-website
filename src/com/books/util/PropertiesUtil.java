package com.books.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author lyc
 * 
 * ��װ�������ݿ����Ϣ
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
