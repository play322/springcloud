/**
 * 创建时间：2019年9月29日
 * 所在包：com.itbjx.controller.DeptController.java
 * 创建者：@author bjx
 */
package com.itbjx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Dept get(@PathVariable("id") Long id) {
		
		return deptServie.get(id);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		
		return deptServie.list();
	}

}
