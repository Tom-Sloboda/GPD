package giraffedatadinosaur.commuterpal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import giraffedatadinosaur.commuterpal.enums.Transport;
import giraffedatadinosaur.commuterpal.frontend.api.FrontEndUserSetupImpl;

public class JourneyPlanner extends AppCompatActivity {

    FrontEndUserSetupImpl frontEndUserSetup = new FrontEndUserSetupImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_planner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Populate drop down list
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(new ArrayAdapter<Transport>(this, android.R.layout.simple_spinner_item, Transport.values()));
    }

    public void submitForm(View view) {
        TextView homeAddress = (TextView) findViewById(R.id.homeAddress);
        TextView workAddress = (TextView) findViewById(R.id.workAddress);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        frontEndUserSetup.setHomeAddress(String.valueOf(homeAddress.getText()));
        frontEndUserSetup.setWorkAddress(String.valueOf(workAddress.getText()));
        frontEndUserSetup.setMode(((Transport)spinner.getSelectedItem()));
    }
}
