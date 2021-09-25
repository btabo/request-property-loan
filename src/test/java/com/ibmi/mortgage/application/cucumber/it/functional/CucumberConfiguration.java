package com.ibmi.mortgage.application.cucumber.it.functional;

import com.ibmi.mortgage.domain.repo.EmprunteurRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import static org.mockito.Mockito.mock;

@Component
@ComponentScan("com.ibmi.mortgage.application")
public class CucumberConfiguration {

    public static EmprunteurRepository emprunteurRepositoryMock = mock(EmprunteurRepository.class);

    @Bean
    EmprunteurRepository emprunteurRepository() {
        return emprunteurRepositoryMock;
    }
}
