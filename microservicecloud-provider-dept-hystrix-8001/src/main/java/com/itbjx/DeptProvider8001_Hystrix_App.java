/**
 * 创建时间：2019年9月30日
 * 所在包：com.itbjx.DeptProvider8001_App.java
 * 创建者：@author bjx
 */
package com.itbjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient  //本服务启动后将自动注册进eurekar服务中心
@EnableCircuitBreaker   //开启断路器
public class DeptProvider8001_Hystrix_App {

	public static void main(String[] args) {

		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}

}
