package com.glowbyte.metricatestgenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetricaTestGeneratorApplication {
    private static final Logger log = LoggerFactory.getLogger(MetricaTestGeneratorApplication.class);
    @Value("${file.location}")
    String fileLocation;

    @Value("${kafka.topic}")
    public String topic;

    @Value("${bootstrap.server}")
    public String bootstrapServer;

    public static void main(String[] args) {
        SpringApplication.run(MetricaTestGeneratorApplication.class, args);
    }
}
