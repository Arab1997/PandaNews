package com.example.abdulloh.popularnews.api;

import com.example.abdulloh.popularnews.models.Coin;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

/*    @POST("auth")


    @GET("auth")
    Call<Coin> getNews(


            @Query("country")String country ,
            @Query("apiKey")String apiKey
    );*/

    @Headers({
            "Authorization", "Bearer "+ "OkM_9V_ilZ4Phaqwcjv2rs25HsOt7Qco"
    })

    /*@GET("api/Profiles/GetProfile?id={id}")
    Call<UserProfile> getUser(@Path("id") String id);*/

   @GET("coin")
    Call<Coin> getCoin(

            @Query("q") String keyword,
            @Query("language") String language,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey

    );

    Call<Coin> getCoin(String language, String token);
}
