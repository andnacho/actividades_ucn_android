package com.example.actividades;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PostService {

    String API_ROUTE = "/posts";

    @GET(API_ROUTE)
    public Call<List <Post>> find(@Query("id") String id);

//    @GET(API_ROUTE)
//    public Call<List <Post>>  find();
}