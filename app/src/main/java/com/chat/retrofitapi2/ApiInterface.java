package com.chat.retrofitapi2;

import com.chat.retrofitapi2.ui.LoginBody;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("Default.aspx?Action=getDashboard")
    Call<ApiData> getApiData(@Query("from") String ufrom,@Query("to") String uto);

//    @POST("InningsClient.svc/Login")
//    Call<LoginData> getLoginData(@Query("username") String uname,@Query("pwd") String password,@Query("context") String loginContext);

    @POST("InningsClient.svc/Login")
    Call<LoginData> getLoginData(@Body LoginBody loginBody);
}
