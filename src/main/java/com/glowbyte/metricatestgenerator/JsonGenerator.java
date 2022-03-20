package com.glowbyte.metricatestgenerator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.glowbyte.metricatestgenerator.entities.MessageForm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class JsonGenerator {
    public static String generateJsonFsd(Map<String, String> metricaFsdMap) throws JsonProcessingException {
        getDefaultFields(metricaFsdMap);
        metricaFsdMap.putIfAbsent("event_category", "CardActivation");
        metricaFsdMap.putIfAbsent("event_name", "Click card activation");
        metricaFsdMap.putIfAbsent("event_label", "Button");
        metricaFsdMap.putIfAbsent("device_screen_name", "CardActivation");
        metricaFsdMap.putIfAbsent("dimension_7", "INVESTBOX");
        metricaFsdMap.putIfAbsent("dimension_20", "Success");
        return new ObjectMapper()
                .writeValueAsString(metricaFsdMap);
    }

    public static String generateJsonForm(MessageForm messageForm) throws JsonProcessingException {
        Map<String, String> metrica = new HashMap<>();
        getDefaultFields(metrica);
        metrica.putIfAbsent("event_category", messageForm.getEventCategory());
        metrica.putIfAbsent("event_name", messageForm.getEventName());
        metrica.putIfAbsent("event_label", messageForm.getEventLabel());
        metrica.putIfAbsent("device_screen_name", messageForm.getDeviceScreenName());
        metrica.putIfAbsent("dimension_7", messageForm.getDimension7());
        metrica.putIfAbsent("dimension_20", messageForm.getDimension20());
        return new ObjectMapper()
                .writeValueAsString(metrica);
    }

    private static void getDefaultFields(Map<String, String> metrica) {
        metrica.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")));
        metrica.put("timestamp_server", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")));
        metrica.put("timestamp_day", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")));
        metrica.put("application_id", "mobile");
        metrica.put("platform", "mob");
        metrica.put("event_uuid", "c3f20747-b8b0-47d7-a86a-e455c68c08e4");
        metrica.put("session_uuid", "617ee3d1-8b47-4103-9f1f-7969485e6ff3");
        metrica.put("client_pin", "ASSRQ4");
        metrica.put("event_type", "am");
        metrica.put("kafka_offset", "4265156052");
        metrica.put("kafka_partition", "3");
    }
}
