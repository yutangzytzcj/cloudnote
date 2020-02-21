package cn.tedu.cloudnote.dao;

import cn.tedu.cloudnote.entity.User;

public interface UserDao {
	//  根据用户名查
	User findByName(String name);
	//  添加用户 注册
	void addUser(User user);
	// 根据用户修改密码
	void UpdatePwd(User user);
	
	//  查找用户根据id
	User findUserById(String userId);
}
