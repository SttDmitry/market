package my.market.utils;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    @Before("execution(public * my.market.controllers.CartController.*(..))")
    public void allMethodsCallsLogging() {
        System.out.println("В классе CartController вызывают метод");
    }
}
