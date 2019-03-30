package me.loda.springboot.demo;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final UserRepository userRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        User user = new User("loda");

        user = userRepository.save(user);
        System.out.println(user);
    }
}
