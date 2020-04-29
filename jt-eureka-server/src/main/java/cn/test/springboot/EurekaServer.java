package cn.test.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@MapperScan(basePackages="cn.test.springboot.mapper")
public class EurekaServer {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}
}
