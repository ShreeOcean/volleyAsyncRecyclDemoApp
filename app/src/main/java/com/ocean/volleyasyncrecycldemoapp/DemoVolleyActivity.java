package com.ocean.volleyasyncrecycldemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ocean.volleyasyncrecycldemoapp.databinding.ActivityDemoVolleyBinding;

public class DemoVolleyActivity extends AppCompatActivity implements View.OnClickListener
  {

    ActivityDemoVolleyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_demo_volley);


    }
}