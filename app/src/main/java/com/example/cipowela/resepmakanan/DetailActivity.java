package com.example.cipowela.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView judul, deskripsi;
    ImageView gambar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        judul = (TextView) findViewById(R.id.judul_detail);
        gambar = (ImageView) findViewById(R.id.gambar_detail);
        deskripsi = (TextView) findViewById(R.id.deskripsi_detail);

        judul.setText(intent.getStringExtra("resep.judul"));
        deskripsi.setText(intent.getStringExtra("resep.deskripsi"));
        gambar.setImageResource(intent.getIntExtra("resep.gambar",0));

    }
}
