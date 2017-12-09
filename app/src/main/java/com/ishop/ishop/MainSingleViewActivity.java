package com.ishop.ishop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import com.ishop.ishop.adapters.CustomAdapter;
/**
 * Created by sonudhakar on 02/12/17.
 */

public class MainSingleViewActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_single_view);

        // Get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        CustomAdapter imageAdapter = new CustomAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
        imageView.setImageResource(imageAdapter.imageids[position]);
    }
}
