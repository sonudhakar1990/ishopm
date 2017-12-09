package com.ishop.ishop.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.Toast;
import android.content.Intent;
import android.widget.AdapterView.OnItemClickListener;

import com.ishop.ishop.MainSingleViewActivity;
import com.ishop.ishop.R;
import com.ishop.ishop.adapters.CustomAdapter;
import android.app.Activity;

public class MainFragment extends Fragment{

    GridView gridview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        gridview = (GridView) view.findViewById(R.id.main_gridview);
        gridview.setAdapter(new CustomAdapter(view.getContext()));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,View v, int position, long id){
                if(position == 0){

                }
            }
        });
        //return inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

}
