/**
 * 创建时间：2019年9月30日
 * 所在包：com.itbjx.DeptConsumer80_App.java
 * 创建者：@author bjx
 */
package com.itbjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient  //微服务的客户端
@EnableFeignClients(basePackages= {"com.itbjx"})
public class DeptConsumer80_Feign_App {

	public static void main(String[] args) {

		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}

}
