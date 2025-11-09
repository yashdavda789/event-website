package com.example.event_website.controller;

import com.example.event_website.model.Enquiry;
import com.example.event_website.model.Event;
import com.example.event_website.repository.EnquiryRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EventController {

    @Autowired
    EnquiryRepository enquiryRepository;

    @GetMapping("/")
    public String home(Model model) {
        List<Event> events = List.of(
                new Event("Glow Party Night", "Party", "An unforgettable night full of music, dance, and lights!", "/images/party.jpg"),
                new Event("Corporate Annual Meet", "Corporate", "Annual meet with 500+ executives and teams.", "/images/corporate.jpg"),
                new Event("Birthday Bash", "Special Occasion", "Personalized theme birthday celebration packages.", "/images/birthday.jpg")
        );

        model.addAttribute("companyName", "Aura Events");
        model.addAttribute("ownerName", "Manuja Pawar");
        model.addAttribute("ownerContact", "+91-84248-45978");
        model.addAttribute("clientsServed", 120);
        model.addAttribute("events", events);

        return "index";
    }


    @PostMapping("/enquiry")
    public String addEnquiry(@RequestBody Enquiry enquiry) {
        enquiryRepository.save(enquiry);
        return "Thank you! Your details have been submitted successfully.";
    }
}
