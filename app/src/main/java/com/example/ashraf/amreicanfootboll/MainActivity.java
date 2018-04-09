package com.example.ashraf.amreicanfootboll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorTeemA = 0;
    int scorTeemB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display_TeemA(int score) {
        TextView t1 = (TextView) findViewById(R.id.TeemA);
        t1.setText(String.valueOf(score));
    }

    public void score_teemA_b1(View view) {
        scorTeemA = scorTeemA + 6;
        display_TeemA(scorTeemA);
    }

    public void score_teemA_b2(View view) {
        scorTeemA = scorTeemA + 3;
        display_TeemA(scorTeemA);
    }

    public void score_teemA_b3(View view) {
        scorTeemA = scorTeemA + 2;
        display_TeemA(scorTeemA);
    }

    public void score_teemA_b4(View view) {
        scorTeemA = scorTeemA + 1;
        display_TeemA(scorTeemA);
    }

    public void display_TeemB(int scor) {
        TextView t2 = (TextView) findViewById(R.id.TeemB);
        t2.setText(String.valueOf(scor));
    }

    public void score_teemB_b1(View view) {
        scorTeemB = scorTeemB + 6;
        display_TeemB(scorTeemB);
    }

    public void score_teemB_b2(View view) {
        scorTeemB = scorTeemB + 3;
        display_TeemB(scorTeemB);
    }

    public void score_teemB_b3(View view) {
        scorTeemB = scorTeemB + 2;
        display_TeemB(scorTeemB);
    }

    public void score_teemB_b4(View view) {
        scorTeemB = scorTeemB + 1;
        display_TeemB(scorTeemB);
    }

    public void reset_value(View view) {
        scorTeemA = 0;
        scorTeemB = 0;
        display_TeemA(scorTeemA);
        display_TeemB(scorTeemB);
    }


}
