package com.example.weiguangmeng.headhaha;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.weiguangmeng.headhaha.utils.ImageHandle;

public class MainActivity extends AppCompatActivity {

    private Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.head);
        ((ImageView)findViewById(R.id.head)).setImageBitmap(ImageHandle.handleRectImage(bitmap));

    }
}
