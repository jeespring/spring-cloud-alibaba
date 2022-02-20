package com.jeespring.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 *
 * @author 张朝阳
 * @date 2022/2/20 22:41:41
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/deduct")
    public String deduct(@RequestParam("userId") long userId, @RequestParam("money") long money) {
        String result = "用户" + userId + "账户扣减成功，扣减" + money + "元";
        return result;
    }
}
