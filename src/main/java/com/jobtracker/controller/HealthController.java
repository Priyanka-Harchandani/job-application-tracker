// to understand how a request from a browser reaches your Spring Boot application 
// and gets a response before building the actual Job Application & Interview Tracker.
package com.jobtracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// tells Spring that this class handles web requests and returns response data.
@RestController
public class HealthController {

    @GetMapping("/api/health")
    public String checkHealth() {
        return "Job Tracker API is running!";  //The returned string becomes the HTTP response body.
    }
}