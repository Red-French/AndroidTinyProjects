package net.redfrench.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView writeOnPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userMsg = (EditText) findViewById(R.id.topTextInput);
        Button button = (Button) findViewById(R.id.button);
        writeOnPad = (TextView) findViewById(R.id.note);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("You are Here, REd." + userMsg.getText().toString());
                String message = userMsg.getText().toString();
                saySomething(message);
            }
        });
    }

    private void saySomething(String phrase) {
        EditText userMsg = (EditText) findViewById(R.id.topTextInput);
        Log.v("LOG", phrase);
        writeOnPad.setText(phrase);
        userMsg.setText("");
    }

}
