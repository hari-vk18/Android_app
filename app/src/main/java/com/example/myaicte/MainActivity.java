package com.example.myaicte;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN= 5000;

    Animation topAnim,bottomAnim;
    ImageView image;
    TextView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);

        logo.setText(getResources().getString(R.string.aicte));

        TextPaint paint = logo.getPaint();
        float width = paint.measureText(getResources().getString(R.string.aicte));

        Shader textShader = new LinearGradient(0,0,width, logo.getTextSize(),

                new int[]{
                        Color.parseColor("#553bdd"),
                        Color.parseColor("#fe2485"),
                        Color.parseColor("#fdd55b"),
                        Color.parseColor("#F49B04"),

                }, null,Shader.TileMode.CLAMP);

        logo.getPaint().setShader(textShader);


        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivities(new Intent[]{intent});
                finish();
            }
        },SPLASH_SCREEN);

    }
}