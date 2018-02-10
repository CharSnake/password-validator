package com.example.user.csci3130assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(android.view.View v) {

        //Get the value in the password selection and validate it
        TextView pass = (TextView)findViewById(R.id.password);
        Validator val = new Validator();
        int tests = val.validate(pass.getText().toString());

        //See if the password is valid and display if so.
        TextView check = (TextView)findViewById(R.id.textView1);
        if (tests == 5)
            check.setText("Strong password.");
        else
            check.setText("Password not strong enough.");

    }
}
