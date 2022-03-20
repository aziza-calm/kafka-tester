package com.glowbyte.metricatestgenerator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.glowbyte.metricatestgenerator.entities.MessageForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MetricaTesterController {

    @GetMapping("/api/send")
    public String showSendPage(Model model) {
        model.addAttribute("messageForm", new MessageForm());
        return "template";
    }

    @PostMapping("/api/send")
    public String sendMessage(@ModelAttribute MessageForm messageForm, Model model) throws JsonProcessingException {
        KafkaSendMessage sender = new KafkaSendMessage();
        model.addAttribute("messageForm", messageForm);
        String message = JsonGenerator.generateJsonForm(messageForm);
        sender.sendMessage(message, messageForm.getBootstrapServer(), messageForm.getTopic());
        System.out.println("Sent message:\n" + message);
        return "result";
    }
}
