package com.techbuzzblogs.designpattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDesignPatternMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		/*
		 * Thread t1 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { JDBCUtil obj1 = JDBCUtil.getObject(); } });
		 * Thread t2 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { JDBCUtil obj2 = JDBCUtil.getObject(); } });
		 * 
		 * t1.start(); t2.start();
		 */
		
	
		
		/*
		 * File file = new File("D:\\file\\sample.txt");
		 * 
		 * FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos =
		 * new ObjectOutputStream(fos); oos.writeObject(obj1);
		 * 
		 * FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new
		 * ObjectInputStream(fis); obj2 = (JDBCUtil) ois.readObject();
		 */
		/*
		 * JDBCUtil obj1 = JDBCUtil.getObject();
		 * 
		 * System.out.println("obj1=>"+obj1.hashCode());
		 * 
		 * JDBCUtil obj2 = null;
		 * 
		 * Constructor[] construtors = JDBCUtil.class.getDeclaredConstructors();
		 * for(Constructor constructor :construtors) { constructor.setAccessible(true);
		 * obj2 = (JDBCUtil) constructor.newInstance(); }
		 * 
		 * 
		 * System.out.println("obj2=>"+obj2.hashCode());
		 */
		
		JDBCUtilEnum obj1 = JDBCUtilEnum.INSTANCE;
		JDBCUtilEnum obj2 = JDBCUtilEnum.INSTANCE;
		System.out.println("obj1=>"+obj1.hashCode());
		System.out.println("obj2=>"+obj2.hashCode());
		obj1.show();
		
		
	}
}
