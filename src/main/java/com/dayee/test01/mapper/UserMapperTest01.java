package com.dayee.test01.mapper;

import com.dayee.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapperTest01 {

	// 查询语句
	@Select("SELECT * FROM t_user WHERE NAME = #{name}")
	User findByName(@Param("name") String name);

	// 添加
	@Insert("INSERT INTO t_user(NAME, AGE) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);
}
