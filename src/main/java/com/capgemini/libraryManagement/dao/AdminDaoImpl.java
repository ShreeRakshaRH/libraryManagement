package com.capgemini.libraryManagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.libraryManagement.beans.User;

public class AdminDaoImpl implements AdminDao {

	@Override
	public User adminLogin(User admin) {
		private static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		User admin = null;
		try {
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery("FROM User WHERE id=:id and password=:password", User.class);
			this.id=user.getUserId();
			query.setParameter("id", user.getUserId());
			query.setParameter("password",user.getUserPassword());
			admin=(User) query.getSingleResult();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return admin;		
	}
		return null;
	}

	@Override
	public Boolean registerLibrarian(User librarian) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean searchUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean searchLibrarian(String LibrarianId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteLibrarian(String LibrarianId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllLibrarian() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
