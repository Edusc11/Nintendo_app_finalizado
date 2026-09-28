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

public class personagensLK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_personagens_lk);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button menu = findViewById(R.id.menu);
        if (menu != null) {
            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(personagensLK.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }

        Button comprar1 = findViewById(R.id.button2);
        if (comprar1 != null) {
            comprar1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(personagensLK.this, clbloja.class);
                    startActivity(intent);
                }
            });
        }

        Button comprar2 = findViewById(R.id.jitsu);
        if (comprar2 != null) {
            comprar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(personagensLK.this, clbloja.class);
                    startActivity(intent);
                }
            });
        }
    }
}
