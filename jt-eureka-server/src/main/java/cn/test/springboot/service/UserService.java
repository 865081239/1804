package cn.test.springboot.service;

import java.util.List;

import cn.test.springboot.pojo.User;

public interface UserService {
	public List<User> find();
	
	public User get(Integer id);
	
	public void insert(User user);
	
	public void update(User user);
}
