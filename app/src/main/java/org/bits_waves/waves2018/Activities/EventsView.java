package org.bits_waves.waves2018.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.bits_waves.waves2018.Adapters.EventsCardFragmentPagerAdapter;
import org.bits_waves.waves2018.Adapters.EventsViewCardPagerAdapter;
import org.bits_waves.waves2018.ListItems.EventsCardItem;
import org.bits_waves.waves2018.R;
import org.bits_waves.waves2018.ShadowTransformer;

public class EventsView extends AppCompatActivity {

    //private boolean mShowingFragments = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_view);
        Intent intent = getIntent();
        int day = intent.getIntExtra("day", 0);


        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager_events_activity);

        //Code to display
        TextView titleTextView = (TextView) findViewById(R.id.textview_title_events_activity);
        titleTextView.setText("Day " + day);

        EventsViewCardPagerAdapter mCardAdapter = new EventsViewCardPagerAdapter();
        mCardAdapter.addCardItem(new EventsCardItem(R.string.event_1));
        mCardAdapter.addCardItem(new EventsCardItem(R.string.event_2));
        mCardAdapter.addCardItem(new EventsCardItem(R.string.event_3));
        mCardAdapter.addCardItem(new EventsCardItem(R.string.event_4));
        mCardAdapter.addCardItem(new EventsCardItem(R.string.event_5));
        mCardAdapter.addCardItem(new EventsCardItem(R.string.event_6));
        mCardAdapter.addCardItem(new EventsCardItem(R.string.event_7));
        //mCardAdapter.addCardItem(new EventsCardItem(R.string.event_8));
        EventsCardFragmentPagerAdapter mFragmentCardAdapter = new EventsCardFragmentPagerAdapter(getSupportFragmentManager(),
                dpToPixels(2, getApplicationContext()));

        ShadowTransformer mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);
        //ShadowTransformer mFragmentCardShadowTransformer = new ShadowTransformer(mViewPager, mFragmentCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);
    }

    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }
}
