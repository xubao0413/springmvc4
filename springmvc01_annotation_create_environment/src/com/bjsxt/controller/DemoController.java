package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 使用注解方式搭建环境，就不需要implements Controller了
 * 它会找@RequestMapping注解里面的值，跟访问的url进行对应执行
 * @author xubao
 */
@Controller
public class DemoController {
	
	@RequestMapping("demo")
	public String demo(){
		System.out.println("执行demo");
		return "main";
	}
	
	@RequestMapping("demo2")
	public String demo2(){
		System.out.println("demo2");
		return "main1";
	}
}
