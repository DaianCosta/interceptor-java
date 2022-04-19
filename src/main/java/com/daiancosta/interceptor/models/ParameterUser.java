package com.daiancosta.interceptor.models;

import java.util.ArrayList;

public class ParameterUser {
    private static ParameterUser mInstance;
    private ArrayList<String> list = null;

    public static ParameterUser getInstance() {
        if(mInstance == null)
            mInstance = new ParameterUser();

        return mInstance;
    }

    private ParameterUser() {
        list = new ArrayList<String>();
        list.add("Removed");
        list.add("Confiable");
    }
    // retrieve array from anywhere
    public ArrayList<String> getArray() {
        return this.list;
    }
    //Add element to array
    public void addToArray(String value) {
        list.add(value);
    }
}
