package com.example.cookingmaster.view.home;

import com.example.cookingmaster.model.Categories;
import com.example.cookingmaster.model.Meals;

import java.util.List;

public interface HomeView {

    void showLoading();
    void hideLoading();
//    void setMealsList(List<Meals.Meal> mealsList);
    void setMealsList(List<Categories.Category> category);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
