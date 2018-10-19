package org.bits_waves.waves2018.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2018.EventsViewHolder;
import org.bits_waves.waves2018.ListItems.EventBrief;
import org.bits_waves.waves2018.R;

import java.util.ArrayList;
import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsViewHolder> {

    List<EventBrief> eventList = new ArrayList<>(0);

    public EventsAdapter(List<EventBrief> eventBriefList) {
        this.eventList = eventBriefList;
    }

    @NonNull
    @Override
    public EventsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_events_rv, parent, false);
        EventsViewHolder holder = new EventsViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventsViewHolder holder, int position) {
        EventBrief eventBrief = eventList.get(position);
        holder.populate(eventBrief);
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}
