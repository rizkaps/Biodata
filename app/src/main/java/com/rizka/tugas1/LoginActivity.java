package com.rizka.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText edtEmail, edtPassword;
    Button buttonLogin;
    SessionManagement sessionManagement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sessionManagement = new SessionManagement(LoginActivity.this);

        edtEmail = findViewById(R.id.editEmail);
        edtPassword = findViewById(R.id.editPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        if (sessionManagement.isLoggedIn()) {
            goToActivity();
        }
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                if (email.equals("") || email.trim().isEmpty() || password.equals("") || password.trim().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Username Password harus diisi", Toast.LENGTH_LONG).show();
                } else {
                    sessionManagement.createLoginSession(edtEmail.getText().toString(), edtPassword.getText().toString());
                    goToActivity();
                }
            }
        });
    }
    private void goToActivity(){

        Intent mIntent = new Intent(getApplicationContext(),
                MainActivity.class);
        startActivity(mIntent);
    }
}