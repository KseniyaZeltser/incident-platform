package com.kseniya.incidentplatform.dto;

public class CreateIncidentRequest {

    private String service;
    private String type;

    public CreateIncidentRequest() {
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}