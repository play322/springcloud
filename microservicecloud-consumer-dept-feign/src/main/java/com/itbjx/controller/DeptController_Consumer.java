/**
 * 创建时间：2019年9月30日
 * 所在包：com.itbjx.controller.DeptController_Consumer.java
 * 创建者：@author bjx
 */
package com.itbjx.controller;

import java.util.List;

import com.itbjx.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.itbjx.bean.Dept;

import javax.annotation.Resource;

@RestController
public class DeptController_Consumer {
	

	@Resource
	private DeptClientService deptClientService;

	@RequestMapping(value="consumer/dept/add")
	public boolean add(Dept dept) {

		return this.deptClientService.add(dept);
	}

	@RequestMapping(value="consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.deptClientService.get(id);
	}

	@RequestMapping(value="consumer/dept/list")
	public List<Dept> list() {
		return this.deptClientService.list();
	}
}
