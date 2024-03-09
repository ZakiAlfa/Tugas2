package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String deskripsiPetiBiasa = getIntent().getStringExtra("DESKRIPSI_PETI_BIASA");
        String deskripsiPetiMurah = getIntent().getStringExtra("DESKRIPSI_PETI_MURAH");
        String deskripsiPetiSedang = getIntent().getStringExtra("DESKRIPSI_PETI_SEDANG");
        String deskripsiPetiCina =getIntent().getStringExtra("DESKRIPSI_PETI_CINA");
        String deskripsiPetiMahal =getIntent().getStringExtra("DESKRIPSI_PETI_MAHAL");

        TextView tvDeskripsiPetiBiasa = findViewById(R.id.tvPetibiasa);
        TextView tvDeskripsiPetiMurah = findViewById(R.id.tvPetimurah);
        TextView tvDeskripsiPetiSedang = findViewById(R.id.tvPetisedang);
        TextView tvDeskripsiPetiCina = findViewById(R.id.tvPeticina);
        TextView tvDeskripsiPetiMahal = findViewById(R.id.tvPetimahal);

        tvDeskripsiPetiBiasa.setText(deskripsiPetiBiasa);
        tvDeskripsiPetiMurah.setText(deskripsiPetiMurah);
        tvDeskripsiPetiSedang.setText(deskripsiPetiSedang);
        tvDeskripsiPetiCina.setText(deskripsiPetiCina);
        tvDeskripsiPetiMahal.setText(deskripsiPetiMahal);

    }
}