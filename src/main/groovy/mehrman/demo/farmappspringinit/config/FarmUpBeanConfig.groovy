package mehrman.demo.farmappspringinit.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
public class FarmUpBeanConfig {

    @Bean
    public String projectName() {
        return "FarmUp Harvester";
    }

    @Bean
    public String tabName() {
        return "FarmUp";
    }
}
