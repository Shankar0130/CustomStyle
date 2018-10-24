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

    private Context mContext;
    private List<Integer> mImageIds;

    public MasterListAdapter(Context mContext, List<Integer> mImageIds) {
        this.mContext = mContext;
        this.mImageIds = mImageIds;
    }


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
        if (view == null) {
            imageView = new ImageView(mContext);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 5, 5, 5);

        } else {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(mImageIds.get(i));

        return imageView;
    }
}

//    public void setmImageIds(List<Integer> mImageIds) {
//        this.mImageIds = mImageIds;
//    }
//}
