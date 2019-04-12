package com.neo.sevice;

import java.util.List;

import org.springframework.data.domain.Page;

import com.neo.model.UserInfo;

public interface UserInfoService {
	/**
	 * 通个账号查询一条用户信息
	 * @param username
	 * @return
	 */
    public UserInfo findByUsername(String username);
    /**
	 * 自定义sql,通过名字查询所有数据
	 * @param name
	 * @return
	 */
	List<UserInfo> queryByNameUseSQL(String name);
	
	/**
	 * 通过id修改姓名
	 * @param name
	 * @param id
	 */
	boolean updat(String name,Integer id);
	
	/**
	 * 排序查询查询user
	 * @return
	 */
	List<UserInfo> selectBySort(String ziduan);
	
	/**
	 * 分页查询查询user
	 * @return
	 */
	Page<UserInfo> selectByPage(int dangqianye,int yeshu);
	/**
	 * 分页+排序查询查询user
	 * @return
	 */
	Page<UserInfo> selectBySortAndPage(int dangqianye,int yeshu,String ziduan);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	boolean saveUser(UserInfo user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	void deleteUser(Integer id);
	
	
	
}