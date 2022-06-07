package top.watilion.wboot.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author watilion
 */
@SpringBootApplication
@ComponentScan(basePackages = {"top.watilion.wboot"})
@MapperScan({"top.watilion.wboot.system.dao","top.watilion.wboot.server.dao"})
public class WbootServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WbootServerApplication.class, args);
    }

}
