package com.example.slem.loginswipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import java.util.List;
import java.util.Vector;


public class MainActivity extends FragmentActivity {
    private PageAdapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisePaging();
    }


    private void initialisePaging() {
        // TODO Auto-generated method stub
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this,FragmentLogin.class.getName()));
        fragments.add(Fragment.instantiate(this, FragmentRegister.class.getName()));

        mPagerAdapter=new PageAdapter(this.getSupportFragmentManager(),fragments);

        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setAdapter(mPagerAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
