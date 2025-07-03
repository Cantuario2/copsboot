package com.study.copsboot;

import com.study.copsboot.orm.jpa.InMemoryUniqueIdGenerator;
import com.study.copsboot.orm.jpa.UniqueIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class CopsbootApplicationConfiguration {
    @Bean
    public UniqueIdGenerator<UUID> uniqueIdGenerator() {
        return new InMemoryUniqueIdGenerator();
    }
}
