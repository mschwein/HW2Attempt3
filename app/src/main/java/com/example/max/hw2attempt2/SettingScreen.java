package com.example.max.hw2attempt2;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingScreen extends Activity implements View.OnClickListener{

    //declare widget
    private Button buttonLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_screen);

        //link widget to UI
        buttonLogout = (Button) findViewById(R.id.buttonLogout);
        //start listener
        buttonLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //display up dialog box when button is clicked
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to logout?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //go back to Login Screen
                        Intent login = new Intent(SettingScreen.this, LoginScreen.class);
                        startActivity(login);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //do nothing
                        dialog.cancel();
                    }
                })
                .show();
    }
}
