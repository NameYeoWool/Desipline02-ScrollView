package com.example.aaa.desipline02_scrollview;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView01;
    ImageView imageView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView01 = (ScrollView) findViewById(R.id.scrollView01);
        imageView01 = (ImageView) findViewById(R.id.imageView01);
        Button button01 = (Button) findViewById(R.id.button01);

        scrollView01.setHorizontalScrollBarEnabled(true);
        Resources res = getResources();
        BitmapDrawable bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image_aoa_seolhyeon);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();
        imageView01.setImageDrawable(bitmap);
        imageView01.getLayoutParams().width = bitmapWidth;
        imageView01.getLayoutParams().height=bitmapHeight;

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage();
            }
        });
    }

    private void changeImage(){
        Resources res = getResources();
        BitmapDrawable bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image_aoa_selhyeon2);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmap);
        imageView01.getLayoutParams().width=bitmapWidth;
        imageView01.getLayoutParams().height=bitmapHeight;
    }
}
