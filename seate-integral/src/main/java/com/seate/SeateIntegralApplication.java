package com.seate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 积分服务
 * @author xianzhixianzhixian
 * @date 2022/2/16 23:15
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SeateIntegralApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeateIntegralApplication.class, args);
    }
}
