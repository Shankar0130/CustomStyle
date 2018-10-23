package com.shankaryadav.www.customstyle.ui;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.shankaryadav.www.customstyle.R;
import com.shankaryadav.www.customstyle.data.AndroidImageAssets;

public class CustomStyleActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_style);

        MasterListFragment masterListFragment = new MasterListFragment();
        masterListFragment.setmContext(CustomStyleActivity.this);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.masterFrameLayout,masterListFragment)
                .commit();


    }


}
