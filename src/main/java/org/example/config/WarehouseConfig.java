package org.example.config;

import org.example.warehouse.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class WarehouseConfig {

    @Bean
    @Primary
    public Worker mishka() {
        return new Worker(){};
    }

    @Bean
    public Worker zelya() {
        return new Worker(){};
    }

}
