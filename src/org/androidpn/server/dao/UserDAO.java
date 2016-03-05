package org.androidpn.server.dao;

import java.util.List;

import javax.annotation.Resource;

import org.androidpn.server.model.User;
import org.androidpn.server.service.UserNotFoundException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

public class UserDAO extends SqlMapClientDaoSupport{

	public User getUser(Long id) {
		return (User) getSqlMapClientTemplate().queryForObject("user.getUserById", id);
	}

	public User saveUser(User user) {
		if (user != null) {
			if (user.getId() != null) {
				User temp = getUser(user.getId());
				if (temp != null) {
					getSqlMapClientTemplate().update("user.updateUser", user);
				} else {
					Long id = (Long) getSqlMapClientTemplate().insert("user.insertUser", user);
					user.setId(id);
				}
			} else {
				Long id = (Long) getSqlMapClientTemplate().insert("user.insertUser", user);
				user.setId(id);
			}
			return user;
		} 
		return null;
	}

	public void removeUser(Long id) {
		getSqlMapClientTemplate().delete("user.deleteUser", id);
	}

	public boolean exists(Long id) {
		User temp = getUser(id);
		if (temp != null) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		return getSqlMapClientTemplate().queryForList("user.getUserList");
	}

	public User getUserByUsername(String username) throws UserNotFoundException {
		return (User) getSqlMapClientTemplate().queryForObject("user.getUserByUsername", username);
	}

}