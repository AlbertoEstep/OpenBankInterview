
package com.codility.configuration;

import com.codility.beans.LegacyPaymentsService;
import com.codility.beans.UsersRepository;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.codility.utils")
@Import(MaintenanceConfig.class)
@PropertySource("classpath:production.properties")
public class SystemConfig {
    @Bean
    public UsersRepository usersRepository() {
        UsersRepository usersRepository = new UsersRepository();
        usersRepository.initialize();
        return usersRepository;
    }

    @Bean(name = "paymentsService")
    public LegacyPaymentsService paymentsService() {
        return new LegacyPaymentsService();
    }
}
