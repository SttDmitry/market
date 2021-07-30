package my.market.controllers;

import my.market.entities.Greeting;
import my.market.entities.Message;
import my.market.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ShopControllerWs {
    @Autowired
    private ShoppingCartService shoppingCartService;


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Message message, HttpServletRequest httpServletRequest) throws Exception {
//        Thread.sleep(3000); // simulated delay
        return new Greeting( shoppingCartService.getCurrentCart(httpServletRequest.getSession()).getItems().size()+" товар(а/ов)");
    }
}