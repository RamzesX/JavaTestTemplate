package Norbert.apps.JavaTests.Components;

import org.springframework.stereotype.Component;

@Component
public class ComponentOne {
    String message = "message one";

    public String getMessage() {
        return message;
    }
}
