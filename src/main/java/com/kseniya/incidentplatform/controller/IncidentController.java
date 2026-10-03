package com.kseniya.incidentplatform.controller;

import com.kseniya.incidentplatform.dto.CreateIncidentRequest;
import com.kseniya.incidentplatform.model.Incident;
import com.kseniya.incidentplatform.service.IncidentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {

    private final IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @GetMapping("/test")
    public Incident testIncident() {
        return new Incident(
                1L,
                "order-service",
                "HTTP_500",
                "OPEN"
        );
    }

    @PostMapping
    public Incident createIncident(@RequestBody CreateIncidentRequest request) {
        return incidentService.createIncident(request);
    }

    @GetMapping
    public List<Incident> getAllIncidents() {
        return incidentService.getAllIncidents();
    }

    @GetMapping("/{id}")
    public Incident getIncidentById(@PathVariable Long id) {
        return incidentService.getIncidentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteIncident(@PathVariable Long id) {
        incidentService.deleteIncident(id);
    }
}