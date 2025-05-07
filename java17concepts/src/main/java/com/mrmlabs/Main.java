package com.mrmlabs;

/**
 * Main class demonstrating the use of Java's logging framework.
 * Logs a "Hello world!" message and prints the current Java and JDK versions.
 */

import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Hello world!");

        // Print Java and JDK version using logger
        logger.log(Level.INFO, "Java Version: {0}", System.getProperty("java.version"));
        logger.log(Level.INFO, "JDK Version: {0}", System.getProperty("java.specification.version"));

        // Print system details
        printSystemDetails();
    }

    private static void printSystemDetails() {
        logger.log(Level.INFO, "OS Name: {0}", System.getProperty("os.name"));
        logger.log(Level.INFO, "OS Version: {0}", System.getProperty("os.version"));
        logger.log(Level.INFO, "User Name: {0}", System.getProperty("user.name"));
        logger.log(Level.INFO, "User Home Directory: {0}", System.getProperty("user.home"));
    }
}