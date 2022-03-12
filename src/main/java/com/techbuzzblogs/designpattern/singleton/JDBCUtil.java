package com.techbuzzblogs.designpattern.singleton;

import java.io.Serializable;

public class JDBCUtil implements Serializable{
	static JDBCUtil obj;

	private JDBCUtil() {
		System.out.println("Object created...");
	}
	
	public static JDBCUtil getObject() {
			synchronized(JDBCUtil.class) {
				if(obj == null) {
					obj = new JDBCUtil();
				}
		}
		return obj;
	}
	
	private Object readResolve() {
		return obj;
	}

	
	
}
