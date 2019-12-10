package ebusiness.guitarmaestro.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import ebusiness.guitarmaestro.R;

public class Design extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);

        ImageView logo = findViewById(R.id.logo);
        logo.setColorFilter(Color.parseColor("#FFFAAA"));

        ImageView send = findViewById(R.id.imageView3);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Design.this, Message.class);
                startActivity(i);
            }
        });
    }

    public void handleUploadDesign(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, 1);
    }


}
