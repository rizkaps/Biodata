package com.rizka.tugas1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends Activity {

    TextView isitext;
    SessionManagement sessionManagement;
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sessionManagement = new SessionManagement(MainActivity.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogout = findViewById(R.id.btnLogout);
        isitext = findViewById(R.id.isiText);

        sessionManagement = new SessionManagement(MainActivity.this);

        if (sessionManagement.isLoggedIn()) {
            HashMap<String, String> user = sessionManagement.getUserInformation();
            isitext.setText(user.get(sessionManagement.KEY_EMAIL));
        }

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sessionManagement.logoutUser();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"App onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"App onRestart", Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"App onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"App onStop", Toast.LENGTH_SHORT).show();
    }

    /*@Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"App onDestory", Toast.LENGTH_SHORT).show();
    }*/

    public void Motto(View view) {
        Intent intent = new Intent(MainActivity.this, MainMotto.class);
        startActivity(intent);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Motto", Toast.LENGTH_SHORT).show();
    }

    public void Nilai(View view) {
        Intent intent = new Intent(MainActivity.this, MainNilay.class);
        startActivity(intent);
    }


    public void Profil(View view) {
        Intent intent = new Intent(MainActivity.this, MainData.class);
        startActivity(intent);
    }
}
