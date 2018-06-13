package com.dxy.artemis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dxy.artemis.dao.mapper")
public class ArtemisPirloWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtemisPirloWebApplication.class, args);
    }

}
