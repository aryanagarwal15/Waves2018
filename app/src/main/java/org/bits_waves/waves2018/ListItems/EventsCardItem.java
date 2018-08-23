package org.bits_waves.waves2018.ListItems;

import android.content.Context;
import android.content.res.Resources;

import org.bits_waves.waves2018.R;

public class EventsCardItem {
    private int mTextResource;
    private int mTitleResource;
    private String mTitle;
    private String mText;
    private String imgUrl;
    private int sizeOfEventsArray = 8;

    public EventsCardItem(String title, Context context) {
        mTitle = title;
        //mTitleResource = getResource(title);
        mTitleResource = Resources.getSystem().getIdentifier(title, "string", context.getPackageName());
        imgUrl = "https://img.freepik.com/free-vector/modern-dark-texture-background_1035-11632.jpg?size=338&ext=jpg";
    }

    public EventsCardItem(int title) {
        mTitleResource = title;
        //Error in next line. Need "android.R.string..." getting "R.string...."
        mTitle = Resources.getSystem().getString(title);
    }

    public int getmTextResource() {
        return mTextResource;
    }

    public int getmTitleResource() {
        return mTitleResource;
    }

    public String getmText() {
        return mText;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    /*public int getResource(String in) {
        String[] stringList = Resources.getSystem().getStringArray(R.array.events_array);
        if(in.equals(stringList[0]))
            return R.string.event_0;
        else if(in.equals(stringList[1]))
            return R.string.event_1;
        else if(in.equals(stringList[2]))
            return R.string.event_2;
        else if(in.equals(stringList[3]))
            return R.string.event_3;
        else if(in.equals(stringList[4]))
            return R.string.event_4;
        else if(in.equals(stringList[5]))
            return R.string.event_5;
        else if(in.equals(stringList[6]))
            return R.string.event_6;
        else if(in.equals(stringList[7]))
            return R.string.event_7;
        //Default
        return R.string.event_0;
    }*/

}
