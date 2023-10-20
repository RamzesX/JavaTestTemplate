package Norbert.apps.JavaTests.auth;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class AuthDefault implements Auth {

    @Override
    public String getName() {
        return "AuthDefault";
    }
}
