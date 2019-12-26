package com.chat.retrofitapi2.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.util.Log;
import android.widget.Toast;

import com.chat.retrofitapi2.ApiClient;
import com.chat.retrofitapi2.ApiInterface;
import com.chat.retrofitapi2.LoginData;
import com.chat.retrofitapi2.MainActivity;
import com.chat.retrofitapi2.MyAdapter;
import com.chat.retrofitapi2.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {
    String TAG="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ApiInterface apiInterface = ApiClient.getLogin().create(ApiInterface.class);

//        "kim", "1234567", "mobile"
        LoginBody body = new LoginBody("mobile","1234567","kim");
        Call<LoginData> call = apiInterface.getLoginData(body);
        Log.d(TAG, "onCreate: ");
        call.enqueue(new Callback<LoginData>() {
            @Override
            public void onResponse(Call<LoginData> call, Response<LoginData> response) {
                Toast.makeText(Login.this, ""+response, Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onResponse: " + response.body().getDescription().getStatus());


//                if (response.code()==200) {
//
//                    if (response.body()!= null) {
//                        Log.d(TAG, "onResponse: "+response.body().toString());
//                        Toast.makeText(Login.this, "success"+response.body().toString(), Toast.LENGTH_SHORT).show();
//
//                    }
//                } else {
//                    Toast.makeText(Login.this, "server issue", Toast.LENGTH_SHORT).show();
//                }

//                Toast.makeText(Login.this, " "+object, Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Call<LoginData> call, Throwable t) {
                Toast.makeText(Login.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });


    }
}
