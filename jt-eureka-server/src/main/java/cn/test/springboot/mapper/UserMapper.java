package cn.test.springboot.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.test.springboot.pojo.User;

public interface UserMapper {
	//<select id="find" resultType="User">
	public List<User> find();
	
	@Select("select * from user where id = #{id}")
	public User get(@Param("id") Integer id);
	
	@Insert("INSERT  INTO `user`(`ID`,`NAME`,`BIRTHDAY`,`ADDRESS`) VALUES (null,#{name},#{birthday},#{address});")
	public void insert(User user);
	
	@Update("update user set name=#{name},birthday=#{birthday},address=#{address}"
			+ "where id = #{id}")
	public void update(User user);
}
