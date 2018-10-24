package com.shankaryadav.www.customstyle.ui;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shankaryadav.www.customstyle.R;
import com.shankaryadav.www.customstyle.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.List;

// This activity will display a custom image composed of three body parts: head, body ad legs

public class MainActivity extends AppCompatActivity {

private int headindex;
private int bodyindex;
private int legindex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        headindex = b.getInt("headIndex");
        bodyindex = b.getInt("bodyIndex");
        legindex = b.getInt("legIndex");



        if (savedInstanceState == null) {

            BodyPartFragment headFragment = new BodyPartFragment();
            headFragment.setHeadList(AndroidImageAssets.getHeads());
            headFragment.setHeadIndex(headindex);

            BodyPartFragment bodyFragment = new BodyPartFragment();
            bodyFragment.setBodyList(AndroidImageAssets.getBodies());
            bodyFragment.setBodyIndex(bodyindex);

            BodyPartFragment legFragment = new BodyPartFragment();
            legFragment.setLegList(AndroidImageAssets.getLeg());
            legFragment.setLegIndex(legindex);

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
