/**
 * 创建时间：2019年9月30日
 * 所在包：com.itbjx.cfgbeans.ConfigBean.java
 * 创建者：@author bjx
 */
package com.itbjx.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced  //SpringCloud Ribbon是基于NetFlix Ribbon 实现的一套客户端 负载均衡的工具。
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	//Ribbond的负载均衡默认算法是轮询，想要切换算法，new一个算法即可，如下
	@Bean
	public IRule myRule() {
		//return new RandomRule(); //随机算法代替默认的轮询
		//先是轮询算法，当众多微服务中有一个宕机时，获取服务失败时，在指定的时间内自动获取其他可用的服务
		return new RetryRule();
	}
	


}
