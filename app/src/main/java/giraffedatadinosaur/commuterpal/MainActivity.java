package giraffedatadinosaur.commuterpal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import giraffedatadinosaur.commuterpal.notification.CreateNotification;


public class MainActivity extends AppCompatActivity {



    private CreateNotification createNotification = new CreateNotification();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendNotification(View view) {
        createNotification.createNotification(this,"123");
        createNotification.createNotification(this,"456");
        createNotification.createNotification(this,"789");
        createNotification.createNotification(this,"000");

    }

    public void newJourney(View view) {
        Intent intent = new Intent(this, JourneyPlanner.class);
        startActivity(intent);
    }
}
