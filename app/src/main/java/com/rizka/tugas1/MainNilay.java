package com.rizka.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainNilay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nilay);
    }

    public void Nilai(View view) {
        Intent intent = new Intent(MainNilay.this, MainActivity.class);
        startActivity(intent);
    }
}
