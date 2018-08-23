package org.bits_waves.waves2018;

import android.content.Context;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FileHelper {
    private static String day0File = "day0.txt";
    private static String day1File = "day1.txt";
    private static String day2File = "day2.txt";
    private static String day3File = "day3.txt";
    private static String fileName = null;
    static String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/assets/schedule/";
    final static String TAG = FileHelper.class.getName();

    public static List<String> ReadFile(Context context, int day) {
        String line = null;
        List<String> out = new List<String>() {
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

        //path = Environment.getDataDirectory().getAbsolutePath() + Environment.getExternalStorageDirectory().getAbsolutePath() +"/assets/schedule";
        path = context.getFilesDir() + "/assets/schedule/";

        switch(day) {
            case 0:
                fileName = day0File;
                break;
            case 1:
                fileName = day1File;
                break;
            case 2:
                fileName = day2File;
                break;
            case 3:
                fileName = day3File;
                break;
            default:
                fileName = day0File;
                break;
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(path+fileName));
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //StringBuilder stringBuilder = new StringBuilder();

            while((line = bufferedReader.readLine()) != null) {
                out.add(line);
            }

        } catch(FileNotFoundException ex) {
            Log.d(TAG, ex.getMessage());
        } catch(IOException ex) {
            Log.d(TAG, ex.getMessage());
        }

        return out;
    }
}
