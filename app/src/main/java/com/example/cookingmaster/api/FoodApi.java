package com.example.cookingmaster.api;

import com.example.cookingmaster.model.Categories;
import com.example.cookingmaster.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodApi {

    @GET("latest.php")
    Call<Meals> getMeals();
    @GET("categories.php")
    Call<Categories> getCategories();
}
