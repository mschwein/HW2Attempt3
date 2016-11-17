package com.example.max.hw2attempt2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class LoginScreen extends Activity implements View.OnClickListener {

    //declare widgets
    private EditText editTextUsername;
    private EditText editTextPassword;
    private RadioButton radioButtonSettings;
    private RadioButton radioButtonProfile;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        //link java objects to widgets in UI
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        radioButtonSettings = (RadioButton) findViewById(R.id.radioButtonSettings);
        radioButtonProfile = (RadioButton) findViewById(R.id.radioButtonProfile);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);

        //start listener
        buttonSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //event handler for "Submit Button"
        if (editTextUsername.getText().toString().equals("user")
                & editTextPassword.getText().toString().equals("1234")
                & radioButtonProfile.isChecked())
        {
            //go profile screen
            Intent profile = new Intent(this, ProfileScreen.class);
            startActivity(profile);

        } else if (editTextUsername.getText().toString().equals("user")
                & editTextPassword.getText().toString().equals("1234")
                & radioButtonSettings.isChecked())
        {
            //go to settings screen
            Intent settings = new Intent(this,SettingScreen.class);
            startActivity(settings);

        } else {
            Toast.makeText(this, "Login Denied", Toast.LENGTH_SHORT).show();
            editTextUsername.setText("");
            editTextPassword.setText("");
        }
    }
}