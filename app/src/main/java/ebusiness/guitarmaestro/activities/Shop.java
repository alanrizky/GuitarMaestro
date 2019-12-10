package ebusiness.guitarmaestro.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ebusiness.guitarmaestro.R;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Button bassNeck = findViewById(R.id.buttonBassNecks);
        bassNeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Shop.this, BassNecks.class);
                startActivity(i);
            }
        });

        Button knobs = findViewById(R.id.buttonKnobs);
        knobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Shop.this, Knobs.class);
                startActivity(i);
            }
        });

        Button bodies = findViewById(R.id.buttonBodies);
        bodies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Shop.this, GuitarBodies.class);
                startActivity(i);
            }
        });

        Button guitarHead = findViewById(R.id.buttonGuitarHead);
        guitarHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Shop.this, GuitarNecks.class);
                startActivity(i);
            }
        });
    }
}
