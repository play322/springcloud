/**
 * 创建时间：2019年10月7日
 * 所在包：com.itbjx.EurekaServer7001_App.java
 * 创建者：@author bjx
 */
package com.itbjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EurekaServer7003_App.class, args);
	}

}
