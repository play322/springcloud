/**
 * 创建时间：2019年9月30日
 * 所在包：com.itbjx.DeptConsumer80_App.java
 * 创建者：@author bjx
 */
package com.itbjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient  //微服务的客户端
@SpringBootApplication
public class DeptConsumer80_App {

	public static void main(String[] args) {

		SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
