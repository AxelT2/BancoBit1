package com.example.bancobit1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, login_step1.class);
        startActivity(intent);
    }
    private void drawer(Canvas canvas) {
        canvas.drawColor(Color.BLUE);
        Bitmap bitmapOriginal = BitmapFactory.decodeResource(getResources(), R.drawable.tiledbackground);
        Bitmap bitmapNew = Bitmap.createBitmap(bitmapOriginal.getWidth(), bitmapOriginal.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapNew.eraseColor(Color.GREEN); // color that You want to set

        canvas.drawBitmap(bitmapNew, 0, 0, null);
        canvas.drawBitmap(bitmapOriginal, 0, 0, null);

    }

}