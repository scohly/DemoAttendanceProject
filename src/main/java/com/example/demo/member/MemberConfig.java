package com.example.demo.member;

import com.example.demo.dao.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class MemberConfig {
    //we weant to have a bean

    @Bean
    CommandLineRunner commandLineRunner(MemberRepository repository){
        return args -> {
            Member soami = new Member( "Soami Cohly", "soami@soami.com","UID1989" , 31,
                    LocalDate.of(2021, Month.JUNE, 7));

            Member achint = new Member( "Achint Satsangi", "achint@soami.com","UID1995" , 25,
                    LocalDate.of(2021, Month.JUNE, 7));

            //save to our database
            repository.saveAll(List.of(soami,achint));

        };
    }
}
