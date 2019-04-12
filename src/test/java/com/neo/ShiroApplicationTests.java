package com.neo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ShiroApplication;
import com.neo.model.UserInfo;
import com.neo.sevice.UserInfoService;

/**
 * 数据业务层测试类
 * @author Administrator
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShiroApplication.class)
public class ShiroApplicationTests {
	
	@Autowired
	private UserInfoService service;
	
	
	//测试通过
	/**
	 * 测试姓名查询，自写sql
	 */
	@Test
	public void findByNamesql() {
		ArrayList<UserInfo> list = (ArrayList<UserInfo>) service.queryByNameUseSQL("张春艺");
		for (UserInfo UserInfo : list) {
			System.out.println(UserInfo);
		}
	}
	//测试通过
	/**
	 * 测试排序查询，springDate的PagingAndSortingRepository接口已经封装好的
	 */
	@Test
	public void findBySort() {
		ArrayList<UserInfo> list = (ArrayList<UserInfo>) service.selectBySort("uid");
		for (UserInfo user : list) {
			System.out.println(user);
		}
	}
	
	//测试通过
	/**
	 * 测试分页查询 springDate的PagingAndSortingRepository接口已经封装好的
	 */
	@Test
	public void findByPage() {
		Page<UserInfo> page= service.selectByPage(0,2);
		System.out.println("总条数："+page.getTotalElements());
		System.out.println("总页数"+page.getTotalPages());
		List<UserInfo> list = page.getContent();
		for (UserInfo UserInfos : list) {
			System.out.println(UserInfos);
		}
	}
	
	
	
	//测试通过
	/**
	 * 测试分页+排序查询 springDate的PagingAndSortingRepository接口已经封装好的
	 * 只需要继承该接口就好了
	 */
	@Test
	public void findByPageAndSort() {
		Page<UserInfo> page= service.selectBySortAndPage(0, 3, "uid");
		System.out.println("总条数："+page.getTotalElements());
		System.out.println("总页数"+page.getTotalPages());
		List<UserInfo> list = page.getContent();
		for (UserInfo UserInfos : list) {
			System.out.println(UserInfos);
		}
	}
	
	//测试通过
	@Test
	public void update() {
		boolean bool = service.updat("杨建忠", 2);
		System.out.println(bool);
	}
	
	
	//测试通过
	@Test
	public void saveUserInfo() {
		UserInfo UserInfo = new UserInfo();
		UserInfo.setUsername("");
		UserInfo.setPassword("");
		UserInfo.setState((byte) 0);
		UserInfo.setName("张春艺");
		boolean bool = service.saveUser(UserInfo);
		System.out.println(bool);
	}
	
	//测试通过
	@Test
	public void deleteUser() {
		
		service.deleteUser(3);
	
	}

}
