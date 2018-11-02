package com.wx.springboot3.dao;

import com.wx.springboot3.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into user(name, age, addr) values(#{name}, #{age},#{addr})")
    int add(@Param("name") String name, @Param("age") Integer age, @Param("addr") String addr);

    @Update("update user set name = #{name}, age = #{age},addr=#{addr} where id = #{id}")
    int update(@Param("name") String name, @Param("age") Integer age,@Param("addr") String addr, @Param("id") int  id);
    @Delete("delete from user where id = #{id}")
    int delete(int id);
    @Select("select id, name as name, age as age ,addr as addr from user where id = #{id}")
    User findAccount(@Param("id") int id);
    @Select("select id, name as name, age as age,addr as addr from user")
    List<User> findAccountList();
}
