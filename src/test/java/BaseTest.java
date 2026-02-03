import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.util.Map;

public class BaseTest {

    @BeforeTest
    static void setUp() {
        Configuration.remote = "https://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "144.0";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", false
        ));
        Configuration.browserCapabilities = capabilities;
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
    }
}
