package com.shankaryadav.www.customstyle.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.shankaryadav.www.customstyle.R;
import com.shankaryadav.www.customstyle.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.List;

public class BodyPartFragment extends Fragment {
    private static final String TAG = "BodyPartFragment";
    private static final String HEAD_LIST = "listHead";
    private static final String BODY_LIST = "listBody";
    private static final String LEG_LIST = "listLeg";
    private static final String Head_Index = "indexHead";
    private static final String Body_Index = "indexBody";
    private static final String Leg_Index = "indexLeg";

    private List<Integer> headList;
    private List<Integer> bodyList;
    private List<Integer> legList;
    private int headIndex;
    private int bodyIndex;
    private int legIndex;
    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (savedInstanceState != null){

            savedInstanceState.getIntegerArrayList(HEAD_LIST);
            savedInstanceState.getIntegerArrayList(BODY_LIST);
            savedInstanceState.getIntegerArrayList(LEG_LIST);

            savedInstanceState.getInt(Head_Index);
            savedInstanceState.getInt(Body_Index);
            savedInstanceState.getInt(Leg_Index);

        }





        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

      final  ImageView imageView = rootView.findViewById(R.id.body_part_image_view);

       if (headList != null){
           imageView.setImageResource(AndroidImageAssets.getHeads().get(headIndex));

           imageView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                   if (headIndex < headList.size() -1){
                       headIndex++;
                       imageView.setImageResource(AndroidImageAssets.getHeads().get(headIndex));
                   }else{
                       headIndex = 0;
                   }
               }
           });



       }else{
           Log.i(TAG, "This fragment don't have any list to show");
       }

        if (bodyList != null){
            imageView.setImageResource(AndroidImageAssets.getBodies().get(bodyIndex));

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (bodyIndex < bodyList.size() -1){
                        bodyIndex++;
                        imageView.setImageResource(AndroidImageAssets.getBodies().get(bodyIndex));
                    }else{
                        bodyIndex = 0;
                    }
                }
            });


        }else{
            Log.i(TAG, "This fragment don't have any list to show");
        }

        if (legList != null){
            imageView.setImageResource(AndroidImageAssets.getLeg().get(legIndex));

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (legIndex < legList.size() -1 ){
                        legIndex++;
                        imageView.setImageResource(AndroidImageAssets.getLeg().get(legIndex));
                    }else{
                        legIndex = 0;
                    }
                }
            });
        }else{
            Log.i(TAG, "This fragment don't have any list to show");
        }


        return rootView;
    }


    public void setHeadList(List<Integer> headList) {
        this.headList = headList;
    }

    public void setBodyList(List<Integer> bodyList) {
        this.bodyList = bodyList;
    }

    public void setLegList(List<Integer> legList) {
        this.legList = legList;
    }

    public void setHeadIndex(int headIndex) {
        this.headIndex = headIndex;
    }

    public void setBodyIndex(int bodyIndex) {
        this.bodyIndex = bodyIndex;
    }

    public void setLegIndex(int legIndex) {
        this.legIndex = legIndex;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {


        outState.putIntegerArrayList(HEAD_LIST,(ArrayList<Integer>) headList);
        outState.putInt(Head_Index,headIndex);

        outState.putIntegerArrayList(BODY_LIST,(ArrayList<Integer>) bodyList);
        outState.putInt(Body_Index,bodyIndex);

        outState.putIntegerArrayList(LEG_LIST,(ArrayList<Integer>) legList);
        outState.putInt(Leg_Index,legIndex);

    }
}
