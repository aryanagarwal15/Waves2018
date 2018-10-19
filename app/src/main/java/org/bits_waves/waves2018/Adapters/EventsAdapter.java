package org.bits_waves.waves2018.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2018.Activities.EventView;
import org.bits_waves.waves2018.EventsViewHolder;
import org.bits_waves.waves2018.ListItems.Event;
import org.bits_waves.waves2018.ListItems.EventBrief;
import org.bits_waves.waves2018.R;

import java.util.ArrayList;
import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsViewHolder> {

    List<EventBrief> eventBriefList = new ArrayList<>(0);
    List<Event> eventList = new ArrayList<>(0);
    Context context;

    public EventsAdapter(List<EventBrief> eventBriefList, List<Event> eventList, Context context) {
        this.eventBriefList = eventBriefList;
        this.eventList = eventList;
        this.context = context;
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
        EventBrief eventBrief = eventBriefList.get(position);
        final Event event = eventList.get(position);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EventView.class);
                intent.putExtra("event", event);
                Log.d("Events fragment", "EventView Activity launched for " + event.getName());
                context.startActivity(intent);
            }
        });
        holder.populate(eventBrief);
    }

    @Override
    public int getItemCount() {
        return eventBriefList.size();
    }
}
