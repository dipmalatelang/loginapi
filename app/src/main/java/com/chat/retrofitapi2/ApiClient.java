package com.chat.retrofitapi2;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static okhttp3.logging.HttpLoggingInterceptor.Level.BODY;


public class ApiClient {

    public static final String BASE_URL = "http://80.241.222.135/mobileapp-webserviceDTSFREE/new/";
    public static final String Login_URL ="http://167.86.74.159/InningsClient/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(100, TimeUnit.SECONDS)
                .build();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }
    public static Retrofit getLogin()
    {
        HttpLoggingInterceptor interceptor =new HttpLoggingInterceptor();
        interceptor.setLevel(BODY);
        OkHttpClient client =new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(100,TimeUnit.SECONDS)
                .readTimeout(100,TimeUnit.SECONDS)
                .build();

            if(retrofit ==null)
                retrofit =new Retrofit.Builder()
                        .baseUrl(Login_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(client)
                        .build();
            return retrofit;
    }
}
