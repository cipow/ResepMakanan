package com.example.cipowela.resepmakanan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cipowela on 01/10/17.
 */

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MAView> {
    private Context context;
    private List<Makanan> makanan;

    public MakananAdapter(Context context, List<Makanan> makanan) {
        this.context = context;
        this.makanan = makanan;
    }

    @Override
    public MAView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_row_data, parent, false);
        return new MAView(view);
    }

    @Override
    public void onBindViewHolder(MAView holder, int position) {
        Makanan data = makanan.get(position);
        holder.judul.setText(data.getJudul());
        holder.gambar.setImageDrawable(data.getGambar());
        holder.deskripsi.setText(data.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return makanan.size();
    }

    public class MAView extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView judul, deskripsi;
        public ImageView gambar;

        public MAView(View itemView) {
            super(itemView);
            judul = (TextView) itemView.findViewById(R.id.judul);
            deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
