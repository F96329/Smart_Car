package cn.ekgc.July;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *<b>智慧公务车信息平台-注册中心启动类</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class JulyRegistryCenterStarter {
	public static void main(String[] args) {
		SpringApplication.run(JulyRegistryCenterStarter.class,args);
	}
}
