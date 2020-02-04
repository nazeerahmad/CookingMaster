/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.example.cookingmaster.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import retrofit2.SkipCallbackExecutor;

public class Meals {

    @SerializedName("meals")
    @Expose
    private List<Meal> meals = null;

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public class Meal {
        @SerializedName("idMeal")
        private String idMeal;
        @SerializedName("strMeal")
        private String strMeal;
        @SerializedName("strDrinkAlternate")
        private String strDrinkAlternate;
        @SerializedName("strCategory")
        private String strCategory;
        @SerializedName("strArea")
        private String strArea;
        @SerializedName("strInstructions")
        private String strInstructions;
        @SerializedName("strMealThumb")
        private String strMealThumb;

        @SerializedName("strTags")
        private String strTags;
        @SerializedName("strYouTube")
        private String strYouTube;

        @SerializedName("strIngredient1")
        private String strIngredient1;
        @SerializedName("strIngredient2")
        private String strIngredient2;
        @SerializedName("strIngredient3")
        private String strIngredient3;
        @SerializedName("strIngredient4")
        private String strIngredient4;
        @SerializedName("strIngredient5")
        private String strIngredient5;
        @SerializedName("strIngredient6")
        private String strIngredient6;
        @SerializedName("strIngredient7")
        private String strIngredient7;
        @SerializedName("strIngredient8")
        private String strIngredient8;
        @SerializedName("strIngredient9")
        private String strIngredient9;
        @SerializedName("strIngredient10")
        private String strIngredient10;
        //tatal 20 ingrediants available
        @SerializedName("strMeasure1")
        private String strMeasure1;
        @SerializedName("strMeasure2")
        private String strMeasure2;
        @SerializedName("strMeasure3")
        private String strMeasure3;
        @SerializedName("strMeasure4")
        private String strMeasure4;
        @SerializedName("strMeasure5")
        private String strMeasure5;
        //total 20 strMeasures available
        @SerializedName("strSource")
        private String strSource;
        @SerializedName("dateModified")
        private Object dateModified;

        public String getIdMeal() {
            return idMeal;
        }

        public void setIdMeal(String idMeal) {
            this.idMeal = idMeal;
        }

        public String getStrMeal() {
            return strMeal;
        }

        public void setStrMeal(String strMeal) {
            this.strMeal = strMeal;
        }

        public String getStrDrinkAlternate() {
            return strDrinkAlternate;
        }

        public void setStrDrinkAlternate(String strDrinkAlternate) {
            this.strDrinkAlternate = strDrinkAlternate;
        }

        public String getStrCategory() {
            return strCategory;
        }

        public void setStrCategory(String strCategory) {
            this.strCategory = strCategory;
        }

        public String getStrArea() {
            return strArea;
        }

        public void setStrArea(String strArea) {
            this.strArea = strArea;
        }

        public String getStrInstructions() {
            return strInstructions;
        }

        public void setStrInstructions(String strInstructions) {
            this.strInstructions = strInstructions;
        }

        public String getStrMealThumb() {
            return strMealThumb;
        }

        public void setStrMealThumb(String strMealThumb) {
            this.strMealThumb = strMealThumb;
        }

        public String getStrTags() {
            return strTags;
        }

        public void setStrTags(String strTags) {
            this.strTags = strTags;
        }

        public String getStrYouTube() {
            return strYouTube;
        }

        public void setStrYouTube(String strYouTube) {
            this.strYouTube = strYouTube;
        }

        public String getStrIngredient1() {
            return strIngredient1;
        }

        public void setStrIngredient1(String strIngredient1) {
            this.strIngredient1 = strIngredient1;
        }

        public String getStrIngredient2() {
            return strIngredient2;
        }

        public void setStrIngredient2(String strIngredient2) {
            this.strIngredient2 = strIngredient2;
        }

        public String getStrIngredient3() {
            return strIngredient3;
        }

        public void setStrIngredient3(String strIngredient3) {
            this.strIngredient3 = strIngredient3;
        }

        public String getStrIngredient4() {
            return strIngredient4;
        }

        public void setStrIngredient4(String strIngredient4) {
            this.strIngredient4 = strIngredient4;
        }

        public String getStrIngredient5() {
            return strIngredient5;
        }

        public void setStrIngredient5(String strIngredient5) {
            this.strIngredient5 = strIngredient5;
        }

        public String getStrIngredient6() {
            return strIngredient6;
        }

        public void setStrIngredient6(String strIngredient6) {
            this.strIngredient6 = strIngredient6;
        }

        public String getStrIngredient7() {
            return strIngredient7;
        }

        public void setStrIngredient7(String strIngredient7) {
            this.strIngredient7 = strIngredient7;
        }

        public String getStrIngredient8() {
            return strIngredient8;
        }

        public void setStrIngredient8(String strIngredient8) {
            this.strIngredient8 = strIngredient8;
        }

        public String getStrIngredient9() {
            return strIngredient9;
        }

        public void setStrIngredient9(String strIngredient9) {
            this.strIngredient9 = strIngredient9;
        }

        public String getStrIngredient10() {
            return strIngredient10;
        }

        public void setStrIngredient10(String strIngredient10) {
            this.strIngredient10 = strIngredient10;
        }

        public String getStrMeasure1() {
            return strMeasure1;
        }

        public void setStrMeasure1(String strMeasure1) {
            this.strMeasure1 = strMeasure1;
        }

        public String getStrMeasure2() {
            return strMeasure2;
        }

        public void setStrMeasure2(String strMeasure2) {
            this.strMeasure2 = strMeasure2;
        }

        public String getStrMeasure3() {
            return strMeasure3;
        }

        public void setStrMeasure3(String strMeasure3) {
            this.strMeasure3 = strMeasure3;
        }

        public String getStrMeasure4() {
            return strMeasure4;
        }

        public void setStrMeasure4(String strMeasure4) {
            this.strMeasure4 = strMeasure4;
        }

        public String getStrMeasure5() {
            return strMeasure5;
        }

        public void setStrMeasure5(String strMeasure5) {
            this.strMeasure5 = strMeasure5;
        }

        public String getStrSource() {
            return strSource;
        }

        public void setStrSource(String strSource) {
            this.strSource = strSource;
        }

        public Object getDateModified() {
            return dateModified;
        }

        public void setDateModified(Object dateModified) {
            this.dateModified = dateModified;
        }
    }
}
