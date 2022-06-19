package Controllers;

import Service.GreetingService;
import Service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    GreetingService greetingservice;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }
    @Test
    void getGreeting() {

        System.out.println(greetingservice.sayGreeting());

    }
}