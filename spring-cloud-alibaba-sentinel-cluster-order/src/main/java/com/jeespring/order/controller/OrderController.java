package com.jeespring.order.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/select")
    public String selectAll() {
        return "success";
    }
}
