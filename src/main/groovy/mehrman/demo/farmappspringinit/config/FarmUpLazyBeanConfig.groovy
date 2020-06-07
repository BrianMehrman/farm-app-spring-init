package mehrman.demo.farmappspringinit.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import java.time.LocalDate

@Configuration
public class FarmUpLazyBeanConfig {

    @Bean
    public LocalDate localDate() {
        return LocalDate.now();
    }

    @Bean
    public String webmaster() {
        return "brian@mehrman.io";
    }
}
