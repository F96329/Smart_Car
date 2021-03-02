package cn.ekgc.July;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *<b>智慧公务车信息平台-用户功能模块-provider 启动类</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaClient
@MapperScan("cn.ekgc.July.dao")
@SpringBootApplication
public class UserProviderAStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserProviderAStarter.class,args);
	}
}
