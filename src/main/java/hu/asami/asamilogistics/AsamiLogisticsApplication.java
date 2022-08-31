package hu.asami.asamilogistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "hu.asami" })
public class AsamiLogisticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsamiLogisticsApplication.class, args);
    }

}
