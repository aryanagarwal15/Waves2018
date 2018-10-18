package org.bits_waves.waves2018.ListItems;

public class SpotOnItem {
    private String eventName;
    private String data;

    public void SpotOnItem(SpotOnItem spotOnItem) {
        this.data = spotOnItem.data;
        this.eventName = spotOnItem.eventName;
    }

    public void SpotOnItem(String eventName, String data) {
        this.eventName = eventName;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getEventName() {
        return eventName;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
