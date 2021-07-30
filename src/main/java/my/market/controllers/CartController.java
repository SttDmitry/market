package my.market.controllers;

import my.market.utils.ShoppingCart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("geek-spring-cloud-eureka-client")
public interface CartController {
    @RequestMapping("/save/")
    String save(ShoppingCart cart);
}
