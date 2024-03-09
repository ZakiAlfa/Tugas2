package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GuciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guci);

        TextView tvGucibiasa = findViewById(R.id.tvGucibiasa);
        TextView tvGucimurah = findViewById(R.id.tvGucimurah);
        TextView tvGucihitam = findViewById(R.id.tvGucihitam);
        TextView tvGucihias = findViewById(R.id.tvGucikerajaan);
        TextView tvGucimahal = findViewById(R.id.tvGucimahal);


        String deskripsiGuciBiasa = getString(R.string.deskgucibiasa);
        tvGucibiasa.setText(deskripsiGuciBiasa);

        String deskripsiGuciMurah = getString(R.string.deskgucimurah);
        tvGucimurah.setText(deskripsiGuciMurah);

        String deskripsiGuciHitam = getString(R.string.deskgucihitam);
        tvGucihitam.setText(deskripsiGuciHitam);

        String deskripsiGuciHias = getString(R.string.deskgucihias);
        tvGucihias.setText(deskripsiGuciHias);

        String deskripsiGuciMahal = getString(R.string.deskgucimahal);
        tvGucimahal.setText(deskripsiGuciMahal);


    }
}