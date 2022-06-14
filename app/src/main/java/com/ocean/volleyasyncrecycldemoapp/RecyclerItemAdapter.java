package com.ocean.volleyasyncrecycldemoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ocean.volleyasyncrecycldemoapp.databinding.CustomRecyclerItemBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerItemAdapter extends RecyclerView.Adapter<RecyclerItemAdapter.MyViewHolder> {

    private List<PopularMovieResultsPOJO> list;
    private Context context;

    public RecyclerItemAdapter(ArrayList<ProfileDetailsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerItemAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        CustomRecyclerItemBinding binding;
        binding = CustomRecyclerItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerItemAdapter.MyViewHolder holder, int position) {

        String posterImage = Utility.IMAGE_BASE_URL + list.get(position).getPosterPath();

        Glide.with(context).load(posterImage).into(holder.binding.moviePosterIv);

        holder.binding.movieTitleTv.setText(list.get(position).getOriginalTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        CustomRecyclerItemBinding binding;
        public MyViewHolder(CustomRecyclerItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
