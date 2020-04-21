package com.rk.avf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class MainActivity extends AppCompatActivity {

    AdapterViewFlipper AVF_1_IDJAVA;

    int[] GambarGambar = {
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar6,
            R.drawable.gambar7
    };

    String[] NamaNama = {
            "Gambar 1",
            "Gambar 2",
            "Gambar 3",
            "Gambar 4",
            "Gambar 5",
            "Gambar 6",
            "Gambar 7"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AVF_1_IDJAVA = findViewById(R.id.AVF_1_IDXML);
        MyAdapter AdapterSaya = new MyAdapter(this, GambarGambar, NamaNama);

        AVF_1_IDJAVA.setAdapter(AdapterSaya);
        AVF_1_IDJAVA.setFlipInterval(2000);
        AVF_1_IDJAVA.setAutoStart(true);
    }
}
