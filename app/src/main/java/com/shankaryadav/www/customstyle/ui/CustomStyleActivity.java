package com.shankaryadav.www.customstyle.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.shankaryadav.www.customstyle.R;
import com.shankaryadav.www.customstyle.data.AndroidImageAssets;

public class CustomStyleActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener{

private int headIndex;
private int bodyIndex;
private int legIndex;

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


    @Override
    public void onImageSelected(int position) {
        Toast.makeText(getApplicationContext(),"position clicked" + position, Toast.LENGTH_SHORT).show();

        int bodyPartNumber = position/12;

        int listIndex = position - (12*bodyPartNumber);

        switch (bodyPartNumber){
            case 0:
                headIndex = listIndex;
                break;
            case 1:
                bodyIndex = listIndex;
                break;
            case 2:
                legIndex = listIndex;
                break;
            default:
                break;
        }


        Bundle b = new Bundle();
        b.putInt("headIndex",headIndex);
        b.putInt("bodyIndex",bodyIndex);
        b.putInt("legIndex",legIndex);

        final Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtras(b);

        Button button = (Button) findViewById(R.id.fragmentNextButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}
