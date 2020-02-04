package com.example.cookingmaster.view.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.cookingmaster.Utils;
import com.example.cookingmaster.model.Categories;
import com.example.cookingmaster.model.Meals;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePresenter {
    private HomeView view;

    public HomePresenter(HomeView view) {
        this.view = view;
    }


//    void getAllMeals(){
//        view.showLoading();
//        Call<Meals> mealsCall = Utils.getApi().getMeals();
//        mealsCall.enqueue(new Callback<Meals>() {
//            @Override
//            public void onResponse(Call<Meals> call, Response<Meals> response) {
//                view.hideLoading();
//                if(response.isSuccessful() && response.body()!=null){
//                    view.setMealsList(response.body().getMeals());
//                }else {
//                    view.onErrorLoading(response.message());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Meals> call, Throwable t) {
//                view.hideLoading();
//                view.onErrorLoading(t.getLocalizedMessage());
//            }
//        });
//    }

    void getAllMeals(){
        view.showLoading();
        Call<Categories> categoriesCall = Utils.getApi().getCategories();
        categoriesCall.enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(@NonNull Call<Categories> call, @NonNull Response<Categories> response) {
                view.hideLoading();
                if(response.isSuccessful() && response.body() !=null){
                    view.setMealsList(response.body().getCategories());
                }else {
                    view.onErrorLoading(response.message());
                }

            }

            @Override
            public void onFailure(@Nullable Call<Categories> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }

    void getMealCategory(){
        view.showLoading();
        Call<Categories> categoriesCall = Utils.getApi().getCategories();
         categoriesCall.enqueue(new Callback<Categories>() {
             @Override
             public void onResponse(@NonNull Call<Categories> call, @NonNull Response<Categories> response) {
                 view.hideLoading();
                 if(response.isSuccessful() && response.body() !=null){
                     view.setCategory(response.body().getCategories());
                 }else {
                     view.onErrorLoading(response.message());
                 }

             }

             @Override
             public void onFailure(@Nullable Call<Categories> call, @NonNull Throwable t) {
                    view.hideLoading();
                    view.onErrorLoading(t.getLocalizedMessage());
             }
         });
    }
}
