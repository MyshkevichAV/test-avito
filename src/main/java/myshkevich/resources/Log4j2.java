package myshkevich.resources;

import org.apache.logging.log4j.LogManager;

import java.util.logging.Logger;

public class Log4j2 {
    private static final Logger logger = (Logger) LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Log4j2 started.");
        logger.warning("Warning");
    }
}