/**
 * 创建时间：2019年9月29日
 * 所在包：com.itbjx.dao.DeptDao.java
 * 创建者：@author bjx
 */
package com.itbjx.dao;

import com.itbjx.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

	public boolean add(Dept dept);

	public Dept findById(Long id);

	public List findAll();
}
