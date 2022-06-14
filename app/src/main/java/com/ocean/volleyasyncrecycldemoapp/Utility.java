package com.ocean.volleyasyncrecycldemoapp;

import android.content.Context;
import android.widget.Toast;

public class Utility {

    public static final String BASE_URL = "https://api.themoviedb.org";
    public static final String KEY = "cd852112b111a64a51cb4cade02819d8";
    public static final String  IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500";
    public static final String POPULAR_MOVIE_URL = "/3/movie/popular?";
    public static final String AUTH_KEY_SIAURL = "961900e553a352d424dbf7b6942cc973";

    public static void showShortToast(Context context, String msg){
        Toast.makeText(context,  msg, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
