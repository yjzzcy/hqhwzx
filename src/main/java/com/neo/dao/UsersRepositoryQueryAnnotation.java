package com.neo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.neo.model.UserInfo;




/**
 * Repository   @Query
 *
 *
 */

public interface UsersRepositoryQueryAnnotation extends Repository<UserInfo, Integer> {
	
	/**
	 * 通个名字查询用户信息,完全自写的sql
	 * @param name
	 * @return
	 */
	@Query(value="select * from user_info where name = ?",nativeQuery=true)
	List<UserInfo> queryByNameUseSQL(String name);
	
	/**
	 * 通个名字查询用户一条信息,完全自写的sql
	 * @param name
	 * @return
	 */
	@Query(value="select * from user_info where name = ?",nativeQuery=true)
	UserInfo queryBynameSQL(String name);
	
	
	/**
	 * 通个id修改用户名
	 * @param name
	 * @param id
	 * @return
	 */
	@Query(value="update user_info set name  = ? where uid  = ?",nativeQuery=true)
	@Modifying //需要执行一个更新操作
	int updat(String name,Integer id);
	
	
	
}
