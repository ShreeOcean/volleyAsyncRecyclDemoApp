package com.ocean.volleyasyncrecycldemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ocean.volleyasyncrecycldemoapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnVolleyCall.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DemoVolleyActivity.class));
        });
        binding.btnAsyncCall.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AsyncTaskDemoActivity.class));
        });
    }
}