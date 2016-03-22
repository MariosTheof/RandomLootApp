package com.example.android.dd5thrandomloot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        populatingArray();
    }



    private String[] mundaneLoot = new String[3];
    private void populatingArray(){
        mundaneLoot[0] = "scrap";
        mundaneLoot[1] = "vial of antitoxin";
        mundaneLoot[2] = "worn whetstone";
    }
}
