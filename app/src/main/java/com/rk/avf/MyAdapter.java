package com.rk.avf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context Konteks;
    int[] GambarGambar;
    String[] NamaNama;
    LayoutInflater PenghubungLayout;

    public MyAdapter(Context Konteks, int[] GambarGambar, String[] NamaNama) {
        this.Konteks = Konteks;
        this.GambarGambar = GambarGambar;
        this.NamaNama = NamaNama;
        PenghubungLayout = (LayoutInflater.from(Konteks));
    }

    @Override
    public int getCount() {
        return NamaNama.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = PenghubungLayout.inflate(R.layout.flipper_items, null);

        TextView TV = convertView.findViewById(R.id.TV_2_IDXML);
        ImageView IV = convertView.findViewById(R.id.IV_1_IDXML);

        TV.setText(NamaNama[position]);
        IV.setImageResource(GambarGambar[position]);

        return convertView;
    }
}
