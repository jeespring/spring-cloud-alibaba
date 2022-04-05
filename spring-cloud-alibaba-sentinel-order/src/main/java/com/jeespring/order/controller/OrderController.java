package com.jeespring.order.controller;

import com.jeespring.order.feign.AccountFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * OrderController
 *
 * @author 张朝阳
 * @date 2022/2/20 22:47:47
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private AccountFeignService accountFeignService;

    @RequestMapping("/create")
    public String create(@RequestParam("userId") long userId, @RequestParam("money") long money) {
        long orderNumber = System.currentTimeMillis();
        String result = "用户" + userId + "创建订单成功，订单号" + orderNumber + "\n";
        String account = accountFeignService.deduct(userId, money);
        return result + account;
    }

    @RequestMapping("/account")
    public String account(@RequestParam("userId") long userId) {
        String result = "获取用户账户余额" + userId + "成功。\n";
        return result;
    }
}