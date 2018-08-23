package org.bits_waves.waves2018.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.bits_waves.waves2018.Activities.Events;
import org.bits_waves.waves2018.ListItems.EventsCardItem;
import org.bits_waves.waves2018.R;
import org.bits_waves.waves2018.Fragments.EventsFragment;

import java.util.ArrayList;
import java.util.List;

public class EventsViewCardPagerAdapter extends PagerAdapter implements EventsFragment.CardAdapter {

    private List<CardView> mViews;
    private List<EventsCardItem> mData;
    private float mBaseElevation;

    public EventsViewCardPagerAdapter() {
        mData = new ArrayList<>();
        mViews = new ArrayList<>();
    }

    public void addCardItem(EventsCardItem item) {
        mViews.add(null);
        mData.add(item);
    }

    public float getBaseElevation() {
        return mBaseElevation;
    }

    @Override
    public CardView getCardViewAt(int position) {
        return mViews.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext())
                .inflate(R.layout.adapter_events, container, false);
        container.addView(view);
        bind(mData.get(position), view, container.getContext());
        CardView cardView = (CardView) view.findViewById(R.id.cardview_events);

        if (mBaseElevation == 0) {
            mBaseElevation = cardView.getCardElevation();
        }

        cardView.setMaxCardElevation(mBaseElevation * MAX_ELEVATION_FACTOR);
        mViews.set(position, cardView);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        mViews.set(position, null);
    }

    private void bind(final EventsCardItem item, View view, final Context context) {
        TextView eventsTitleTextView = (TextView) view.findViewById(R.id.textview_title_events_fragment_item);
        TextView eventsContentTextView = (TextView) view.findViewById(R.id.textview_text_events_fragment_item);
        eventsContentTextView.setVisibility(View.GONE);

        Button eventsButton = (Button) view.findViewById(R.id.button_events_fragment_item);
        eventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Events.class);
                intent.putExtra("event_name", item.getmTitleResource());
                intent.putExtra("event_img", item.getImgUrl());
                context.startActivity(intent);
            }
        });
        eventsTitleTextView.setText(item.getmTextResource());
        //eventsContentTextView.setText(item.getText());
    }
}
