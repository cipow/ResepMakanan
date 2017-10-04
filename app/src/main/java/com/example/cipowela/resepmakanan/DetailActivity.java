package com.example.cipowela.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView pembuatan;
    ImageView gambar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        getSupportActionBar().setTitle(intent.getStringExtra("resep.judul"));

        gambar = (ImageView) findViewById(R.id.gambar_detail);
        pembuatan = (TextView) findViewById(R.id.pembuatan);

        pembuatan.setText(intent.getStringExtra("resep.pembuatan"));
        gambar.setImageResource(intent.getIntExtra("resep.gambar",0));

    }
}
