package Norbert.apps.JavaTests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Component
public class LoginPage {
    SelenideElement mainMenuPage = $(".main-menu-pages");
    ElementsCollection users = $$("#selenide-users .user");

    public void openPage() {
        Selenide.open("https://selenide.org");
        mainMenuPage
                .find(byText("Users"))
                .click();

        users.filter(visible)
                .shouldHave(sizeGreaterThan(50));
    }
}
