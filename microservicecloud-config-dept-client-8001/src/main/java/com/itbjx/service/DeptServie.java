/**
 * 创建时间：2019年9月29日
 * 所在包：com.itbjx.service.DeptServie.java
 * 创建者：@author bjx
 */
package com.itbjx.service;

import com.itbjx.bean.Dept;

import java.util.List;

public interface DeptServie {
	
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List list();
}
