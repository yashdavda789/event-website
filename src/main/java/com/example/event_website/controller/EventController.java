package com.example.event_website.controller;

import com.example.event_website.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EventController {

    @GetMapping("/")
    public String home(Model model) {
        List<Event> events = List.of(
                new Event("Glow Party Night", "Party", "An unforgettable night full of music, dance, and lights!", "/images/party.png"),
                new Event("Corporate Annual Meet", "Corporate", "Annual meet with 500+ executives and teams.", "/images/corporate.png"),
                new Event("Birthday Bash", "Special Occasion", "Personalized theme birthday celebration packages.", "/images/birthday.png")
        );

        model.addAttribute("companyName", "Aura Events");
        model.addAttribute("ownerName", "Manuja Pawar");
        model.addAttribute("ownerContact", "+918424845978"); // NO DASHES or spaces        model.addAttribute("clientsServed", 120);
        model.addAttribute("events", events);

        return "index"; // Thymeleaf template
    }
}