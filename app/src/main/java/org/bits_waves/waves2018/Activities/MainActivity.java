package org.bits_waves.waves2018.Activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import org.bits_waves.waves2018.Fragments.EventsFragmentSimple;
import org.bits_waves.waves2018.Fragments.HomeFragment;
import org.bits_waves.waves2018.Fragments.SpotOnFragment;
import org.bits_waves.waves2018.R;
import org.bits_waves.waves2018.BottomNavigationViewHelper;


public class MainActivity extends AppCompatActivity{
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        BottomNavigationViewHelper.disableShiftMode(bottomNav);
        bottomNav.setSelectedItemId(R.id.bottom_nav_home);
        fragment = HomeFragment.newInstance();
        loadFragment(fragment); //Loading the fragment first time
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.bottom_nav_events:
                        fragment = EventsFragmentSimple.newInstance();
                        loadFragment(fragment);
                        break;
                    case R.id.bottom_nav_home:
                         fragment = HomeFragment.newInstance();
                        loadFragment(fragment);
                        break;
                    case R.id.bottom_nav_live:
                         fragment = SpotOnFragment.newInstance();
                        loadFragment(fragment);
                        break;
                    case R.id.bottom_nav_winners:
                         fragment = SpotOnFragment.newInstance();
                        loadFragment(fragment);
                        break;
                    case R.id.bottom_nav_voting:
                         fragment = SpotOnFragment.newInstance();
                        loadFragment(fragment);
                        break;
                }

                return true;
            }
        });


    }
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_activity_frame_layout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
