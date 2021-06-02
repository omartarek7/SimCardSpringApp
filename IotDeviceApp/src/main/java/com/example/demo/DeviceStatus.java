package com.example.demo;

public enum DeviceStatus {

    ACTIVE ("ACTIVE"),
    WAITING_FOR_ACTIVATION ("WAITING_FOR_ACTIVATION"),
    BLOCKED ("BLOCKED"),
    DEACTIVATED("DEACTIVATED");

    private final String name;
    DeviceStatus(String name){
        this.name=name;
    }
}
