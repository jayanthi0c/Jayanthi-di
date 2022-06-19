package Controllers;

import Service.GreetingService;
import Service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    GreetingService service;

    @BeforeEach
    void setUp() {
      controller = new SetterInjectedController();
        controller.SetGetterService(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}