package ebusiness.guitarmaestro.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import ebusiness.guitarmaestro.R;

public class CreateAccount extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        ImageView create = findViewById(R.id.create_btn);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(CreateAccount.this, Login.class);
                    startActivity(i);
                    finish();
            }
        });

    }
}
