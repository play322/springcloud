/**
 * 创建时间：2019年9月29日
 * 所在包：com.itbjx.service.impl.DeptServiceImpl.java
 * 创建者：@author bjx
 */
package com.itbjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbjx.bean.Dept;
import com.itbjx.dao.DeptDao;
import com.itbjx.service.DeptServie;

@Service
public class DeptServiceImpl implements DeptServie {
	@Autowired
	private DeptDao daptDao;

	@Override
	public boolean add(Dept dept) {
		
		return daptDao.add(dept);
	}

	@Override
	public Dept get(Long id) {
		
		return daptDao.findById(id);
	}

	@Override
	public List list() {
		
		return daptDao.findAll();
	}

}
