/**
 * 创建时间：2019年9月30日
 * 所在包：com.itbjx.DeptProvider8001_App.java
 * 创建者：@author bjx
 */
package com.itbjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //本服务启动后将自动注册进eurekar服务中心
public class DeptProvider8002_App {

	public static void main(String[] args) {

		SpringApplication.run(DeptProvider8002_App.class, args);
	}

}
