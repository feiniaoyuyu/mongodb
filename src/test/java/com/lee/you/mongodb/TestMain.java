package com.lee.you.mongodb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.you.mongodb.dao.IMongoDao;

public class TestMain
{
	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext-mongo.xml");
		IMongoDao dao = (IMongoDao)context.getBean("mongoDao");
		System.out.println(dao.listAll());
	}
}
