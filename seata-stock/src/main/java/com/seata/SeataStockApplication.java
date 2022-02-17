package com.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 仓储服务
 * @author xianzhixianzhixian
 * @date 2022/2/16 23:19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SeataStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataStockApplication.class, args);
    }
}
