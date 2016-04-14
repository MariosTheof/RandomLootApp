package com.example.android.dd5thrandomloot;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Athma_000 on 3/25/2016.
 */
public class Pop extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);

        populatingArray();
        String randomMundaneLoot = getRandom(mundaneLoot);

        TextView popUpMessage = (TextView)findViewById(R.id.editText);
        popUpMessage.setText(randomMundaneLoot);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width* .8),(int)(height* .6));
    }

    private String[] mundaneLoot = new String[3];

    private void populatingArray() {
        mundaneLoot[0] = "scrap";
        mundaneLoot[1] = "vial of antitoxin";
        mundaneLoot[2] = "worn whetstone";
    }
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

}
