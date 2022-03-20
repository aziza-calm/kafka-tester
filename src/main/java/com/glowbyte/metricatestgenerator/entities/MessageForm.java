package com.glowbyte.metricatestgenerator.entities;

public class MessageForm {
    private String bootstrapServer = "kafkadevp:9092";
    private String topic = "raw.am.retail_event";

    private String timestamp = "";
    private String eventLabel = "default_event_label";
    private String eventName = "default_event_name";
    private String eventCategory = "default_event_category";
    private String deviceScreenName = "default_device_screen_name";
    private String dimension7 = "default_dim7";
    private String dimension20 = "";

    @Override
    public String toString() {
        return "MessageForm{" +
                "bootstrapServer='" + bootstrapServer + '\'' +
                ", topic='" + topic + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", eventLabel='" + eventLabel + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventCategory='" + eventCategory + '\'' +
                ", deviceScreenName='" + deviceScreenName + '\'' +
                ", dimension7='" + dimension7 + '\'' +
                ", dimension20='" + dimension20 + '\'' +
                '}';
    }

    public String getDimension20() {
        return dimension20;
    }

    public void setDimension20(String dimension20) {
        this.dimension20 = dimension20;
    }

    public String getBootstrapServer() {
        return bootstrapServer;
    }

    public void setBootstrapServer(String bootstrapServer) {
        this.bootstrapServer = bootstrapServer == null ? "kafkadevp:9092" : bootstrapServer;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getEventLabel() {
        return eventLabel;
    }

    public void setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getDeviceScreenName() {
        return deviceScreenName;
    }

    public void setDeviceScreenName(String deviceScreenName) {
        this.deviceScreenName = deviceScreenName;
    }

    public String getDimension7() {
        return dimension7;
    }

    public void setDimension7(String dimension7) {
        this.dimension7 = dimension7;
    }
}
