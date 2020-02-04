
package com.example.cookingmaster.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.cookingmaster.R;
import com.example.cookingmaster.model.Categories;
import com.example.cookingmaster.model.Meals;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ViewPagerHeaderAdapter extends PagerAdapter {

//    private List<Meals.Meal> meals;
    private List<Categories.Category> meals;
    private Context context;
    private static ClickListener clickListener;

    public ViewPagerHeaderAdapter(List<Categories.Category> meals, Context context) {
        this.meals = meals;
        this.context = context;
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        ViewPagerHeaderAdapter.clickListener = clickListener;
    }

    @Override
    public int getCount() {
        return meals.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_view_pager_header,
                container,
                false
        );

        ImageView mealThumb = view.findViewById(R.id.mealThumb);
        TextView mealName = view.findViewById(R.id.mealName);

//        String strMealThumb = meals.get(position).getStrMealThumb();
        String strMealThumb = meals.get(position).getStrCategoryThumb();
        Picasso.get().load(strMealThumb).into(mealThumb);

//        String strMealName = meals.get(position).getStrMeal();
        String strMealName = meals.get(position).getStrCategory();
        mealName.setText(strMealName);

        view.setOnClickListener(v -> clickListener.onMealClick(v, position));

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    public interface ClickListener {
        void onMealClick(View v, int position);
    }
}
