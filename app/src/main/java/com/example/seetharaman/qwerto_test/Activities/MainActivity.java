package com.example.seetharaman.qwerto_test.Activities;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.seetharaman.qwerto_test.R;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the elements from their id's
        final LinearLayout llMain = (LinearLayout)findViewById(R.id.llMain);
        TextView tvDesc2 = (TextView)findViewById(R.id.tvDesc2);
        final ImageButton ibDown = (ImageButton)findViewById(R.id.ibDown);
        ImageButton ibUp = (ImageButton)findViewById(R.id.ibUp);
        final FloatingActionButton fabSearch = (FloatingActionButton)findViewById(R.id.fabSearch);

        //Change color of fab to the required shade
        fabSearch.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#64b5f6")));

        //Set the text of the description text field
        tvDesc2.setText("Season 9 seems bigger than ever, Sunburn is announcing a bigger than ever star studded line-up" +
                "for Goa 2015, which has grown into one of the world's largest music festivals and will now be a four day event." +
                "The festival will be held on the northern shores of Vagator, Goa from 27th to 30th December.");

        llMain.setVisibility(View.GONE);

        ibDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ibDown.setVisibility(View.GONE);
                llMain.setVisibility(View.VISIBLE);
                fabSearch.setVisibility(View.GONE);
            }
        });

        ibUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llMain.setVisibility(View.GONE);
                ibDown.setVisibility(View.VISIBLE);
                fabSearch.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
