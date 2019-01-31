package com.cumulations.jsonanim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottieAnimationView = findViewById(R.id.animation_view);
        lottieAnimationView.setAnimation("loading.json");
        lottieAnimationView.playAnimation();
        lottieAnimationView.loop(true);
        button = findViewById(R.id.button1);
        button.setText(getString(R.string.pause));
    }

    public void animate(View v) {
        if (lottieAnimationView.isAnimating()) {
            lottieAnimationView.cancelAnimation();
            button.setText(getString(R.string.play));
        } else {
            lottieAnimationView.playAnimation();
            button.setText(getString(R.string.pause));
        }
    }
}