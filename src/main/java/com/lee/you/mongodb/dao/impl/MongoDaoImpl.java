package com.lee.you.mongodb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.lee.you.mongodb.dao.IMongoDao;
import com.lee.you.mongodb.model.User;

@Repository("mongoDao")
public class MongoDaoImpl implements IMongoDao
{
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<User> listAll()
	{
		return mongoTemplate.findAll(User.class, "user");
	}
}
