
package com.gtbit.mentor;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


        ViewPager viewPager;
        ViewPagerAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

//            viewPager = (ViewPager) findViewById(R.id.view_pager);
//            adapter = new ViewPagerAdapter(this);
//            viewPager.setAdapter(adapter);


        }
    }
