package com.example.firebaseinstagramclone.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebaseinstagramclone.databinding.RecyclerRowBinding;
import com.example.firebaseinstagramclone.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class postAdapter extends RecyclerView.Adapter<postAdapter.postHolder> {

    ArrayList<Post> postArrayList;
    public postAdapter (ArrayList<Post> postArrayList){
        this.postArrayList=postArrayList;
    }
    @NonNull
    @Override
    public postHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new postHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull postHolder holder, int position) {
        holder.recyclerRowBinding.recyclerviewcommentview.setText(postArrayList.get(position).comment);
        holder.recyclerRowBinding.recyclerviewemailtextview.setText(postArrayList.get(position).email);
        Picasso.get().load(postArrayList.get(position).image).into(holder.recyclerRowBinding.recyclerviewimageview);
    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }

    public class postHolder extends RecyclerView.ViewHolder{

        public RecyclerRowBinding recyclerRowBinding;
        public postHolder(RecyclerRowBinding recyclerRowBinding) {
            super(recyclerRowBinding.getRoot());
            this.recyclerRowBinding=recyclerRowBinding;
        }
    }
}
