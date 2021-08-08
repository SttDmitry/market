package my.market;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class MarketApp {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource("jdbc:mysql://localhost:3306/newmarket?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8", "root", "newpass").load();
        flyway.migrate();
        SpringApplication.run(MarketApp.class, args);
    }
}
