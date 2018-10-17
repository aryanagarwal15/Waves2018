package org.bits_waves.waves2018.Fragments;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2018.AccessJSON;
import org.bits_waves.waves2018.Adapters.EventsCardFragmentPagerAdapter;
import org.bits_waves.waves2018.Adapters.EventsCardPagerAdapter;
import org.bits_waves.waves2018.Adapters.EventsEventsCardFragmentPagerAdapter;
import org.bits_waves.waves2018.Adapters.EventsViewCardPagerAdapter;
import org.bits_waves.waves2018.FileHelper;
import org.bits_waves.waves2018.ListItems.EventsCardItem;
import org.bits_waves.waves2018.R;
import org.bits_waves.waves2018.ShadowTransformer;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EventsEventsFragment extends Fragment{
    private ViewPager mViewPager;
    int day = 0;
    Context context;

    //private boolean mShowingFragments = false;

    public static EventsEventsFragment newInstance() {
        EventsEventsFragment fragment = new EventsEventsFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onStart() {
        super.onStart();
        EventsViewCardPagerAdapter mCardAdapter = new EventsViewCardPagerAdapter();
        List<String> data = FileHelper.ReadFile(getActivity().getApplicationContext(), day);
        /*for(int i=0; i<data.size(); i++) {
            mCardAdapter.addCardItem((new EventsCardItem(data.get(i),getActivity().getApplicationContext())));
        }*/
        context = getContext();

        mCardAdapter.addCardItem(new EventsCardItem(getResources().getString(R.string.event_0),context));
        mCardAdapter.addCardItem(new EventsCardItem(getResources().getString(R.string.event_1),context));
        mCardAdapter.addCardItem(new EventsCardItem(getResources().getString(R.string.event_2),context));
        mCardAdapter.addCardItem(new EventsCardItem(getResources().getString(R.string.event_3),context));
        mCardAdapter.addCardItem(new EventsCardItem(getResources().getString(R.string.event_4),context));
        mCardAdapter.addCardItem(new EventsCardItem(getResources().getString(R.string.event_5),context));
        mCardAdapter.addCardItem(new EventsCardItem(getResources().getString(R.string.event_6),context));
        EventsEventsCardFragmentPagerAdapter mFragmentCardAdapter = new EventsEventsCardFragmentPagerAdapter(getFragmentManager(),
                dpToPixels(2, getActivity().getApplicationContext()));

        ShadowTransformer mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);
        //ShadowTransformer mFragmentCardShadowTransformer = new ShadowTransformer(mViewPager, mFragmentCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events_events,container, false);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager_events_events_fragment);
        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    public interface CardAdapter {

        int MAX_ELEVATION_FACTOR = 8;

        float getBaseElevation();

        CardView getCardViewAt(int position);

        int getCount();
    }

    public void updateEventsSecondary(int i) {
         day = i;
    }

    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }
}
