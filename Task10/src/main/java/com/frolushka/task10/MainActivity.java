package com.frolushka.task10;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static final String[] phrases = { "Все государства мира были уничтожены",
            "За тобой уже едет полиция",
            "Тебя исключают из вышки",
            "Единственная передача на ТВ теперь - кривое зеркало",
            "Декан найдет тебя"
    };

    static final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = ((ImageButton) findViewById(R.id.imageButton2));
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setMessage(phrases[random.nextInt(phrases.length + 1) - 1    ]);
                dialog.setCancelable(false);
                dialog.setNegativeButton("Нажать еще раз", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = dialog.create();
                alertDialog.show();
            }
        });
    }
}
