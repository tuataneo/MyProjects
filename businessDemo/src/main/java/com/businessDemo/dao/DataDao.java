package com.businessDemo.dao;

import java.io.Serializable;
import java.util.List;

public interface DataDao<T, PK extends Serializable> {
	public int insertRow(T t);

	public List<T> getList(final Class<T> type);

	public <T> T getRowById(final Class<T> type, PK id);

	public int updateRow(T t);

	public int deleteRow(final Class<T> type, int id);
}
