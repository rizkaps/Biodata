package com.rizka.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMotto extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_motto);
    }

    public void Motto(View view) {
        Intent intent = new Intent(MainMotto.this, MainActivity.class);
        startActivity(intent);
    }
}
