package giraffedatadinosaur.commuterpal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import giraffedatadinosaur.commuterpal.enums.Transport;
import giraffedatadinosaur.commuterpal.notification.NotificationController;


public class MainActivity extends AppCompatActivity {



    private NotificationController notificationController = new NotificationController();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendNotification(View view) {



        notificationController.createDelayedNotification(Transport.BIKE, view);

    }

    public void newJourney(View view) {
        Intent intent = new Intent(this, JourneyPlanner.class);
        startActivity(intent);
    }
}
