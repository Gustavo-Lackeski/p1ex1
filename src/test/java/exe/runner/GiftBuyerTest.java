package exe.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = false,
        format = { "pretty", "html:target/cucumber" },
        glue = "exe.steps2",
        features = "classpath:cucumber/GiftBuyer.feature"
)
public class GiftBuyerTest {
}
