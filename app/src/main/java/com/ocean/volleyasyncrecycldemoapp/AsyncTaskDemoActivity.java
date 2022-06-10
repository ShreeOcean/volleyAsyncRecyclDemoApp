package com.ocean.volleyasyncrecycldemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

import com.ocean.volleyasyncrecycldemoapp.databinding.ActivityAsyncDemoBinding;
import com.ocean.volleyasyncrecycldemoapp.databinding.ActivityDemoVolleyBinding;

import java.util.List;

public class AsyncTaskDemoActivity extends AppCompatActivity {

    ActivityAsyncDemoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAsyncDemoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        AsyncTaskRunner runner = new AsyncTaskRunner();
//        runner.execute();
        // TODO: call asyncTask to execute
        new AsyncTaskRunner().execute();


    }

    public class AsyncTaskRunner extends AsyncTask<String, String, String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            binding.progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... strings) {



            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }

}