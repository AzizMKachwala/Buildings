package com.example.buildings;

import java.util.List;

public class Building {

    String building;
    List<Floors> floors;

    public Building(String building, List<Floors> floors) {
        this.building = building;
        this.floors = floors;
    }

    public String getBuilding() {
        return building;
    }

    public List<Floors> getFloors() {
        return floors;
    }
}
