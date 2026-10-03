package com.kseniya.incidentplatform.model;

public class Incident {

    private Long id;
    private String service;
    private String type;
    private String status;

    public Incident() {
    }

    public Incident(Long id, String service, String type, String status) {
        this.id = id;
        this.service = service;
        this.type = type;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}