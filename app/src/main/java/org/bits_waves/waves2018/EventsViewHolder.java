package org.bits_waves.waves2018;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.bits_waves.waves2018.ListItems.EventBrief;

public class EventsViewHolder extends RecyclerView.ViewHolder{

    private ImageView eventImage;
    private TextView eventTitle;

    public EventsViewHolder(View itemView) {
        super(itemView);
        eventImage = itemView.findViewById(R.id.events_rv_item_imageview);
        eventTitle = itemView.findViewById(R.id.events_rv_item_title);
    }

    public void populate(EventBrief eventBrief) {
        eventTitle.setText(eventBrief.getName());
        //find how to convert string to it to set image resource
        //eventImage.setImageResource(eventBrief.getImgResInt());
        eventImage.setImageResource(R.drawable.ic_hand);
    }
}
