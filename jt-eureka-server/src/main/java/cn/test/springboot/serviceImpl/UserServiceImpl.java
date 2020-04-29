package cn.test.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.test.springboot.mapper.UserMapper;
import cn.test.springboot.pojo.User;
import cn.test.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	//��ѯ����
	public List<User> find(){
		return userMapper.find();
	}
	
	public User get(Integer id) {
		return userMapper.get(id);
	}
	
	public void insert(User user) {
		userMapper.insert(user);
	}
	
	public void update(User user) {
		userMapper.update(user);
	}
}
