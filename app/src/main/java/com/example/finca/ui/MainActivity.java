package com.example.finca.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import com.example.finca.R;

public class MainActivity extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btn_agre = (Button) findViewById(R.id.btn_agre);
    btn_agre.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, agregar.class);
            startActivity(intent);
        }
    });

    Button btn_inve = (Button) findViewById(R.id.btn_inve);
    btn_inve.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, inventario.class);
            startActivity(intent);
        }
    });
}
}