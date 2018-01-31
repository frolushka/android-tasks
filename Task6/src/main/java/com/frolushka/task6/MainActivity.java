package com.frolushka.task6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = ((Button) findViewById(R.id.button));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spin(button);
            }
        });
    }

    void spin(final View object) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.75f);
        scaleAnimation.setDuration(500);
        object.setAnimation(scaleAnimation);
    }

}
