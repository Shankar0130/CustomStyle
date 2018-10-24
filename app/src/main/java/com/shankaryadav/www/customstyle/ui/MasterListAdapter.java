package com.shankaryadav.www.customstyle.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.shankaryadav.www.customstyle.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.List;

public class MasterListAdapter extends BaseAdapter {

    // Grab the Context and List Array wherever the object i created from this class

    private Context mContext;
    private List<Integer> mImageIds;

    public MasterListAdapter(Context mContext, List<Integer> mImageIds) {
        this.mContext = mContext;
        this.mImageIds = mImageIds;
    }

// override methods for BaseAdapter
    @Override
    public int getCount() {
        return mImageIds.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView;

        // when there is no view

        if (view == null) {
            imageView = new ImageView(mContext);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(5, 5, 5, 5);

        } else {
            imageView = (ImageView) view;
        }
        // setting up he image resources to show

        imageView.setImageResource(mImageIds.get(i));

        return imageView;
    }
}

//    public void setmImageIds(List<Integer> mImageIds) {
//        this.mImageIds = mImageIds;
//    }
//}
