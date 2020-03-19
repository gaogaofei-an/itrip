package com.whackon.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>爱旅行-注册中心启动类</b>
 * @author ggf
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerStarter {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerStarter.class, args);
	}
}
