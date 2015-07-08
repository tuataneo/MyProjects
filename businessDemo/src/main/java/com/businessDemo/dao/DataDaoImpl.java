package com.businessDemo.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class DataDaoImpl<T, PK extends Serializable> implements DataDao<T, PK> {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public int insertRow(T t) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(t);
		tx.commit();
		Serializable id = session.getIdentifier(t);
		session.close();
		return (Integer) id;
	}

	@SuppressWarnings("unchecked")
	public int deleteRow(final Class<T> type, int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		T t = (T) session.load(type, id);
		session.delete(session.load(type, id));
		tx.commit();
		Serializable ids = session.getIdentifier(t);
		session.close();
		return (Integer) ids;
	}

	@SuppressWarnings("unchecked")
	public List<T> getList(final Class<T> type) {
		Session session = sessionFactory.openSession();
		final Criteria crit = session.createCriteria(type);
		return crit.list();
	}

	@SuppressWarnings("unchecked")
	public <T> T getRowById(final Class<T> type, PK id) {
		Session session = sessionFactory.openSession();
		return (T) session.get(type, id);
	}

	public int updateRow(T t) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(t);
		tx.commit();
		Serializable id = session.getIdentifier(t);
		session.close();
		return (Integer) id;
	}
}
