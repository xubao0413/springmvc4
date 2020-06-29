package com.bjsxt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bjsxt.pojo.Demo;
import com.bjsxt.pojo.People;

@Controller
public class DemoController {
	
	@RequestMapping("demo")
    public String demo(String name,int age){
        System.out.println("执行demo"+" "+name+" "+age);
        return "main.jsp";
    }
	
	@RequestMapping("demo1")
	public String demo1(String name,@RequestParam(value="age1")int age){
	    System.out.println("执行demo1"+" "+name+" "+age);
	    return "main.jsp";
	}
	
	@RequestMapping("page")
	public String page(@RequestParam(defaultValue="2")int pageSize,@RequestParam(defaultValue="1")int pageNumber){
	    System.out.println("执行page"+" "+pageSize+" "+pageNumber);
	    return "main.jsp";
	}
	
	@RequestMapping("demo2")
	public String demo2(@RequestParam(required=true)String name){
	    System.out.println("name 是SQL 的查询条件,必须要传递name 参数"+name);
	    return "main.jsp";
	}
	
	@RequestMapping("demo4")
	public String demo4(People peo){
		System.out.println("执行demo4"+" "+peo);
	    return "main.jsp";
	}
	
	@RequestMapping("demo5")
	public String demo5(String name,int age,@RequestParam("hover")List<String> abc){
	    System.out.println("执行demo5"+" "+name+" "+age+" "+abc);
	    return "main.jsp";
	}
	
	@RequestMapping("demo6")
	public String demo6(Demo demo){
	    System.out.println("执行demo6"+" "+demo);
	    return "main.jsp";
	}
	
	@RequestMapping("demo7")
	public String demo7(Demo demo){
	    System.out.println("执行demo7"+" "+demo);
	    return "main.jsp";
	}
	
	@RequestMapping("demo8/{id1}/{name}")
	public String demo8(@PathVariable String name,@PathVariable("id1") int age){
	    System.out.println("执行demo7"+" "+name +" "+age);
	    return "/main.jsp";
	}

}
