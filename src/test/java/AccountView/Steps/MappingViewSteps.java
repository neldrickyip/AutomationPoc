package AccountView.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MappingViewSteps {
    WebDriver driver = null ;
    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(8));
    }

    @Given("user is on mapping view")
    public void user_is_on_mapping_view() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://ithelp.ithome.com.tw/");
        System.out.println("In mapping view");

    }
    @When("user click add button on bottom right")
    public void user_click_add_button_on_bottom_right() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicked add button");

    }
    @Then("mapping dialog is able to display")
    public void mapping_dialog_is_able_to_display() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("dialog show");
        driver.close();
        driver.quit();
    }
}
