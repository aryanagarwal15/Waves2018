package org.bits_waves.waves2018.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.bits_waves.waves2018.Activities.EventView;
import org.bits_waves.waves2018.Adapters.EventsAdapter;
import org.bits_waves.waves2018.EventsRecyclerViewTouchListener;
import org.bits_waves.waves2018.ListItems.Event;
import org.bits_waves.waves2018.ListItems.EventBrief;
import org.bits_waves.waves2018.R;

import java.util.ArrayList;
import java.util.List;

public class EventsFragmentSimple extends Fragment{

    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    /*static {
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }*/
    private static DatabaseReference myRef = database.getReference().child("events");

    RecyclerView recyclerView;
    List<EventBrief> eventBriefs = new ArrayList<>(0);
    List<Event> eventList = new ArrayList<>(0);

    private List<EventBrief> dummyData() {
        List<EventBrief> data = new ArrayList<>(10);
        for(int i=0; i<5; i++) {
            data.add(new EventBrief("Event"+i, "imgRes"+i, i));
        }
        return data;
    }

    private List<Event> dummyEventsData() {
        List<Event> data = new ArrayList<>(0);
        Event event = new Event();
        for(int i=0; i<5; i++) {
            event.setName("Event " + i);
            event.setDescription("Descrition for Event " + i);
            event.setRules("Rules for Event " + i);
            data.add(new Event(event));
        }
        return data;
    }

    public static EventsFragmentSimple newInstance() {
        EventsFragmentSimple fragment = new EventsFragmentSimple();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events_simple, container, false);
        recyclerView = view.findViewById(R.id.events_fragment_recycler_view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        //Get data from JSON file here
        eventBriefs = dummyData();
        eventList = dummyEventsData();

        EventsAdapter adapter = new EventsAdapter(eventBriefs, eventList, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        /*recyclerView.addOnItemTouchListener(new EventsRecyclerViewTouchListener(getContext(), recyclerView, new EventsRecyclerViewTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                EventBrief eventBrief = eventBriefs.get(position); //Selected Event Brief
                Event event = eventList.get(position);
                //Launch Event activity.
                Intent intent = new Intent(getContext(), EventView.class);
                intent.putExtra("event", event);
                Log.d("Events fragment", "EventView Activity launched for " + event.getName());
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {
                //Nothing required...
            }
        }));*/

        /*myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                EventBrief eventBrief = dataSnapshot.getValue(EventBrief.class);
                Log.v("Events data retrieval", "onChildAdded " + eventBrief.getName());
                eventBriefs.add(eventBrief);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });*/
    }
}
