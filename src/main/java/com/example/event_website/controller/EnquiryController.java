package com.example.event_website.controller;

import com.example.event_website.model.Enquiry;
import com.example.event_website.repository.EnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EnquiryController {

    @Autowired
    private EnquiryRepository enquiryRepository;

    @PostMapping("/enquiry")
    public String addEnquiry(@RequestBody Enquiry enquiry) {
        enquiryRepository.save(enquiry);
        return "Thank you! Your details have been submitted successfully.";
    }
}