package com.chat.retrofitapi2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
MyAdapter mAdapter;
    ArrayList<ApiData.Result> UserList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ApiData> call =apiService.getApiData("1","6");
        call.enqueue(new Callback<ApiData>() {
            @Override
            public void onResponse(Call<ApiData> call, Response<ApiData> response) {

                if (response.code()==200) {

                    if (response.body()!= null) {

                        mAdapter = new MyAdapter(response.body().getResult());
                        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                        recyclerView.setLayoutManager(mLayoutManager);
                        recyclerView.setAdapter(mAdapter);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "server issue", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ApiData> call, Throwable t) {

            }
        });
    }


}