package com.sem4.demospringjpa;

import com.sem4.demospringjpa.services.ProductService;
import com.sem4.demospringjpa.services.ProductServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.sem4.demospringjpa"})
@ComponentScan("com.sem4")
@PropertySource("classpath:application.properties")
public class JPAConfiguration {
    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }
}
