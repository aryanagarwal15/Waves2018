package org.bits_waves.waves2018.ListItems;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Event {
    private String name;
    private String description;
    private String rules;
    private List<String> imgRes;

    public Event() {
        this.name =  "Def";
        this.description = "Def";
        this.rules = "Def";
        this.imgRes = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NonNull
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @NonNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NonNull
            @Override
            public <T> T[] toArray(@NonNull T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NonNull Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NonNull Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NonNull
            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @NonNull
            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @NonNull
            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        this.imgRes.clear();
        this.imgRes.add("Def");
    }

    public Event(Event event){
        this.name =  event.name;
        this.description = event.description;
        this.rules = event.rules;
        this.imgRes = event.imgRes;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getImgRes() {
        return imgRes;
    }

    public String getName() {
        return name;
    }

    public String getRules() {
        return rules;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setImgRes(String imgRes1, String imgRes2, String imgRes3) {
        this.imgRes.clear();
        this.imgRes.add(imgRes1);
        this.imgRes.add(imgRes2);
        this.imgRes.add(imgRes3);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
}
