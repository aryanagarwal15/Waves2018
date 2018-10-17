package org.bits_waves.waves2018.ListItems;

import android.content.Context;

public class EventBrief {
    private String name;
    private int day;
    private String imgRes;
    private int imgResInt;

    EventBrief(EventBrief eventBrief, Context context) {
        this.name = eventBrief.name;
        this.day = eventBrief.day;
        this.imgRes = eventBrief.imgRes;
        //Gets the resource id from the string provided
        imgResInt = context.getResources().getIdentifier(imgRes,"drawable",context.getPackageName());
    }

    public EventBrief(String name, String imgRes, int day) {
        this.name = name;
        this.imgRes = imgRes;
        this.day = day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgRes(String imgRes, Context context) {
        this.imgRes = imgRes;
        imgResInt = context.getResources().getIdentifier(imgRes,"drawable",context.getPackageName());
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getImgRes() {
        return imgRes;
    }

    public int getImgResInt() {
        return imgResInt;
    }
}
