package com.example.Labirint;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by home-pc on 12.06.2015.
 */
public class GameActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.game);

        LinearLayout lin = (LinearLayout)findViewById(R.id.layout_game);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        BitmapDrawable drawable0 = (BitmapDrawable) getResources().getDrawable(
                R.drawable.floor);
        drawable0.setGravity(Gravity.CENTER_VERTICAL);
        BitmapDrawable drawable1 = (BitmapDrawable) getResources().getDrawable(
                R.drawable.walldown);
        drawable1.setGravity(Gravity.LEFT);
        BitmapDrawable drawable2 = (BitmapDrawable) getResources().getDrawable(
                R.drawable.wallleft);
        drawable2.setGravity(Gravity.RIGHT);
        Drawable drawableArray[] = new Drawable[] { drawable0, drawable1, drawable2 };
        LayerDrawable layerDraw = new LayerDrawable(drawableArray);


        ImageButton button = new ImageButton(this);
        button.setLayoutParams(layoutParams);
        lin.addView(button);
        button.setImageDrawable(layerDraw);
    }
}


