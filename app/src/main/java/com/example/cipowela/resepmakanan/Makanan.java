package com.example.cipowela.resepmakanan;

/**
 * Created by cipowela on 01/10/17.
 */

public class Makanan {
    private String judul, deskripsi;
    private int gambar;

    public Makanan(String judul, String deskripsi, int gambar) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
