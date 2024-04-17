package com.alibou.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

@Configuration
public class AppConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        // Implement your logic to determine the current auditor
        return () -> Optional.of("defaultAuditor"); // Example: using a default auditor for now
    }
}
