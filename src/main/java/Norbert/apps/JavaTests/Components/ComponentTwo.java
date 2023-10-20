package Norbert.apps.JavaTests.Components;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {
    String message = "message two";

    public String getMessage() {
        return message;
    }
}