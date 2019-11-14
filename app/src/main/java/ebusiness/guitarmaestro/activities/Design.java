package ebusiness.guitarmaestro.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import ebusiness.guitarmaestro.R;

public class Design extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);

        ImageView logo = findViewById(R.id.logo);
        logo.setColorFilter(Color.parseColor("#FFFAAA"));
    }
}
