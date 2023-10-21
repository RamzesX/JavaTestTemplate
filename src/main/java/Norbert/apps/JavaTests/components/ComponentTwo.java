package Norbert.apps.JavaTests.components;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {
    String message = "message two";

    public String getMessage() {
        return message;
    }
}