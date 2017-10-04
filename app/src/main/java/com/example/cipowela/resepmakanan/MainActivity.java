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
                , "Bahan - bahan:\n\n"
                + "- Tepung beras 250 gram, kukus.\n- Air mendidih 150 ml.\n- Gula pasir 100 gram.\n"
                + "- Pewarna makanan merah secukupnya.\n- Kelapa 1/4 butir, parut memanjang, kukus untuk taburan."
                + "\n\n" + "Cara Membuat:\n\n"
                + "1. Campur tepung, air dan gula. Aduk rata hingga adonan kalis.\n\n"
                + "2. Tuangkan adonan ke dalam cetakan yang telah diolesi dengan minyak goreng.\n\n"
                + "3. Kukus selama 25 menit atau hingga matang. Angkat.\n\n"
                + "4. Selagi hangat parut kasar kue, sisihkan.\n\n5. Sajikan dengan kelapa parut.");
        makananList.add(makan);

        makan = new Makanan("Ikan Tongkol Bumbu Asam Manis", R.drawable.ikantongkol
                , "Hidangan ikan tongkol bumbu asam manis memang seringkali menjadi menu hidangan utama yang menggoda."
                , "Bahan - bahan:\n\n"
                + "- Ikan tongkol 350 gram.\n- Minyak sayur.\n- Air 100 ml.\n- Air panas 100 ml.\n- Asam jawa 22 gram.\n"
                + "- Bawang putih 2 siung.\n- Cabe merah keriting 8 buah.\n- Jahe 1 ruas jari telunjuk.\n- Daun jeruk purut 2 lembar.\n"
                + "- Kecap manis 4 sdm.\n- Bawang merah 8 siung.\n- Saus sambal 1 sdm.\n- Gula pasir 1 sdm.\n- Gram 1/3 sdm.\n"
                + "- Garam 1/3 sdm.\n- Air jeruk nipis 1 sdm."
                + "\n\n" + "Cara Membuat:\n\n"
                + "1. Panaskan minyak goreng daam wajan dengan bentuk yang cekung dan goreng ikan tongkol yang sudah diungkep kedalamnya hingga kering dan matang.\n\n"
                + "2. Angkat ikan yang sudah matang dan sisihkan sementara. Lalu silahkan ulek bumbu yang harus dihaluskan diantaranya adalah cabai merah, bawang merah, bawang putih, garam dan jahe.\n\n"
                + "3. Lanjutkan dengan memanaskan kembali minyak goreng dalam wajan yang sama dan kita akan tumis bumbu yang telah dihaluskan diatas. Silahkan tumis bumbu hingga tercium harum dan lezat.\n\n"
                + "4. Masukkan daun jeruk yang telah diparut dna aduk-aduk hingga harum. Masukkan kecap manis bersama dengan saus sambal dan aduk-aduk sebenetar hingag mendidih.\n\n"
                + "5. Tuangkan air asam kedalamnya bersama dengan air dan gula pasir. Lalu aduk-duk merata hingga mengental.\n\n"
                + "6. Baru setelah itu, masukkan ikan tongkol yang sudah digoreng dan aduk-aduk hingga meresap kedalam ikan.");
        makananList.add(makan);

        makan = new Makanan("Kepiting Soka Lada Hitam", R.drawable.kepitingsoka
                , "Kepiting dengan jenis soka adalah salahsatu yang cukup banyak diburu untuk kemudian diolah dan dikonsumsi. "
                + "Kepiting soka diketahui merupakan jenis kepiting dengan cangkang yang lunak sehingga anda bisa mengkonsumsi semua bagiannya tanpa terkecuali juga bagian kulitnya. "
                + "Bagian kulit kepiting yang seringkali disisihkan ternyata justru memiliki kandungan karotenoid serta chitosan yang cukup tinggi. Kandungan tersebut sangat baik efeknya untuk penyerapan dari lemak-lemak dan kolesterol. "
                + "Dengan hampir semua bagian tubuhnya yang lunak dan bisa langsung diolah, maka tentunya juga tidak akan terlalu menyulitkan anda dalam proses pembersihannya."
                , "Bahan - bahan:\n\n"
                + "- 2 ekor kepiting kepiting soka, pilih yang masih segar dan berukuran cukup besar.\n"
                + "- 6 siung bawang putih.\n- 2 buah bawang bombay.\n- 2 batang daun bawang prei.\n- 1 sendok teh lada hitam.\n- 2 sendok teh kecap manis.\n"
                + "- 1 sendok makan saus tiram.\n- 2 sendok makan mentega.\n- Gula secukupnya.\n- 500 ml air"
                + "\n\n" + "Cara Membuat:\n\n"
                + "1. Cuci bersih kepiting soka yang akan digunakan sebagai bahan masakan, jangan lupa untuk membuang bagian cangkangnya, kemuda anda belah menjadi 2 bagian. Sisihkan.\n\n"
                + "2. Siapkan wajan dan panaskan minyak. Lanjutkan masukan bawang putih serta bawang bombay dan tambahkan mentega lalu tumis hingga harum. Tambahkan juga sedikit air dalam masakan anda.\n\n"
                + "3. Setelah masakan anda mendidih, tambahkan beberapa bumbu lainnya ke dalam masakan bersama dengan kepiting yang sudah dibersihkan, lalu aduk semua bahan masakan tersebut sampai benar-benar merata.\n\n"
                + "4. Setelah itu anda diamkan hingga beberapa saat sampai bumbu benar-benar meresap ke dalam kepiting, hingga air menyusut.\n\n"
                + "5. Setelah benar-benar matang kemudian anda angkat masakan kepiting anda lalu sajikan di atas piring saji.");
        makananList.add(makan);

        makan = new Makanan("Rondo Royal (Tape Goreng)", R.drawable.rondoroyal
                , "Tape alias peyeum ( bahasa sunda nya) adalah makanan khas dari daerah Jawa Barat / Bandung."
                , "Bahan - bahan:\n\n"
                + "- 15 buah tape singkong.\n- 100 gram tepung terigu.\n- 1/2 gelas air.\n- 1 sdt perisa vanilla.\n- garam secukupnya.\n- minyak goreng."
                + "\n\n" + "Cara Membuat:\n\n"
                + "1. Siapkan Tape singkong/ Peyeum.\n\n"
                + "2. Bentuk Tape singkong menjadi persegi. Lalu kukus selama 5 menit (kata ibu saya agar Tape tidak lembek saat digoreng dan lebih manis ?) lalu angkat dan dinginkan.\n\n"
                + "3. Sambil menunggu tape singkong dikukus selesai, siapkan adonan untuk menggoreng tape singkong, yaitu tepung terigu, perisa vanila, ½ gelas air dan garam Secukupnya.\n\n"
                + "4. Siapkan Penggorengan dan beri minyak goreng secukupnya.\n\n"
                + "5. Goreng Tape Singkong dengan api sedang.\n\n"
                + "6. Angkat dan tiriskan bila warna sudah kuning kecoklatan.\n\n"
                + "7. Rondo Royal alias Tape Goreng siap disantap untuk sarapan teman minum teh di pagi hari.");
        makananList.add(makan);

        makan = new Makanan("Puding Jagung Susu", R.drawable.puding
                , "Puding selain sebagai makanan penutup juga dapat menjadi kudapan yang sehat dan lezat."
                , "Bahan - bahan Puding Susu:\n\n"
                + "- 1 bungkus agar - agar bubuk putih.\n"
                + "- 1 kaleng susu kental manis.\n"
                + "- 800 ml air.\n"
                + "\n\n" + "Bahan - bahan Puding Jagung:\n\n"
                + "- 1 bungkus agar - agar bubuk putih.\n"
                + "- 3 buah jagung manis, serut.\n"
                + "- 800 ml santan.\n"
                + "- 80 gram gula pasir.\n"
                + "- 2 sdm tapung maizena.\n"
                + "- 1 sdt garam"
                + "\n\n" + "Cara Membuat:\n\n"
                + "1. Puding Susu : Siapkan panci, masukkan air, susu kental manis dan agar-agar lalu aduk rata. Kemudian masak di atas api sedang sambil diaduk terus hingga mendidih. Angkat lalu tuang dalam cetakan dan dinginkan.\n\n"
                + "2. Puding Jagung : Blender jagung manis bersama air dan santan hingga lembut lalu saring. Kemudian tuang dalam panci, tambahkan garam, gula, agar-agar dan tepung maizena, aduk rata. Masak di atas api sedang sambil terus diaduk hingga mendidih, angkat dan tuang adonan puding jagung di atas puding susu yang mulai mengeras lalu dinginkan.");
        makananList.add(makan);

        makan = new Makanan("Cakwe Empuk Renyah", R.drawable.cakwe
                , "Makanan yang cocok untuk kumpul bersama"
                , "\n\n" + "Bahan - bahan:\n\n"
                + "1. Bahan utama yang digunakan adalah 250 gram tepung terigu kualitas baik.\n"
                + "2. Baking soda kurang lebih sebanyak setengah sendok kecil atau setengah sendok teh.\n"
                + "3. Garam dapur beryodium halus sebanyak kurang lebih 3/4 sendok teh atau sendok kecil.\n"
                + "4. Baking Powder yang dibutuhkan kurang lebih sebanyak setengah sendok makan.\n"
                + "5. Air bersih untuk adonan secukupnya atau kurang lebih sekitar 200 ml.\n"
                + "6. Saus tomat kurang lebih dua sendok besar atau dua sendok makan (bahan saus).\n"
                + "7. Bawang putih lokal ukurang sedang besar sebanyak 1 pcs. Kupas kulitnya dan haluskan untuk campuran saus Resep Cakwe.\n"
                + "8. Gula pasir kurang lebih satu sendok teh (bahan saus).\n"
                + "9. Setengah sendok makan tepung maizena (bahan saus).\n"
                + "10. Garam dapur beryodium setengah sendok teh (bahan saus).\n"
                + "11. Setengah sendok makan sambal instan atau sambal botol (bahan saus).\n"
                + "12. Air bersih matang kurang lebih 175 ml (bahan saus).\n"
                + "13. Minyak goreng secukupnya untuk menggoreng kue cakwe nya nanti."
                + "\n\n" + "Cara Membuat:\n\n"
                + "1. Ambil satu wadah cukup besar. Masukkan 3/4 sendok teh garam dapur beryodium, baking soda dan 1/2 sendok baking powder. Aduk dan campur semua bagian sampai tercampur rata.\n\n"
                + "2. Masukkan tepung terigunya dan campur sampai rata dan tidak ada gumpalan gumpalan.\n\n"
                + "3. Masukkan air bersih kurang lebih 200 ml. Campur dan aduk semua bahan sampai rata dan kalis. Diamkan kurang lebih selama 15 menit sampai 20 menit.\n\n"
                + "4. Aduk dan uleni lagi adonan dari pinggir ke tengah sampai tercampur rata. Dimamkan lagi selama 20 menitan.\n\n"
                + "5. Ulangi proses ini 3-4 kali sampai adonan kue cakwenya elastis dan bisa dibentuk.\n\n"
                + "6. Balik adonan yang sudah elastis dan beri sedikit minyak di atas permukaannya. hal ini dilakukan supaya adonan kue nya tetap lembab. Diamkan lagi selama kurang lebih 50 menit sampai 1 jam.\n\n"
                + "7. Masukkan adonan diatas ke dalam plastik yang bersih. Diamkan di dalam plastik kurang lebih selama 3 jam sampai 4 jam.\n\n"
                + "8. Keluarkan adonan dan giling/tekan dengan kayu atau botol. Tekan adonan sampai agak tipis dengan ukuran tebal kurang lebih sekitar 0.5-1 cm, lebar 2-3 cm dan panjangnya sekitar 5-6 cm. Jangan lupa tempatnya diberi sedikit tepung supaya adonan tidak lengket.\n\n"
                + "9. Rekatkan dan tempel 2 potongan adonan dengan air. Tekan bagian tengah sambungannya dengan sumpit dari atas ke bawah. hati hati saat menekan dan jangan sampai putus.\n\n"
                + "10. Siapkan penggoengan dengan minyak cukup banyak dan api sedang kecil. Tunggu minyak sampai benar benar panas dan kemudian masukkan beberapa potong adonan di atas. Jangan lupa sebelum dimasukkan k dalam minyak tarik adonan sampai memanjang.\n\n"
                + "11. Goreng sambil dibolak balik sampai kuning kecoklatan.\n\n"
                + "12. Untuk membuat sausnya tinggal mencampur gula pasir, garam, saus sambal, saus tomat, bawang yang sudah dihaluskan dan air matangnya.\n\n"
                + "13. Aduk aduk sebentar sampai semua bahan tercampur dan rebus sampai mendidih.\n\n"
                + "14. Angkat dan masukkan tepung maizena sedikit demi sediki sambil tetap diaduk.");
        makananList.add(makan);

        makan = new Makanan("Empek Empek Palembang Asli", R.drawable.empek_empek_palembang
                , "Salah satu makanan asli Kota Palembang yang cukup terkenal dari ujung timur sampai barat Indonesia adalah Empek Empek atau juga dikenal dengan Pempek."
                , "Bahan - bahan:\n\n"
                + "1. Bahan utama yang dibutuhkan adalah daging ikang tengiri yang sudah bebas dari duri kurang lebih 500 gram. Bisa juga menggunakan ikan gabus atau ikan belida apabila tidak ada ikan tengiri.\n"
                + "2. Tepung Sagu sebanyak 250 gram. Gunakan tepung sagu yang mempunyai kualitas paling bagus supaya hasilnya enak.\n"
                + "3. Telur ayam. Pilih ukuran sedang besar dan gunakan setengah butir telur saja.\n"
                + "4. Bawang putih lokal yang ukurannya sedang besar. Kupas kulitnya dan siapkan 80 gram untuk kuah nya dan 6 pcs dihaluskan lebut untuk campuran adonan empek empek.\n"
                + "5. Gula merah aren sebanyak setengah kilogram.\n"
                + "6. Cabe Rawit 100 gram atau tergantung selera dan tingkat kepedasan yang diinginkan.\n"
                + "7. Garam dapur beryodium secukupnya.\n"
                + "8. Asam Jawa kalau ada sedikit saja.\n"
                + "9. Air bersih matang kurang lebih sebanyak setengah liter."
                + "\n\n" + "Cara Membuat:\n\n"
                + "1. Ambil wadah untuk adonan Resep Empek Empek nya. Masukkan Daging ikan tengiri yang sudah dihaluskan terlebih dahulu supaya bisa tercampur sempurna dengan bahan bahan lainnya.\n\n"
                + "2. Masukkan garam dan 6 pcs bawang putih nya kedalam wadah adonan. Campur dengan daging ikannya dan aduk aduk sampai semua bahan tercampur rata.\n\n"
                + "3. Masukkan setengah bagian telurnya dan campur dan aduk lagi dengan bahan bahan lainnya sampai tercampur rata dan tidak ada gumpalan gumpalan.\n\n"
                + "4. Masukkan 250 gram tepung sagunya. Campur dengan semua bahan bahan sebelumnya sampai benar benar rata dan tidak ada gumpalan gumpalan.\n\n"
                + "5. Ambil sedikit adonan diatas dan buat bentuk memanjang, pendek atau sesuai ide anda sendiri untuk bentuk empek empeknya. Lakukan sampai semua adonan habis.\n\n"
                + "6. Siapkan satu tempat untuk merebus adonan yang sudah dibentuk di aras. Beri air secukupnya dan rebus semua adonan pempeknya dalam air yang mendidih sampai matang.\n\n"
                + "7. Siapkan satu wadah lagi untuk membuat kuah cukanya.\n\n"
                + "8. Masukkan air matang 0.5 liter, gula merah yang sudah dipotong kecil kecil dan asam jawa secukupnya. Rebus sampai mendidih sambil diaduk aduk supaya tercampur rata.\n\n"
                + "9. Masukkan garam secukupnya, bawang putih yang sudah dipotong kecil kecil dan garam sesuai selera. Bisa juga ditambahkan cabai rawit sesuai selera. Aduk kembali sampai semua bahan tercampur. Angkat kuahnya dan saring.");
        makananList.add(makan);

        makan = new Makanan("Lumpia Sosis", R.drawable.lumpia_sosis
                , "Makanan yang cocok untuk kumpul bersama"
                , "\n\n" + "Bahan - bahan Kulit Lumpia:\n\n"
                + "- 8 butir telur.\n"
                + "- 2 sendok makan tepung terigu.\n"
                + "- 50 ml air.\n"
                + "- 1/2 sendok teh garam.\n"
                + "- 1/2 sendok teh merica bubuk"
                + "\n\n" + "Bahan - bahan Isi Lumpia:\n\n"
                + "- 100 gram kentang, dipotong kotak 1/2 cm, digoreng berkulit.\n"
                + "- 75 gram wortel, dipotong kotak 1/2 cm, direbus sampai matang.\n"
                + "- 50 gram soun yang direndam air dingin.\n"
                + "- 1/2 buah dada ayam fillet, direbus, disuwir-suwir.\n"
                + "- 3/4 sendok teh garam.\n"
                + "- 1/4 sendok teh merica bubuk.\n"
                + "- 1/2 sendok teh gula pasir.\n"
                + "- 100 ml kaldu ayam.\n"
                + "- 2 siung bawang putih, dicincang halus.\n"
                + "- 1/4 buah bawang bombay, dicincang halus.\n"
                + "- 1 batang seledri, diiris halus.\n"
                + "- 1/2 sendok teh tepung sagu dan 1 sendok makan air, dilarutkan untuk mengentalkan.\n"
                + "- 1 sendok makan minyak goreng untuk menumis.\n"
                + "- 4 buah sosis sapi, dibelah 2 bagian, potong 2 bagian, dikerat-kerat, ditumis"
                + "\n\n" + "Cara Membuat:\n\n"
                + "1. Pertama-tama Anda harus campur telur, tepung terigu, air, garam, dan juga merica bubuk dan aduk rata. Lalu dadar tipis-tipis di pan antilengket dengan diameter 15 cm.\n\n"
                + "2. Untuk Isi Lumpia, Anda tumis bawang putih dan juga bawang bombay sampai tercium bau harum. Kemudian tambahkan bahan isi kentang, wortel, garam, merica bubuk, dada ayam, dan juga gula pasir. Lalu aduk rata. Setelah itu tuang kaldu. Biarkan mendidih. Beikutnya tambahkan soun dan aduk rata juga kentalkan. Tambahkan seledri dan kembali aduk rata.\n\n"
                + "3. Langkah selanjutnya Anda ambil selembar kulit. Kemudian beri isi. Anda tata sosis di atasnya dan Bungkus.");
        makananList.add(makan);

        mAdapter.notifyDataSetChanged();
    }
}
