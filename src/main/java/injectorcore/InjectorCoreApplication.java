package injectorcore;

import injectorcore.service.InjectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectorCoreApplication implements CommandLineRunner{

    @Autowired
    InjectorService injectorService;

    public static void main(String[] args) {
        SpringApplication.run(InjectorCoreApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Hello " + injectorService.getGreeting());
    }
}
