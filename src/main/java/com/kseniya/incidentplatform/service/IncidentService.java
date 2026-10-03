package com.kseniya.incidentplatform.service;

import com.kseniya.incidentplatform.exception.IncidentNotFoundException;
import com.kseniya.incidentplatform.dto.CreateIncidentRequest;
import com.kseniya.incidentplatform.model.Incident;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IncidentService {

    private final List<Incident> incidents = new ArrayList<>();

    private long nextId = 1;

    public Incident createIncident(CreateIncidentRequest request) {

        Incident incident = new Incident(
                nextId,
                request.getService(),
                request.getType(),
                "OPEN"
        );

        incidents.add(incident);
        nextId++;

        return incident;
    }

    public List<Incident> getAllIncidents() {
        return incidents;
    }

    public Incident getIncidentById(Long id) {

        for (Incident incident : incidents) {
            if (incident.getId().equals(id)) {
                return incident;
            }
        }

        throw new IncidentNotFoundException(id);
    }
}