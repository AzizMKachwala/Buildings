package com.example.buildings;

import java.util.List;

public class Floors {

    String floors;

    List<Room> rooms;

    public Floors(String floors, List<Room> rooms) {
        this.floors = String.valueOf(floors);
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getFloors() {
        return floors;
    }
}
