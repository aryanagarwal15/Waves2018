package org.bits_waves.waves2018.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;

import org.bits_waves.waves2018.Fragments.EventsCardFragment;
import org.bits_waves.waves2018.Fragments.EventsEventsFragment;

import java.util.ArrayList;
import java.util.List;

public class EventsEventsCardFragmentPagerAdapter extends FragmentStatePagerAdapter implements EventsEventsFragment.CardAdapter{

    private List<EventsCardFragment> mFragments;
    private float mBaseElevation;

    public EventsEventsCardFragmentPagerAdapter(FragmentManager fm, float baseElevation) {
        super(fm);
        mFragments = new ArrayList<>();
        mBaseElevation = baseElevation;

        for(int i = 0; i< 5; i++){
            addCardFragment(new EventsCardFragment());
        }
    }

    @Override
    public float getBaseElevation() {
        return mBaseElevation;
    }

    @Override
    public CardView getCardViewAt(int position) {
        return mFragments.get(position).getCardView();
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Object fragment = super.instantiateItem(container, position);
        mFragments.set(position, (EventsCardFragment) fragment);
        return fragment;
    }

    public void addCardFragment(EventsCardFragment fragment) {
        mFragments.add(fragment);
    }
}
