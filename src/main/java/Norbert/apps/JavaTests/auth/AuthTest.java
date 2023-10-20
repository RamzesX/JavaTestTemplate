package Norbert.apps.JavaTests.auth;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class AuthTest implements Auth {

    @Override
    public String getName() {
        return "AuthTest";
    }
}
