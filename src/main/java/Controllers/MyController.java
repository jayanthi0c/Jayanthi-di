package Controllers;
import java.lang.*;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String runMethod(){
        System.out.println("Inside Method:runMethod()");

        return "Practice DI";
    }
}
