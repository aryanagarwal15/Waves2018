package org.bits_waves.waves2018.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2018.ListItems.SpotOnItem;
import org.bits_waves.waves2018.R;
import org.bits_waves.waves2018.SpotOnViewHolder;

import java.util.List;

public class SpotOnAdapter extends RecyclerView.Adapter<SpotOnViewHolder> {

    List<SpotOnItem> spotOnItems;

    public SpotOnAdapter(List<SpotOnItem> spotOnItemsList) {
        this.spotOnItems = spotOnItemsList;
    }

    @NonNull
    @Override
    public SpotOnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_spoton_rv, parent, false);
        SpotOnViewHolder holder = new SpotOnViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SpotOnViewHolder holder, int position) {
        SpotOnItem spotOnItem = spotOnItems.get(position);
        holder.populate(spotOnItem);
    }

    @Override
    public int getItemCount() {
        return spotOnItems.size();
    }
}
