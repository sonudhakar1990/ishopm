package com.ishop.ishop.adapters;

import android.content.Context;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.ishop.ishop.R;
import android.view.LayoutInflater;
import android.widget.TextView;


/**
 * Created by sonudhakar on 02/12/17.
 */

public class CustomAdapter extends BaseAdapter{
    private Context mContext;

    // Constructor
    public CustomAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return imageids.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageView imageView;
//
//        if (convertView == null) {
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
//        }
//        else
//        {
//            imageView = (ImageView) convertView;
//        }
//        imageView.setImageResource(mThumbIds[position]);
//        return imageView;

        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.main_container_item, null);
            TextView textView = (TextView) grid.findViewById(R.id.main_container_item_name);
            ImageView imageView = (ImageView)grid.findViewById(R.id.main_container_item_image);
            textView.setText(names[position]);
            imageView.setImageResource(imageids[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;

    }

    // Keep all Images in array
    public Integer[] imageids = {
            R.drawable.vegitables,
            R.drawable.fruits,
            R.drawable.food,
            R.drawable.patanjali,
            R.drawable.books,
            R.drawable.home_appliances
    };

    public String[] names = {
          "Vegitables",
            "Fruits",
            "Food Court",
            "Patanjali",
            "Books",
            "Appliances"
    };
}
