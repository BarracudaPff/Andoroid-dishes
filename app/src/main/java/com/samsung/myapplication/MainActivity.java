package com.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.samsung.myapplication.models.DishesArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String rawJSON = getJsonContent("test");

        DishesArray array = new Gson().fromJson(rawJSON, DishesArray.class);
        System.out.println(rawJSON);
        System.out.println(array.dishes[0]);

    }

    public String getJsonContent(String filename) {
        InputStream ins = getResources().openRawResource(
                getResources().getIdentifier(filename, "raw", getPackageName()));

        Scanner scanner = new Scanner(ins);
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNext()) {
            builder.append(scanner.next());
        }
        return builder.toString();
    }
}
