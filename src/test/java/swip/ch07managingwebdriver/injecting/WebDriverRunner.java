package swip.ch07managingwebdriver.injecting;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This class allows you to use the same configuration for all your tests.
 */
public class WebDriverRunner extends SpringJUnit4ClassRunner {

    public WebDriverRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

    @Override
    protected TestContextManager createTestContextManager(Class<?> clazz) {
        return super.createTestContextManager(ConfigShim.class);
    }

    @ContextConfiguration(classes = WebDriverConfig.class)
    public static class ConfigShim {

    }
}