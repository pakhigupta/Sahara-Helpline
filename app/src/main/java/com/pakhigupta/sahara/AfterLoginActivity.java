package com.pakhigupta.sahara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class AfterLoginActivity extends AppCompatActivity {

    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_login);

        //TextView textView = (TextView) findViewById(R.id.textView);
        auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            // User is logged in
            Toast.makeText(this, "moving to chat", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(AfterLoginActivity.this, ChatBoxActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Intent intent = new Intent(AfterLoginActivity.this, UserLoginActivity.class);
            startActivity(intent);
            finish();
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {


            case R.id.logout:
                Intent intent = new Intent(this, Logout.class);
                startActivity(intent);
                return true;

            default:
                return false;
        }

    }
}
