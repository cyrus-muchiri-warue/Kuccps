package com.example.kuccps.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.kuccps.ADAPTERS.FragmentAdapter;
import com.example.kuccps.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Main3Activity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    LoginFragment loginFragment;
    NavigationView navigationView;
    Toolbar toolbar;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("HOME");

        setSupportActionBar(toolbar);


        loginFragment = new LoginFragment();
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        navigationView = findViewById(R.id.navigation_view);

        tabLayout.addTab(tabLayout.newTab().setText("Arts"));
        tabLayout.addTab(tabLayout.newTab().setText("Sciences"));
        tabLayout.addTab(tabLayout.newTab().setText("Engineering"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), getApplicationContext(), tabLayout.getTabCount());
        viewPager.setAdapter(fragmentAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                Toast.makeText(getApplicationContext(), tab.getText(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


}

