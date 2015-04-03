package com.recursivechaos.injectorcore;

import com.recursivechaos.injectorcore.service.InjectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectorCoreApplication{

    @Autowired
    InjectorService injectorService;

    public static void main(String[] args) {
        SpringApplication.run(InjectorCoreApplication.class, args);
    }

}
