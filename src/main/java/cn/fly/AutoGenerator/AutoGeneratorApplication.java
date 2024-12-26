package cn.fly.AutoGenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class AutoGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoGeneratorApplication.class, args);
    }

}
