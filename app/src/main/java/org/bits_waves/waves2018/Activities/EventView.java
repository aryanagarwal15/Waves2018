package org.bits_waves.waves2018.Activities;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.bits_waves.waves2018.ListItems.Event;
import org.bits_waves.waves2018.R;

public class EventView extends AppCompatActivity {

    Event event;
    TextView name;
    TextView description;
    TextView rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_view);
        event = (Event) getIntent().getParcelableExtra("event");

        name = (TextView) findViewById(R.id.eventview_title);
        description = (TextView) findViewById(R.id.eventview_description);
        rules = (TextView) findViewById(R.id.eventview_rules);

        name.setText(event.getName());
        description.setText(event.getDescription());
        rules.setText(event.getRules());
    }
}
