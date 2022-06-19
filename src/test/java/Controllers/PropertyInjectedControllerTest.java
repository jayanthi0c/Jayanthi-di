package Controllers;

import Service.GreetingService;
import Service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    public GreetingService greetingService;

    @BeforeEach
    void setUp() {

        controller = new PropertyInjectedController();
        controller.service = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}