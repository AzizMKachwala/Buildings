package com.example.buildings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.buildings.Adapter.BuildingAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView buildingRecyclerView;
    BuildingAdapter buildingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildingRecyclerView = findViewById(R.id.buildingRecyclerView);
        buildingAdapter = new BuildingAdapter(getBuildingData(), this);

        buildingRecyclerView.setAdapter(buildingAdapter);
        buildingRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.HORIZONTAL,false));
    }

    List<Building> getBuildingData() {
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building("Building A", createFloorsForBuildingA()));
        buildings.add(new Building("Building B", createFloorsForBuildingB()));
        buildings.add(new Building("Building C", createFloorsForBuildingC()));
        buildings.add(new Building("Building D", createFloorsForBuildingD()));
        return buildings;
    }

    List<Floors> createFloorsForBuildingA() {
        List<Floors> floors = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            floors.add(new Floors("Floor " + i, createRoomsForFloor()));
        }
        return floors;
    }

    List<Floors> createFloorsForBuildingB() {
        List<Floors> floors = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            floors.add(new Floors("Floor " + i, createRoomsForFloor()));
        }
        return floors;
    }
    List<Floors> createFloorsForBuildingC() {
        List<Floors> floors = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            floors.add(new Floors("Floor " + i, createRoomsForFloor()));
        }
        return floors;
    }

    List<Floors> createFloorsForBuildingD() {
        List<Floors> floors = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            floors.add(new Floors("Floor " + i, createRoomsForFloor()));
        }
        return floors;
    }

    private List<Room> createRoomsForFloor() {
        List<Room> rooms = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            rooms.add(new Room("Room " + i));
        }
        return rooms;
    }
}