package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDuka, tvPeti, tvGuci, tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibDuka = findViewById(R.id.ibDuka);
        ImageButton ibPeti = findViewById(R.id.ibPeti);
        ImageButton ibGuci = findViewById(R.id.ibGuci);

        ibDuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDukaActivity(v);
            }
        });

        ibPeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPetiActivity(v);
            }
        });

        ibGuci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGuciActivity(v);
            }
        });

    }
    public void openDukaActivity(View view) {
        Intent intent = new Intent(this, DukaActivity.class);
        startActivity(intent);
    }
    public void openPetiActivity(View view) {
        Intent intent = new Intent(this, PetiActivity.class);
        startActivity(intent);
    }
    public void openGuciActivity(View view) {
        Intent intent = new Intent(this, GuciActivity.class);
        startActivity(intent);
    }
}