package com.shankaryadav.www.customstyle.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shankaryadav.www.customstyle.R;
import com.shankaryadav.www.customstyle.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.List;

// This activity will display a custom image composed of three body parts: head, body ad legs

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (savedInstanceState == null) {

            BodyPartFragment headFragment = new BodyPartFragment();
            headFragment.setHeadList(AndroidImageAssets.getHeads());
            headFragment.setHeadIndex(1);

            BodyPartFragment bodyFragment = new BodyPartFragment();
            bodyFragment.setBodyList(AndroidImageAssets.getBodies());
            bodyFragment.setBodyIndex(1);

            BodyPartFragment legFragment = new BodyPartFragment();
            legFragment.setLegList(AndroidImageAssets.getLeg());
            legFragment.setLegIndex(1);

            FragmentManager fragment = getSupportFragmentManager();

            fragment.beginTransaction()
                    .add(R.id.head_container, headFragment)
                    .commit();

            fragment.beginTransaction()
                    .add(R.id.body_container, bodyFragment)
                    .commit();

            fragment.beginTransaction()
                    .add(R.id.leg_container, legFragment)
                    .commit();

        }

    }
}
