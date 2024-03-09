package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DukaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duka2);

        TextView tvBungabiasa = findViewById(R.id.tvBungabiasa);
        TextView tvBungalove = findViewById(R.id.tvBungalove);
        TextView tvBungaduka = findViewById(R.id.tvBungaduka);
        TextView tvPapanbunga = findViewById(R.id.tvPapan);
        TextView tvDekorasi = findViewById(R.id.tvDekorasi);


        String deskripsiPetiBiasa = getString(R.string.deskbungabiasa);
        tvBungabiasa.setText(deskripsiPetiBiasa);

        String deskripsiPetiMurah = getString(R.string.deskbungalove);
        tvBungalove.setText(deskripsiPetiMurah);

        String deskripsiPetiSedang = getString(R.string.deskbungamakam);
        tvBungaduka.setText(deskripsiPetiSedang);

        String deskripsiPetiCina = getString(R.string.deskpapanduka);
        tvPapanbunga.setText(deskripsiPetiCina);

        String deskripsiPetiMahal = getString(R.string.deskdekorasi);
        tvDekorasi.setText(deskripsiPetiMahal);

    }
}