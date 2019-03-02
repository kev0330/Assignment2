package cput.ac.za.Config;

import cput.ac.za.Combine;
import cput.ac.za.NameAndSurname;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="name")
    public NameAndSurname getService(){
        return new Combine();
    }
}
