package org.bits_waves.waves2018.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2018.Adapters.EventsAdapter;
import org.bits_waves.waves2018.ListItems.EventBrief;
import org.bits_waves.waves2018.R;

import java.util.ArrayList;
import java.util.List;

public class EventsFragmentSimple extends Fragment{

    RecyclerView recyclerView;

    private List<EventBrief> dummyData() {
        List<EventBrief> data = new ArrayList<>(5);
        for(int i=0; i<5; i++) {
            data.add(new EventBrief("Event"+i, "ingRes"+i, i));
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
        List eventData = dummyData();
        EventsAdapter adapter = new EventsAdapter(eventData);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
    }
}
