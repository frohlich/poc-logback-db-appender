package dev.frohlich.appenderjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class AppenderJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppenderJdbcApplication.class, args);
    }

    @EventListener
    public void onApplicationEvent(ApplicationReadyEvent event) {

        Logger logger = LoggerFactory.getLogger(AppenderJdbcApplication.class);

        logger.trace("This is a trace message {}", "Argument 1");

        logger.info("This is an info message");

        logger.debug("This is a debug message");

        logger.error("This is an error message");


    }

}
