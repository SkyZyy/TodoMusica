package com.example.todomusica.Class;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.todomusica.DemoFragment;
import com.example.todomusica.FeedFragment;
import com.example.todomusica.RecommendedFragment;
import com.example.todomusica.SearchFragment;

public class CollectionPagerAdapter extends FragmentStatePagerAdapter {
    public CollectionPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new DemoFragment();

        if (position == 0){
            fragment = new FeedFragment();
            Bundle args = new Bundle();
            fragment.setArguments(args);
        }
        else if (position == 1){
            fragment = new RecommendedFragment();
            Bundle args = new Bundle();
            fragment.setArguments(args);
        }
        else if (position == 2){
            fragment = new SearchFragment();
            Bundle args = new Bundle();
            fragment.setArguments(args);
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String response = "";

        if (position == 0){
            response = "Seguidos";
        }
        else if (position == 1){
            response = "Recomendado";
        }
        else if (position == 2){
            response = "Artistas";
        }

        return  response;
    }
}
