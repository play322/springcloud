/**
 * 创建时间：2019年9月29日
 * 所在包：com.itbjx.controller.DeptController.java
 * 创建者：@author bjx
 */
package com.itbjx.controller;

import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itbjx.bean.Dept;
import com.itbjx.service.DeptServie;

@RestController
public class DeptController {
	
	@Autowired
	private DeptServie deptServie;
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptServie.add(dept);
	}

	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	//一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
	@HystrixCommand(fallbackMethod="processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = deptServie.get(id);
		if (dept==null){
			throw new RuntimeException("该ID"+id+"没有没有对应的信息");
		}
		return dept;
	}

	public Dept processHystrix_Get(@PathVariable("id") Long id){
		return new Dept().setDeptno(id)
						 .setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
				         .setDb_source("no this database in MySQL");
	}

	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		
		return deptServie.list();
	}

}
