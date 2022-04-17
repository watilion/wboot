package top.watilion.wboot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author watilion
 */
@SpringBootApplication
@ComponentScan(basePackages = {"top.watilion.wboot"})
public class WbootServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WbootServerApplication.class, args);
    }

}
