package giraffedatadinosaur.commuterpal.notification;

import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;

import giraffedatadinosaur.commuterpal.R;
import giraffedatadinosaur.commuterpal.enums.Transport;

/**
 * Created by Jack Treble on 18/03/2017.
 */

public class NotificationController extends AppCompatActivity {


    //create notification based on time x mins before transport is going to arrive

public void createDelayedNotification(Transport transportType, View view){


    NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
    builder.setSmallIcon(android.R.drawable.ic_dialog_alert);
//    Intent intent = new Intent(this,MainActivity.class);
//    PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
//    builder.setContentIntent(pendingIntent);
//    builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
    builder.setContentTitle("Commute Update");
    builder.setContentText("Your " + transportType.toString() + " is on delayed.");

    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

    // Will display the notification in the notification bar
    notificationManager.notify(1, builder.build());


}

    public void createOnTimeNotification(Transport transportType, View view){


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(android.R.drawable.ic_dialog_alert);
//        Intent intent = new Intent(this,MainActivity.class);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
//        builder.setContentIntent(pendingIntent);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        builder.setContentTitle("Commute Update");
        builder.setContentText("Your " + transportType.toString() + " is on time.");

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // Will display the notification in the notification bar
        notificationManager.notify(1, builder.build());


    }


}
