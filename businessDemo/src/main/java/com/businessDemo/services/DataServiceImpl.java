package com.businessDemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.businessDemo.dao.DataDao;
import com.businessDemo.domain.User;

public class DataServiceImpl implements DataService {

	@Autowired
	DataDao<User, Integer> dataDao;

	public int insertRow(User user) {
		return dataDao.insertRow(user);
	}

	public List<User> getList() {
		return dataDao.getList(User.class);
	}

	public int updateRow(User user) {
		return dataDao.updateRow(user);
	}

	public int deleteRow(int id) {
		return dataDao.deleteRow(User.class, id);
	}

	public User getRowById(int id) {
		return (User) dataDao.getRowById(User.class, id);
	}

}
