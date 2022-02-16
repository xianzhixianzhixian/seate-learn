package com.seate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 订单服务
 * @author xianzhixianzhixian
 * @date 2022/2/16 23:17
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SeateOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeateOrderApplication.class, args);
    }
}
