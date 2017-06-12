package com.example.chartView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * hellochat中的线条图像
 */

public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void simpleLine(View view) {
        startActivity(new Intent(this, SimpleLineActivity.class));
    }

    public void helloChart(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

}
