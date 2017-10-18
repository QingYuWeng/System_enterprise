package com.example.yuwenqing.system_enterprise.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yuwenqing.system_enterprise.Fragment.firstFragment;
import com.example.yuwenqing.system_enterprise.Fragment.secondFragment;
import com.example.yuwenqing.system_enterprise.Fragment.thirdFragment;
import com.example.yuwenqing.system_enterprise.R;

public class MainActivity extends AppCompatActivity {


    private TextView title;

    //三个碎片
    private firstFragment first_Fragment;
    private secondFragment second_Fragment;
    private thirdFragment third_Fragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_message:
                    Toast.makeText(MainActivity.this,"消息",Toast.LENGTH_SHORT).show();
                    showFirstFragment();
                    title.setText("消息");
                    return true;
                case R.id.navigation_talents:
                    Toast.makeText(MainActivity.this,"实习生",Toast.LENGTH_SHORT).show();
                    showSecondFragment();
                    title.setText("人才库");
                    return true;
                case R.id.navigation_dashboard:
                    Toast.makeText(MainActivity.this,"控制台",Toast.LENGTH_SHORT).show();
                    showThirdFragment();
                    title.setText("控制台");
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //toolBar
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        title=(TextView) findViewById(R.id.barTitle);


        //toolbar icon
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //底部功能栏
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        showFirstFragment();
    }

    void showFirstFragment()
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();

        if(first_Fragment==null)
        {
            first_Fragment=new firstFragment();
            transaction.add(R.id.content,first_Fragment);
        }

        hideFragment(transaction);

        transaction.show(first_Fragment);

        transaction.commit();
    }

    void showSecondFragment()
    {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();

        if(second_Fragment==null)
        {
            second_Fragment=new secondFragment();
            transaction.add(R.id.content,second_Fragment);
        }

        hideFragment(transaction);

        transaction.show(second_Fragment);

        transaction.commit();
    }

    void showThirdFragment()
    {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();

        if(third_Fragment==null)
        {
            third_Fragment=new thirdFragment();
            transaction.add(R.id.content,third_Fragment);
        }

        hideFragment(transaction);

        transaction.show(third_Fragment);

        transaction.commit();
    }

    //隐藏所有碎片
    private void hideFragment(FragmentTransaction transaction){
        if(first_Fragment != null){
            transaction.hide(first_Fragment);
        }
        if(second_Fragment != null){
            transaction.hide(second_Fragment);
        }
        if(third_Fragment != null){
            transaction.hide(third_Fragment);
        }
    }
}
