package com.flamexander.cloud.client;

import org.springframework.web.bind.annotation.RequestMapping;

public interface CartController {
    @RequestMapping("/save/")
    String save(ShoppingCart cart);
}
