package com.nashik.myNashik.dreams;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class autofare extends AppCompatActivity {
    ViewPager viewpager_autofare;
    TabLayout tabLayout_autofare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_autofare);
            viewpager_autofare = (ViewPager) findViewById(R.id.viewpager_autofare);
            PagerAdapter pageradapter = new FixedTabs(getSupportFragmentManager());
            viewpager_autofare.setAdapter(pageradapter);
            viewpager_autofare.setCurrentItem(1);

            tabLayout_autofare = (TabLayout) findViewById(R.id.tablayout_autofare);
            tabLayout_autofare.setupWithViewPager(viewpager_autofare);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    class FixedTabs extends FragmentPagerAdapter {
        public String tab_names[]={"Night","Day"};
        public FixedTabs(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new autofare_night();
                case 1:
                    return new autofare_day();
                default:
                    return null;
            }
        }
        @Override
        public int getCount() {
            return tab_names.length;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return tab_names[position];
        }
    }
}


