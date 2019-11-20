/**
 * 创建时间：2019年9月29日
 * 所在包：com.itbjx.service.DeptServie.java
 * 创建者：@author bjx
 */
package com.itbjx.service;

import java.util.List;
import com.itbjx.bean.Dept;

public interface DeptServie {
	
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List list();
}
