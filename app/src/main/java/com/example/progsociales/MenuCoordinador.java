package com.example.progsociales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuCoordinador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_coordinador);
        // Icono en el action bar de mi activity
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
}
