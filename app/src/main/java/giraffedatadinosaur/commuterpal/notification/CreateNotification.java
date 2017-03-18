package giraffedatadinosaur.commuterpal.notification;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.NotificationCompat;

import giraffedatadinosaur.commuterpal.MainActivity;
import giraffedatadinosaur.commuterpal.R;

import static android.content.Context.NOTIFICATION_SERVICE;

/**
 * Created by Jack Treble on 18/03/2017.
 */

public class CreateNotification {


    private int notificationCount = 1;
    private int getNum(){
        return notificationCount++;
    }

    public void createNotification(Activity activity, String updateMessage){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(activity);
        builder.setSmallIcon(android.R.drawable.ic_dialog_alert);
        Intent intent = new Intent(activity, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(activity, 0, intent, 0);
        builder.setContentIntent(pendingIntent);
        builder.setLargeIcon(BitmapFactory.decodeResource(activity.getResources(), R.mipmap.ic_launcher));
        builder.setContentTitle("Commute Update");
        builder.setContentText(updateMessage);

        NotificationManager notificationManager = (NotificationManager) activity.getSystemService(NOTIFICATION_SERVICE);


        notificationManager.notify(getNum(), builder.build());
    }


}
