package com.neo.sevice.impl;

import com.neo.dao.UserInfoDao;
import com.neo.dao.UsersRepositoryPagingAndSorting;
import com.neo.dao.UsersRepositoryQueryAnnotation;
import com.neo.model.UserInfo;
import com.neo.sevice.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao crudDao;
    @Autowired
	private UsersRepositoryQueryAnnotation dao;
	@Autowired
	private UsersRepositoryPagingAndSorting daoPageAndSort;
	
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return crudDao.findByUsername(username);
    }
	@Override
	public List<UserInfo> queryByNameUseSQL(String name) {
		// TODO Auto-generated method stub
		return dao.queryByNameUseSQL(name);
	}
	
	@Override
	@Transactional //@Transactional与@Test 一起使用时 事务是自动回滚的。
	@Rollback(false) //取消自动回滚
	public boolean updat(String name, Integer id) {
		// TODO Auto-generated method stub
		return dao.updat(name, id)==0?false:true;
	}
	@Override
	public List<UserInfo> selectBySort(String ziduan) {
		// TODO Auto-generated method stub
		
		//Order 定义排序规则
		Order order = new Order(Direction.DESC,ziduan);
		//Sort对象封装了排序规则
		Sort sort = new Sort(order);
		ArrayList<UserInfo> list = (ArrayList<UserInfo>) daoPageAndSort.findAll(sort);
		
		return list;
	}
	@Override
	public Page<UserInfo> selectByPage(int dangqianye, int yeshu) {
		// TODO Auto-generated method stub
		//Pageable:封装了分页的参数，当前页，每页显示的条数。注意：他的当前页是从0开始。
		//PageRequest(page,size) page:当前页。size:每页显示的条数
		Pageable pageable = new PageRequest(dangqianye, yeshu);
	    Page<UserInfo> page = this.daoPageAndSort.findAll(pageable);
		return page;
	}

	/**
	 * 
	 * Direction.DESC:排序规则，这个是降序,可自行设置成参数
	 * id:排序规则，根据id排序，可自行设置成参数
	 * 0：当前页数，可自行设置成参数
	 * 3:每页显示条数
	 */
	@Override
	public Page<UserInfo> selectBySortAndPage(int dangqianye,int yeshu,String ziduan) {
		// TODO Auto-generated method stub
		Sort sort = new Sort(new Order(Direction.DESC, ziduan));
		
		Pageable pageable = new PageRequest(dangqianye, yeshu, sort);	
		Page<UserInfo> page = this.daoPageAndSort.findAll(pageable);
		return page;
	}
	@Override
	@Transactional //@Transactional与@Test 一起使用时 事务是自动回滚的。
	@Rollback(false) //取消自动回滚
	public boolean saveUser(UserInfo user) {
		// TODO Auto-generated method stub
		if(crudDao.save(user) != null) {//CrudRepository中自动封装的保存方法
			return true;
		}
		return false;
	}
	@Override
	@Transactional //@Transactional与@Test 一起使用时 事务是自动回滚的。
	@Rollback(false) //取消自动回滚
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		crudDao.deleteById(id);//CrudRepository中自动封装的删除方法
	}

}