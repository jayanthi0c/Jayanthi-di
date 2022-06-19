package Controllers;

import Service.GreetingService;

public class ConstructorInjectedController {

    public GreetingService greetingservice;

    public ConstructorInjectedController(GreetingService greetingservice) {
        this.greetingservice = greetingservice;
    }
    public String getGreeting(){
        return greetingservice.sayGreeting();
    }
}
