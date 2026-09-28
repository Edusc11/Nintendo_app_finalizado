package com.example.nintendo_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnVerMais = findViewById(R.id.button);
        if (btnVerMais != null) {
            btnVerMais.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, clbloja.class);
                    startActivity(intent);
                }
            });
        }

        Button stfox = findViewById(R.id.starfox);
        if (stfox != null) {
            stfox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, starfox.class);
                    startActivity(intent);
                }
            });
        }

        Button conke = findViewById(R.id.conkers);
        if (conke != null) {
            conke.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, conkers.class);
                    startActivity(intent);
                }
            });
        }

        Button dk = findViewById(R.id.kong);
        if (dk != null) {
            dk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, personagensDK.class);
                    startActivity(intent);
                }
            });
        }

        Button lk = findViewById(R.id.lonk);
        if (lk != null) {
            lk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, personagensLK.class);
                    startActivity(intent);
                }
            });
        }

        Button pg = findViewById(R.id.pingu);
        if (pg != null) {
            pg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, personagensPG.class);
                    startActivity(intent);
                }
            });
        }
    }
}
