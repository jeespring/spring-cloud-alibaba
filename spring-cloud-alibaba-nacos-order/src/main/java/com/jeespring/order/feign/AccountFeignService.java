package com.jeespring.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * AccountFeignService
 *
 * @author 张朝阳
 * @date 2022/1/1 15:10:10
 */
@FeignClient(value = "spring-cloud-alibaba-nacos-account", path = "/account")
public interface AccountFeignService {

    @RequestMapping("/deduct")
    String deduct(@RequestParam("userId") long userId, @RequestParam("money") long money);
}
