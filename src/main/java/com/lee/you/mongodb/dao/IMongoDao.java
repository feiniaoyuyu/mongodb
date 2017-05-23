package com.lee.you.mongodb.dao;

import java.util.List;

import com.lee.you.mongodb.model.User;

public interface IMongoDao
{
	/**
	 * 查找全部user
	 * @return
	 */
	public List<User> listAll();
}
