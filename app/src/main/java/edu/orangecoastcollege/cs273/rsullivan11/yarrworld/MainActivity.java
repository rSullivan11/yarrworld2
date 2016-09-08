package edu.orangecoastcollege.cs273.rsullivan11.yarrworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

public class MainActivity extends Activity {

    // Define button as instenced variable
    private Button speakButton;
    private Context context = this;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Restoring user setting from pervious session
        super.onCreate(savedInstanceState);
        // Inflating the layout called main
        setContentView(R.layout.MainActivity);

        // Hook up speakButton to one in view
        speakButton = (Button) findViewById(R.id.speakButton);

        // Wire speakButton to preform an onClick event
        speakButton.setOnClickListener(
                new View.OnClicistener() {
                    @Override
                    public void onCLick(View view) {
                        // Use the static reference to "Toasr" to display the message:
                        //
                        //
                        Toast.makeText(context, R.string.toast_text, Toast.LENGTH_LONG).show();
                    }
                });
    }
}
