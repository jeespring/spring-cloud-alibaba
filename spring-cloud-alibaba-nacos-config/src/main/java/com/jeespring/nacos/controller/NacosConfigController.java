package com.jeespring.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NacosConfigController
 *
 * @author 张朝阳
 * @date 2022/1/1 16:09:09
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class NacosConfigController {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @RequestMapping("/jdbc")
    public String jdbc() {
        String jdbc = "url:" + url + "\n"
                + "username:" + username + "\n"
                + "password:" + password;
        return jdbc;
    }
}
