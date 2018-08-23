package org.bits_waves.waves2018;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AccessJSON {
    private Context context;
    private FileInputStream fileIn;
    private FileOutputStream fileOut;
    private ObjectInputStream objectIn;
    private ObjectOutputStream objectOut;
    private Object outputObject;
    private String filePath;
    private List<String> stringListOut = new ArrayList<>();

    public AccessJSON(Context c){
        context = c;
    }

    public Object readObject(String fileName){
        try {
            filePath = context.getApplicationContext().getFilesDir().getAbsolutePath() + "/" + fileName;
            fileIn = new FileInputStream(filePath);
            objectIn = new ObjectInputStream(fileIn);
            outputObject = objectIn.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectIn != null) {
                try {
                    objectIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return outputObject;
    }

    public void writeObject(Object inputObject, String fileName){
        try {
            filePath = context.getApplicationContext().getFilesDir().getAbsolutePath() + "/" + fileName;
            fileOut = new FileOutputStream(filePath);
            objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(inputObject);
            fileOut.getFD().sync();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOut != null) {
                try {
                    objectOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
