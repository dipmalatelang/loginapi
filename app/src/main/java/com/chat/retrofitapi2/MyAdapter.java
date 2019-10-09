package com.chat.retrofitapi2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<ApiData.Result> UserList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview, parent, false);
        return new MyViewHolder(itemView);

    }

    public MyAdapter(ArrayList<ApiData.Result> UserList) {
        this.UserList = UserList;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final ApiData.Result user = UserList.get(position);
        holder.text.setText(user.getSymbol());


    }

    @Override
    public int getItemCount() {
        return UserList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView text;
        public MyViewHolder(@NonNull View itemView) {


            super(itemView);

            text =itemView.findViewById(R.id.text);
        }
    }
}
