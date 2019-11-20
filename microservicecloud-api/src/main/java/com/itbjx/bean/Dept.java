/**
 * 创建时间：2019年9月29日
 * 所在包：com.itbjx.bean.Dept.java
 * 创建者：@author bjx
 */
package com.itbjx.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
   //无参构造
@Data                //set/get方法
@Accessors(chain=true) //链式风格访问
public class Dept implements Serializable{
	
	private Long deptno; // 主键
	private String dname; // 部门名称
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(Long deptno, String dname, String db_source) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}

	
	
	
}
