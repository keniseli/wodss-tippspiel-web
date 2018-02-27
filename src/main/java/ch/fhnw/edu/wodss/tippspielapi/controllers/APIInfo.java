package ch.fhnw.edu.wodss.tippspielapi.controllers;

import lombok.Data;

@Data
public class APIInfo {

    private String name;
    private String version;

    APIInfo(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}