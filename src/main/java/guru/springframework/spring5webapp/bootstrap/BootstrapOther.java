package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by João Paulo Mafra on 10/07/2021.
 */
@Component
@Order(value = 2)
public class BootstrapOther implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Bootstraping other things...");
    }
}
