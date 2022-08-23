package com.example.trocatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btTroca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTroca = findViewById(R.id.btTroca);
        btTroca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outrajanela = new Intent(getApplicationContext(), OutraActivity.class);
                startActivity(outrajanela);

            }
        });

    }
}