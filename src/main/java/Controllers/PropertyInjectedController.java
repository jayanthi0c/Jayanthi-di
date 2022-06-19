package Controllers;

import Service.GreetingService;

public class PropertyInjectedController {
    public GreetingService service;

    public String getGreeting(){
        return service.sayGreeting();
    }
}
