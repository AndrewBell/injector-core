package com.recursivechaos.test;

import com.recursivechaos.injectorcore.service.InjectorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplicationContext.class)
public class InjectorServiceTest {

    @Autowired
    InjectorService injectorService;

    @Test
    public void testInjector() {

        assertEquals("Did not inject property", "Andrew", injectorService.getGreeting());

    }

}
