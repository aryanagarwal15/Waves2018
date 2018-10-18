package org.bits_waves.waves2018;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.bits_waves.waves2018.ListItems.SpotOnItem;

public class SpotOnViewHolder extends RecyclerView.ViewHolder {

    private TextView eventName;
    private TextView data;

    public SpotOnViewHolder(View itemView) {
        super(itemView);
        eventName = (TextView) itemView.findViewById(R.id.spoton_rv_item_eventname);
        data = (TextView) itemView.findViewById(R.id.spoton_rv_item_data);
    }

    public void populate(SpotOnItem spotOnItem) {
        eventName.setText(spotOnItem.getEventName());
        data.setText(spotOnItem.getData());
    }
}
