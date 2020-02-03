package com.hybird.city;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity  {
    int counter = 3;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.editEmail);
        password = findViewById(R.id.editPassowrd);
    }




    public void Login(View view) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {

            Intent intentObj = new Intent(this, Index.class);
            startActivity(intentObj);
            this.finish();
        } else {
            Toast.makeText(this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();

            counter--;

            if (counter == 0) {
                Intent IntentObj = new Intent(this, MainActivity.class);
                startActivity(IntentObj);
                this.finish();
            }
        }
    }
}
