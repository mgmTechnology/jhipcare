package technology.mgm.care.cucumber;

import io.cucumber.java.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import technology.mgm.care.JhipCareApp;

@SpringBootTest
@WebAppConfiguration
@ContextConfiguration(classes = JhipCareApp.class)
public class CucumberContextConfiguration {

    @Before
    public void setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }
}
