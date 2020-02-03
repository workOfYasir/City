package com.hybird.city;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  public void moveToLogin(View v){
      Intent IntentObj = new Intent(this,Login.class);
      startActivity(IntentObj);
      this.finish();
//      Toast.makeText(this, "hy", Toast.LENGTH_SHORT).show();
  }
}
