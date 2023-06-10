package dev.frohlich.appenderjdbc;


import org.slf4j.*;
import org.springframework.stereotype.Service;

@Service
public class ContextualLogger {
    Logger logger = LoggerFactory.getLogger(ContextualLogger.class);

    private void setContext(){
        MDC.put("user", "frohlich");
        MDC.put("application", "appender-jdbc");
    }

    public void trace(String message, Object ... vars) {
        setContext();
        logger.trace(message, vars);
        clearContext();
    }

    private void clearContext() {
        MDC.remove("user");
        MDC.remove("application");
    }
}
