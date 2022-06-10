package com.ocean.volleyasyncrecycldemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ocean.volleyasyncrecycldemoapp.databinding.ActivityAsyncDemoBinding;
import com.ocean.volleyasyncrecycldemoapp.databinding.ActivityDemoVolleyBinding;

public class AsyncTaskDemoActivity extends AppCompatActivity {

    ActivityAsyncDemoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAsyncDemoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}