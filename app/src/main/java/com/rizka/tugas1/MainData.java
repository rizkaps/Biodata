package com.rizka.tugas1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.view.MenuItem;

public class MainData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_data);
    }

    public void Profil(View view) {
        Intent intent = new Intent(MainData.this, MainActivity.class);
        startActivity(intent);
    }

    public void gmail(View view) {
        String url ="https://mail.google.com/mail/u/0/#inbox?compose=new";
        Intent bukagmail = new Intent(Intent.ACTION_SEND);
        bukagmail.setType("text/plain");
        bukagmail.putExtra(Intent.EXTRA_EMAIL, new String("rizkapurmayas@gmail.com"));
        bukagmail.putExtra(Intent.EXTRA_SUBJECT, "Email dari APP Android");
        bukagmail.putExtra(Intent.EXTRA_TEXT,"Kirim Pesan seperti ini? Atau hapus.");

        try {
            startActivity(Intent.createChooser(bukagmail, "Ingin mengirim pesan anda ?"));
        }
        catch (android.content.ActivityNotFoundException ex) {
        }

        /*Intent bukagmail = new Intent((Intent. ACTION_VIEW));*/
        bukagmail.setData(Uri. parse(url));

    }

    public void ig(View view) {
        String url ="https://www.instagram.com/";
        Intent bukaig = new Intent((Intent. ACTION_VIEW));
        bukaig.setData(Uri. parse(url));
        startActivity(bukaig);
    }

    public void wa(View view) {
        String url ="https://www.whatsapp.com/";
        Intent bukawa = new Intent((Intent. ACTION_VIEW));
        bukawa.setData(Uri. parse(url));
        startActivity(bukawa);
    }



    /*public  boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.gmail:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.instagram.com/"));

                startActivity(browserIntent);

                return true;
        }
        return  false;
    }*/


}
