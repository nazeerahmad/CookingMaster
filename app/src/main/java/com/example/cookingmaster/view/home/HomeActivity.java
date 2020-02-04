package com.example.cookingmaster.view.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.cookingmaster.R;
import com.example.cookingmaster.Utils;
import com.example.cookingmaster.adapter.RecyclerViewHomeAdapter;
import com.example.cookingmaster.adapter.ViewPagerHeaderAdapter;
import com.example.cookingmaster.model.Categories;
import com.example.cookingmaster.model.Meals;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements HomeView,RecyclerViewHomeAdapter.ClickListener,ViewPagerHeaderAdapter.ClickListener {


    @BindView(R.id.viewPagerHeader)
    ViewPager viewPagerHeaderMeals;
    @BindView(R.id.recyclerCategory)
    RecyclerView recyclerViewCategory;

    private HomePresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        presenter =new HomePresenter(this);
        presenter.getMealCategory();
        presenter.getAllMeals();

    }

    @Override
    public void showLoading() {
        findViewById(R.id.shimmerMeal).setVisibility(View.VISIBLE);
        findViewById(R.id.shimmerCategory).setVisibility(View.VISIBLE);

    }

    @Override
    public void hideLoading() {
        findViewById(R.id.shimmerMeal).setVisibility(View.GONE);
        findViewById(R.id.shimmerCategory).setVisibility(View.GONE);
    }

    @Override
    public void setMealsList(List<Categories.Category> category) {
        category.remove(6);
        ViewPagerHeaderAdapter headerAdapter = new ViewPagerHeaderAdapter(category,this);
        viewPagerHeaderMeals.setAdapter(headerAdapter);
        viewPagerHeaderMeals.setPadding(20,0,150,0);
        headerAdapter.notifyDataSetChanged();
        headerAdapter.setOnItemClickListener(this::onClick);
    }

//    @Override
//    public void setMealsList(List<Meals.Meal> mealsList) {
//        ViewPagerHeaderAdapter headerAdapter = new ViewPagerHeaderAdapter(mealsList,this);
//        viewPagerHeaderMeals.setAdapter(headerAdapter);
//        viewPagerHeaderMeals.setPadding(20,0,150,0);
//        headerAdapter.notifyDataSetChanged();
//
//    }

    @Override
    public void setCategory(List<Categories.Category> category) {
        category.remove(6);
        RecyclerViewHomeAdapter homeAdapter = new RecyclerViewHomeAdapter(category,this);
        recyclerViewCategory.setAdapter(homeAdapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this,3
                ,GridLayoutManager.VERTICAL,false);
        recyclerViewCategory.setLayoutManager(layoutManager);
        recyclerViewCategory.setNestedScrollingEnabled(true);
        homeAdapter.notifyDataSetChanged();
        homeAdapter.setOnItemClickListener(this::onClick);
    }

    @Override
    public void onErrorLoading(String message) {
        Utils.showDialogMessage(this,"title",message);
    }

    @Override
    public void onClick(View view, int position) {

    }

    @Override
    public void onMealClick(View v, int position) {

    }
}
