package com.example.catalogo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class MyListItems extends AppCompatActivity {

    private static int[] images = {
            R.drawable.base,
            R.drawable.broncer,
            R.drawable.delineador,
            R.drawable.iluminador,
            R.drawable.liquido,
            R.drawable.maquillaje,
            R.drawable.mascara
    };

    private String[] titles = {
            "Base",
            "Broncer",
            "Delineador",
            "Iluminador",
            "Liquido",
            "Maquillaje",
            "Mascara"
    };

    private String[] descriptions = {
            "Descripción de la imagen Base.",
            "Descripción de la imagen Broncer.",
            "Descripción de la imagen Delineador.",
            "Descripción de la imagen Iluminador.",
            "Descripción de la imagen Liquido.",
            "Descripción de la imagen Maquillaje.",
            "Descripción de la imagen Mascara."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        ViewPager2 viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this, images, titles, descriptions);
        viewPager.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}