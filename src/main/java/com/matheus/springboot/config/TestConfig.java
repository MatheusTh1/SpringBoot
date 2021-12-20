package com.matheus.springboot.config;

import com.matheus.springboot.entities.User;
import com.matheus.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Matheus","MatheusHenrique@gmail","999999","123456");
        User u2 = new User(null, "Bruna","BrunaRodrigues@gmail","777777","123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
