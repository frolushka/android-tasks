package com.frolushka.task11;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = ((Button) findViewById(R.id.button2));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                Notification notification = new Notification.Builder(context)
                        .setContentTitle("Поздравляем! Вы выиграли миллион!")
                        .setContentText("Для получения миллиона отправьте 100 рублей на номер +79876543210")
                        .setAutoCancel(true)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(context.getResources(),
                                R.drawable.icon))
                        .setSound(Uri.parse("android.resource://com.frolushka.task11/" + R.raw.audio))
                        .build();
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(0, notification);

            }
        });
    }
}
