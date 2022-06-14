package com.ocean.volleyasyncrecycldemoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.ocean.volleyasyncrecycldemoapp.databinding.ActivityDemoVolleyBinding;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class DemoVolleyActivity extends AppCompatActivity {

    ActivityDemoVolleyBinding binding;
    String TAG = "DemoVolleyActivity";
    ProgressDialog progressDialog;

    //TODO: create model class obj
    ArrayList<ProfileDetailsModel> pdModel;

    RecyclerItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDemoVolleyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getMovieList();


    }

    private void getMovieList() {

        String urlEndProfileDetails = "customer_search.php";
        String siaUrl = "https://erpsurya.co.in/basic/api_tracker/" ;

        String url = siaUrl + urlEndProfileDetails;
                //Utility.BASE_URL + Utility.POPULAR_MOVIE_URL + "api_key=" + Utility.KEY;

        Log.d(TAG, "getMovieList: " + url);

        progressDialog = new ProgressDialog(this);
        progressDialog.show();


        JsonObjectRequest jsonObjRequest = new JsonObjectRequest(Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {  //TODO: new response listener
            @Override
            public void onResponse(JSONObject response) {

                Log.d(TAG, "onResponse: " + response.toString());
                String result = response.toString();
                try {

                    // main json obj
                    JSONObject jsonObjMain = new JSONObject(result);
                    String status = jsonObjMain.getString("status");

                    if (status.equalsIgnoreCase("success")){

                        //array json obj name as defined in url json data
                        JSONArray jsonArray = jsonObjMain.getJSONArray("customer_list");

                        for (int i = 0; i < jsonArray.length(); i++){

                            pdModel = new ArrayList<>();
                            //json obj name as refer under json array obj
                            JSONObject jsonObjCustomerList = jsonArray.getJSONObject(i);

                            String customer_name = jsonObjCustomerList.getString("customer_list");
                            String email_id = jsonObjCustomerList.getString("email_id");
                            String contact = jsonObjCustomerList.getString("contact");
                            String customer_id = jsonObjCustomerList.getString("customer_id");

                            //TODO: adding string objs to model class obj in a particular format
                            pdModel.add(new ProfileDetailsModel(customer_name,email_id,contact,customer_id));
                        }

                        // set adapter and layout manager for recycler item
                        adapter = new RecyclerItemAdapter(pdModel, DemoVolleyActivity.this);
                        binding.recyclerViewVolley.setHasFixedSize(true);
                        binding.recyclerViewVolley.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        binding.recyclerViewVolley.setAdapter(adapter);

                    }

                }catch (Exception exception){

                    Log.d(TAG, "Profile Details Error: " + exception.toString());
                    Toast.makeText(DemoVolleyActivity.this, "No profile details yet", Toast.LENGTH_SHORT).show();

                }
            }


        }, new Response.ErrorListener() { //TODO: response error listener
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d(TAG, "onErrorResponse: " + error.getMessage());
                if (error instanceof TimeoutError || error instanceof NoConnectionError){

                    Toast.makeText(DemoVolleyActivity.this, "Please check internet connection... !", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}