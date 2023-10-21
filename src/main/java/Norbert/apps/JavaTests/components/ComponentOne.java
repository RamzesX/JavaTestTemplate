package Norbert.apps.JavaTests.components;

import org.springframework.stereotype.Component;

@Component
public class ComponentOne {
    String message = "message one";

    public String getMessage() {
        return message;
    }
}
