package com.example.buildings.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.buildings.Building;
import com.example.buildings.R;

import java.util.List;

public class BuildingAdapter extends RecyclerView.Adapter<BuildingAdapter.BuildingViewHolder> {

    List<Building> buildings;
    Context context;

    public BuildingAdapter(List<Building> buildings,Context context) {
        this.buildings = buildings;
        this.context = context;
    }

//    public interface OnBuildingClickListener {
//        void onBuildingClick(Building building);
//    }
//
//    private OnBuildingClickListener onBuildingClickListener;
//
//    public void setOnBuildingClickListener(OnBuildingClickListener listener) {
//        this.onBuildingClickListener = listener;
//    }


    @NonNull
    @Override
    public BuildingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.building_item, parent, false);
        return new BuildingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuildingViewHolder holder, int position) {
        Building building = buildings.get(position);
        holder.txtBuildingNumber.setText(building.getBuilding());
        holder.floorRecyclerView.setAdapter(new FloorAdapter(building.getFloors()));

    }

    @Override
    public int getItemCount() {
        return buildings.size();
    }

    public static class BuildingViewHolder extends RecyclerView.ViewHolder {

        TextView txtBuildingNumber;
        RecyclerView floorRecyclerView;

        public BuildingViewHolder(@NonNull View itemView) {
            super(itemView);
            txtBuildingNumber = itemView.findViewById(R.id.txtBuildingNumber);
            floorRecyclerView = itemView.findViewById(R.id.floorRecyclerView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    floorRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
                }
            });
//            floorRecyclerView = itemView.findViewById(R.id.floorRecyclerView);
//            floorRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        }
    }
}
