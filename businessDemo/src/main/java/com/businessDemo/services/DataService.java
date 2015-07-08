package com.businessDemo.services;

import java.util.List;

import com.businessDemo.domain.User;

public interface DataService {
	public int insertRow(User user);

	public List<User> getList();

	public User getRowById(int id);

	public int updateRow(User user);

	public int deleteRow(int id);

}