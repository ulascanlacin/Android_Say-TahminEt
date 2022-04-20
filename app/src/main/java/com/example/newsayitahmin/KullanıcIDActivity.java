package com.example.newsayitahmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KullanıcIDActivity extends AppCompatActivity {

    String isim1,isim2;
    EditText girdi1;
    EditText girdi2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanicid);

        final int kacakeredeger=0;


        girdi1=(EditText)findViewById(R.id.edit1);
        girdi2=(EditText)findViewById(R.id.edit2);
        button=(Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              isim1= girdi1.getText().toString();
              isim2= girdi2.getText().toString();

                final String giris="Düello başladı "+isim1+" ve "+isim2+" hoş geldiniz aralık seçip oyunun tadını çıkarın";
                Intent i =new Intent(KullanıcIDActivity.this,duelloActivity.class);
                i.putExtra("isimbir",isim1);
                i.putExtra("isimiki",isim2);

                i.putExtra("kackereisim",kacakeredeger);
                i.putExtra("hosgeldiniz1",giris);

                startActivity(i);



            }
        });




    }
}