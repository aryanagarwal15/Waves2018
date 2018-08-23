package org.bits_waves.waves2018.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2018.R;


public class EventsCardFragment extends Fragment {

    private CardView mCardView;
    //private Button mButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.adapter_events, container, false);
        mCardView = (CardView) view.findViewById(R.id.cardview_events);
        mCardView.setMaxCardElevation(mCardView.getCardElevation()
                * EventsFragment.CardAdapter.MAX_ELEVATION_FACTOR);
        return view;
    }

    public CardView getCardView() {
        return mCardView;
    }
}
