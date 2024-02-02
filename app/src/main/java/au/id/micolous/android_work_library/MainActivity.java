package au.id.micolous.android_work_library;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import me.leolin.shortcutbadger.ShortcutBadger;

import android.app.Notification;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_ID = "ABC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Số lượng badge bạn muốn hiển thị
        int badgeCount = 5;

// Set badge
        ShortcutBadger.applyCount(getApplicationContext(), badgeCount);

//        Notification notification = new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
//                .setContentTitle("New Messages")
//                .setContentText("You've received 3 new messages.")
//                .setNumber(10)
//                .build();
    }
}