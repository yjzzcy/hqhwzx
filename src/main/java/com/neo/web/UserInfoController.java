package com.neo.web;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neo.model.UserInfo;
import com.neo.sevice.UserInfoService;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	@Autowired
	private UserInfoService service;
	
	UserInfo user = new UserInfo();
    
	
	
	/**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(Model model){
    	List<UserInfo> list = new ArrayList<>();
		Page<UserInfo> page = service.selectBySortAndPage(0, 3, "uid");
		list = page.getContent();
		
		int zongyeshu = page.getTotalPages();
		long zongtiaoshu = page.getTotalElements();
		System.out.println("总页数： "+zongyeshu);
		System.out.println("总条数： "+zongtiaoshu);
		
		model.addAttribute("list", list);
		model.addAttribute("zongyeshu", zongyeshu);
		model.addAttribute("zongtiaoshu", zongtiaoshu);

        return "userInfo";
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
        return "userInfoDel";
    }
    
    
    /**
     * 模型页面主页;
     * @return
     */
    @RequestMapping("/model")
  
    public String model(){
        return "model/index";
    }
    
   
    
}