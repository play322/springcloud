/**
 * 创建时间：2019年9月29日
 * 所在包：com.itbjx.dao.DeptDao.java
 * 创建者：@author bjx
 */
package com.itbjx.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.itbjx.bean.Dept;

@Mapper
public interface DeptDao {

	public boolean add(Dept dept);

	public Dept findById(Long id);

	public List findAll();
}
