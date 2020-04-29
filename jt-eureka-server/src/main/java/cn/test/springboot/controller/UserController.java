package cn.test.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.test.springboot.pojo.User;
import cn.test.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/find")
	public List<User> find(){
		return userService.find();
	}
	
	
	@RequestMapping("get/{id}")
	public User get(@PathVariable Integer id) {
		return userService.get(id);
	}
	
	@RequestMapping("insert/{name}/{birthday}/{address}")
	public String insert(User user) {
		try {
			userService.insert(user);
			return "sucesse";
		}catch(Exception e) {
			return "fail";
		}
	}
	
	@RequestMapping("update/{id}/{name}/{birthday}/{address}")
	public String update(User user) {
		try {
			userService.update(user);
			return "sucesse";
		}catch(Exception e) {
			return "fail";
		}
	}
	
}
