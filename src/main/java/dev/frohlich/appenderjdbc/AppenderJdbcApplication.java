package dev.frohlich.appenderjdbc;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class AppenderJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppenderJdbcApplication.class, args);
    }

    @Autowired
    ContextualLogger logger;

    @EventListener
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.trace("Hello World! {}", "aaaaa");
    }

}
