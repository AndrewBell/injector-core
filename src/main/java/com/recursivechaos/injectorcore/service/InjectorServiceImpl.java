package com.recursivechaos.injectorcore.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectorService")
public class InjectorServiceImpl implements InjectorService {

    @Value("${name}")
    public String name;

    @Override
    public String getGreeting() {
        return name;
    }
}
