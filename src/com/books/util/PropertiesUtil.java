package com.books.util;

import java.io.InputStream;
import java.util.Properties;


/**
* @ClassName: PropertiesUtil
* @Description: ��װ�������ݿ����Ϣ
* @author ���³�
* @date 2018��11��9������4:14:56
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
