package com.example.falaqi_safa_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message="Welcome to my first Java program";

        String words[] =message.split(" ");
        int i=0;
        for (String word : words) {
            if (i % 2 == 0)
                System.out.print(word + " ");
            i++;
        }
        String newstr;
        newstr=message.replaceAll("[AEIOUaeiou]", "");

        System.out.println("\n"+newstr);

    }



}
