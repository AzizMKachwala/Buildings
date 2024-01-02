package com.example.buildings.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.buildings.Floors;
import com.example.buildings.R;
import com.example.buildings.Room;

import java.util.List;

public class FloorAdapter extends RecyclerView.Adapter<FloorAdapter.FloorViewHolder> {

    List<Floors> floors;
    Context context;

    public FloorAdapter(List<Floors> floors) {
        this.floors = floors;
    }


    @NonNull
    @Override
    public FloorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.floor_item, parent, false);
        return new FloorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FloorViewHolder holder, int position) {
        Floors floor = floors.get(position);
        holder.txtFloorNumber.setText(floor.getFloors());
        holder.roomRecyclerview.setAdapter(new RoomAdapter(floor.getRooms()));
    }

    @Override
    public int getItemCount() {
        return floors.size();
    }

    public class FloorViewHolder extends RecyclerView.ViewHolder{

        TextView txtFloorNumber;
        RecyclerView roomRecyclerview;
        public FloorViewHolder(@NonNull View itemView) {
            super(itemView);

            txtFloorNumber = itemView.findViewById(R.id.txtFloorNumber);
            roomRecyclerview = itemView.findViewById(R.id.roomRecyclerview);
            roomRecyclerview.setLayoutManager(new GridLayoutManager(itemView.getContext(), 3));
        }
    }
}
