package com.example.android.dd5thrandomloot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        populatingArray();

        Button b = (Button)findViewById(R.id.mundaneLoot);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pop.class ));
            }

        });

    }
//    private void setupMessageButton() {
//        //1. Get a reference to the button
//        Button messageButton = (Button) findViewById(R.id.mundaneLoot);
//
//        //2. Set the click listener to run my code
//        View.OnClickListener     myListener = new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Log.i("DemoButtonApp", "You clicked the button");
//                Toast.makeText(MainActivity.this,"You clicked it", Toast.LENGTH_LONG).show();
//            }
//        };
//        messageButton.setOnClickListener(myListener);
//    }
    private String[] mundaneLoot = new String[3];

    private void populatingArray() {
        mundaneLoot[0] = "scrap";
        mundaneLoot[1] = "vial of antitoxin";
        mundaneLoot[2] = "worn whetstone";
    }
}





