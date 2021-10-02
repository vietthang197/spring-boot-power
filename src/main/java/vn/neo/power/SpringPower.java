package vn.neo.power;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringPower {
    public static ConfigurableApplicationContext startSpringBoot(String mainClass) throws ClassNotFoundException {
        return new
                SpringApplicationBuilder(Class.forName(mainClass)).web(WebApplicationType.SERVLET).run();
    }
}
