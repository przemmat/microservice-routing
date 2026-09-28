package matera.magisterka.microservice.routing;

import org.springframework.boot.SpringApplication;

public class TestMonolitApplication {

    public static void main(String[] args) {
        SpringApplication.from(RoutingServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
