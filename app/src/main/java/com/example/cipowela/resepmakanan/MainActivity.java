package com.example.cipowela.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Makanan> makananList = new ArrayList<>();
    private RecyclerView RV;
    private MakananAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RV = (RecyclerView) findViewById(R.id.tampilanRV);
        mAdapter = new MakananAdapter(this, makananList);
        RV.setLayoutManager(new LinearLayoutManager(this));
        RV.setAdapter(mAdapter);

        isiData();
    }

    private void isiData() {
        Makanan makan = new Makanan("Bubur Ayam", R.drawable.a102262, "Murah enak bergizi");
        makananList.add(makan);

        mAdapter.notifyDataSetChanged();
    }
}
