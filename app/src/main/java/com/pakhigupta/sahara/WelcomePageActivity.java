package com.pakhigupta.sahara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



/**
 * Created by Pakhi on 6/21/2018.
 */

public class WelcomePageActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
    }

    public void login(View view) {

        Intent intent = new Intent(this, UserLoginActivity.class);
        startActivity(intent);
    }

    public void sign(View view) {

        Intent intent = new Intent(this, UserSignupActivity.class);
        startActivity(intent);
    }

    public void volunteer(View view) {

        Intent intent = new Intent(this, VolunteerActivity.class);
        startActivity(intent);
    }

}