package Controllers;

import Service.GreetingService;

public class SetterInjectedController {
    public GreetingService greetingservice;

    public void SetGetterService(GreetingService greetingservice){
        this.greetingservice = greetingservice;
    }
    public String getGreeting(){
        return greetingservice.sayGreeting();
    }
}
