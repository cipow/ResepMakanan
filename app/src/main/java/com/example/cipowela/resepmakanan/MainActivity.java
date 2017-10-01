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
        Makanan makan = new Makanan("Horog – Horog", R.drawable.horoghorog
                , "Salah satu jajanan makanan kuliner tradisional khas dari daerah jepara adalah Horog-horog, mungkin yang sudah tahu pasti "
                + "pernah berwisata di jepara dan mampir membeli jajanan ini tak lupa dengan kenikmatan makanan tradisional ini.\n"
                + "Biasanya akan lebih mantab jika Horog-horog bertanding dengan bakso atau bisa kolaborasi dengan pecel dijamin rasanya tak kalah dari kuliner lain di indonesia."
                + "\n\n" + "Bahan - bahan:\n\n"
                + "- Tepung beras 250 gram, kukus.\n- Air mendidih 150 ml.\n- Gula pasir 100 gram.\n"
                + "- Pewarna makanan merah secukupnya.\n- Kelapa 1/4 butir, parut memanjang, kukus untuk taburan."
                + "\n\n" + "Cara Membuat:\n\n"
                + "- Campur tepung, air dan gula. Aduk rata hingga adonan kalis.\n"
                + "- Tuangkan adonan ke dalam cetakan yang telah diolesi dengan minyak goreng.\n"
                + "- Kukus selama 25 menit atau hingga matang. Angkat.\n"
                + "- Selagi hangat parut kasar kue, sisihkan.\n- Sajikan dengan kelapa parut.");
        makananList.add(makan);

        makan = new Makanan("Ikan Tongkol Bumbu Asam Manis", R.drawable.ikantongkol
                , "Hidangan ikan tongkol bumbu asam manis memang seringkali menjadi menu hidangan utama yang menggoda."
                + "\n\n" + "Bahan - bahan:\n\n"
                + "- Ikan tongkol 350 gram.\n- Minyak sayur.\n- Air 100 ml.\n- Air panas 100 ml.\n- Asam jawa 22 gram.\n"
                + "- Bawang putih 2 siung.\n- Cabe merah keriting 8 buah.\n- Jahe 1 ruas jari telunjuk.\n- Daun jeruk purut 2 lembar.\n"
                + "- Kecap manis 4 sdm.\n- Bawang merah 8 siung.\n- Saus sambal 1 sdm.\n- Gula pasir 1 sdm.\n- Gram 1/3 sdm.\n"
                + "- Garam 1/3 sdm.\n- Air jeruk nipis 1 sdm."
                + "\n\n" + "Cara Membuat:\n\n"
                + "- Panaskan minyak goreng daam wajan dengan bentuk yang cekung dan goreng ikan tongkol yang sudah diungkep kedalamnya hingga kering dan matang.\n"
                + "- Angkat ikan yang sudah matang dan sisihkan sementara. Lalu silahkan ulek bumbu yang harus dihaluskan diantaranya adalah cabai merah, bawang merah, bawang putih, garam dan jahe.\n"
                + "- Lanjutkan dengan memanaskan kembali minyak goreng dalam wajan yang sama dan kita akan tumis bumbu yang telah dihaluskan diatas. Silahkan tumis bumbu hingga tercium harum dan lezat.\n"
                + "- Masukkan daun jeruk yang telah diparut dna aduk-aduk hingga harum. Masukkan kecap manis bersama dengan saus sambal dan aduk-aduk sebenetar hingag mendidih.\n"
                + "- Tuangkan air asam kedalamnya bersama dengan air dan gula pasir. Lalu aduk-duk merata hingga mengental.\n"
                + "- Baru setelah itu, masukkan ikan tongkol yang sudah digoreng dan aduk-aduk hingga meresap kedalam ikan.");
        makananList.add(makan);

        makan = new Makanan("Kepiting Soka Lada Hitam", R.drawable.kepitingsoka
                , "Kepiting dengan jenis soka adalah salahsatu yang cukup banyak diburu untuk kemudian diolah dan dikonsumsi. "
                + "Kepiting soka diketahui merupakan jenis kepiting dengan cangkang yang lunak sehingga anda bisa mengkonsumsi semua bagiannya tanpa terkecuali juga bagian kulitnya. "
                + "Bagian kulit kepiting yang seringkali disisihkan ternyata justru memiliki kandungan karotenoid serta chitosan yang cukup tinggi. Kandungan tersebut sangat baik efeknya untuk penyerapan dari lemak-lemak dan kolesterol. "
                + "Dengan hampir semua bagian tubuhnya yang lunak dan bisa langsung diolah, maka tentunya juga tidak akan terlalu menyulitkan anda dalam proses pembersihannya."
                + "\n\n" + "Bahan - bahan:\n\n"
                + "- 2 ekor kepiting kepiting soka, pilih yang masih segar dan berukuran cukup besar.\n"
                + "- 6 siung bawang putih.\n- 2 buah bawang bombay.\n- 2 batang daun bawang prei.\n- 1 sendok teh lada hitam.\n- 2 sendok teh kecap manis.\n"
                + "- 1 sendok makan saus tiram.\n- 2 sendok makan mentega.\n- Gula secukupnya.\n- 500 ml air"
                + "\n\n" + "Cara Membuat:\n\n");
        makananList.add(makan);

        mAdapter.notifyDataSetChanged();
    }
}
