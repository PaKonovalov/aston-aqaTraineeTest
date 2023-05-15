package cucumberSteps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class BeforeStep {

    @Given("click quick start button {string}")
    public void clickQuickStartButton(String url) {
        Selenide.open(url);
    }
}
