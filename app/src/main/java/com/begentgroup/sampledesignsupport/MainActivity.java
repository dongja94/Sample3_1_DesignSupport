package com.begentgroup.sampledesignsupport;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = (NavigationView)findViewById(R.id.menu);
        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.getHeaderView(0);
        TextView nameView = (TextView)headerView.findViewById(R.id.textView);
        nameView.setText("YSI");
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_1 :
                startActivity(new Intent(this, TabLayoutActivity.class));
                return true;
            case R.id.menu_2 :
                startActivity(new Intent(this, TabPagerActivity.class));
                return true;
            case R.id.menu_3 :
//                startActivity(new Intent(this, TextInputActivity.class));
                startActivity(new Intent(this, CoordinatorActivity.class));
                return true;
            case R.id.menu_4 :
                startActivity(new Intent(this, AppBarActivity.class));
                return true;
        }
        return false;
    }
}
