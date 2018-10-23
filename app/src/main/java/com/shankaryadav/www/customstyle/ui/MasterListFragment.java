package com.shankaryadav.www.customstyle.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.shankaryadav.www.customstyle.R;
import com.shankaryadav.www.customstyle.data.AndroidImageAssets;


public class MasterListFragment extends Fragment {

    private GridView gridView;
    private Context mContext;

    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mater_list,container,false);


        gridView = rootView.findViewById(R.id.imageGridView);

        MasterListAdapter masterListAdapter = new MasterListAdapter(mContext,AndroidImageAssets.getall());


        gridView.setAdapter(masterListAdapter);


       return rootView;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }
}
