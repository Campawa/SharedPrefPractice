package com.example.chelsi.sharedpreferencestest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    private EditText username;
    private EditText password;
    private CheckBox checkBox;
    private Button submitButton;
    private Button registerButton;
    private SharedPreferences login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        username = (EditText) findViewById(R.id.username_edittext);
        password = (EditText) findViewById(R.id.password_edittext);
        checkBox = (CheckBox) findViewById(R.id.remember_me_checkbox);
        submitButton = (Button) findViewById(R.id.submit_button);
        registerButton = (Button) findViewById(R.id.register_button);

        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
