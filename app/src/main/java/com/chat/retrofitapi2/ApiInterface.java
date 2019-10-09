package com.chat.retrofitapi2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("Default.aspx?Action=getDashboard")
    Call<ApiData> getApiData(@Query("from") String ufrom,@Query("to") String uto);
}
