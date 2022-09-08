package cn.aolixin.springbootunified;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = {"cn.aolixin.springbootunified"})//扫描mapper接口的注解
@SpringBootApplication()
public class SpringbootUnifiedApplication {

    public static void main(String[] args) {
        System.out.println("成功");
        SpringApplication.run(SpringbootUnifiedApplication.class, args);
    }

}
