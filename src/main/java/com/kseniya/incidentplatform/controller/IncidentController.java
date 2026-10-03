package com.kseniya.incidentplatform.controller;

import com.kseniya.incidentplatform.model.Incident;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncidentController {

    @GetMapping("/hello")
    public String hello() {
        return "Incident Platform is running!";
    }

    @GetMapping("/api/incidents/test")
    public Incident testIncident() {
        return new Incident(
                1L,
                "order-service",
                "HTTP_500",
                "OPEN"
        );
    }
}