package com.example.appengine.java8.logging;

import com.google.cloud.logging.LogEntry.Builder;
import com.google.cloud.logging.LoggingEnhancer;

public class SampleEnhancer implements LoggingEnhancer {

    @Override
    public void enhanceLogEntry(Builder builder) {
        builder.addLabel("Test", "Test-Value");
    }

}
