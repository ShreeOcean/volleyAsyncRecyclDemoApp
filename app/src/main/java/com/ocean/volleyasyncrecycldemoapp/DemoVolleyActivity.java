package com.ocean.volleyasyncrecycldemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ocean.volleyasyncrecycldemoapp.databinding.ActivityDemoVolleyBinding;

public class DemoVolleyActivity extends AppCompatActivity {

    ActivityDemoVolleyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_demo_volley);

        getMovieList();


    }

    private void getMovieList() {

        String url = Utility.BASE_URL + Utility.POPULAR_MOVIE_URL + "api_key=" + Utility.KEY;
    }
}