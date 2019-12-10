package ebusiness.guitarmaestro.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import ebusiness.guitarmaestro.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView logo = findViewById(R.id.logo);
        logo.setColorFilter(Color.parseColor("#FFFFFF"));

        ImageView design = findViewById(R.id.design_btn);
        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Design.class);
                startActivity(i);
            }
        });

        ImageView buy = findViewById(R.id.guitarParts_btn);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Shop.class);
                startActivity(i);
            }
        });

        TextView cart = findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Cart.class);
                startActivity(i);
            }
        });
    }
}
