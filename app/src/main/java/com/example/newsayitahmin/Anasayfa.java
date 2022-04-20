package com.example.newsayitahmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anasayfa extends AppCompatActivity {
    Button Byeni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        Byeni=(Button)findViewById(R.id.button);

        final int kacakeredeger=0;
        final String giris="Yeni Oyun Başladı Aralık Seçip Oyunun Tadını Çıkarın";

        Byeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Anasayfa.this,MainActivity.class);
                intent.putExtra("kackereisim",kacakeredeger);
                intent.putExtra("hosgeldiniz",giris);
                startActivity(intent);



            }
        });

    }

    public void gecis(View view){

        Intent intent =new Intent(Anasayfa.this,KullanıcIDActivity.class);

        startActivity(intent);

    }

}