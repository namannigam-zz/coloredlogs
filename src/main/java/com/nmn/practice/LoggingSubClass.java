package com.nmn.practice;

import com.nmn.practice.ColorLogging;

/**
 * Created by naman.nigam on 08/04/16.
 */
public class LoggingSubClass extends ColorLogging {

    public static void loggingDebug() {
        logger.debug("All debug dumped.");
    }

    public static void loggingInfo() {
        logger.info("All information useful.");
    }

    public static void loggingWarn() {
        logger.warn("All warning highlighted.");
    }

    public static void loggingError() {
        logger.error("All error bought up.");
    }

    public static void loggingFatal() {
        logger.fatal("All fatal intolerable.");
    }


    public static void main(String[] args) {
        loggingDebug();
        loggingInfo();
        loggingWarn();
        loggingError();
        loggingFatal();
    }
}