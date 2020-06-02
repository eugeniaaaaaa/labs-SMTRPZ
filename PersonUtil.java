package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.Writer;

public class PersonUtil {

    public static String toJson(Person person) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(person);
    }

    public static Person fromJson(String str){
        Gson gson = new Gson();
        return gson.fromJson(str,Person.class);
    }

}
