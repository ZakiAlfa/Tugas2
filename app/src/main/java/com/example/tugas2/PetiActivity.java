package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PetiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peti);

        TextView tvPetibiasa = findViewById(R.id.tvPetibiasa);
        TextView tvPetimurah = findViewById(R.id.tvPetimurah);
        TextView tvPetisedang = findViewById(R.id.tvPetisedang);
        TextView tvPeticina = findViewById(R.id.tvPeticina);
        TextView tvPetimahal = findViewById(R.id.tvPetimahal);


        String deskripsiPetiBiasa = getString(R.string.deskpetibiasa);
        tvPetibiasa.setText(deskripsiPetiBiasa);

        String deskripsiPetiMurah = getString(R.string.deskpetimurah);
        tvPetimurah.setText(deskripsiPetiMurah);

        String deskripsiPetiSedang = getString(R.string.deskpetisedang);
        tvPetisedang.setText(deskripsiPetiSedang);

        String deskripsiPetiCina = getString(R.string.deskpeticina);
        tvPeticina.setText(deskripsiPetiCina);

        String deskripsiPetiMahal = getString(R.string.deskpetimahal);
        tvPetimahal.setText(deskripsiPetiMahal);


        Intent intent = new Intent(PetiActivity.this, DetailActivity.class);
        intent.putExtra("DESKRIPSI_PETI_BIASA", deskripsiPetiBiasa);
        intent.putExtra("DESKRIPSI_PETI_MURAH", deskripsiPetiMurah);
        intent.putExtra("DESKRIPSI_PETI_SEDANG", deskripsiPetiSedang);
        intent.putExtra("DESKRIPSI_PETI_CINA", deskripsiPetiCina);
        intent.putExtra("DESKRIPSI_PETI_MAHAL", deskripsiPetiMahal);

        startActivity(intent);
    }
}