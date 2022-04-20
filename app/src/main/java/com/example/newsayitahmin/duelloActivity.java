package com.example.newsayitahmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class duelloActivity extends AppCompatActivity {

    TextView anlık;
    EditText girdi;
    Button tahminEt,yenioyun,yuzluk,besyuzuk,binlik;
    int tahmin=0, rastgele=0,kacKare,kacakadar=0,siraKimde=0;
    String deger,isim1,isim2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        Intent i=getIntent();

        kacKare=intent.getIntExtra("kackereisim",0);


        isim1=intent.getStringExtra("isimbir");
        isim2=intent.getStringExtra("isimiki");

        String giris=i.getStringExtra("hosgeldiniz1");

        yuzluk=(Button)findViewById(R.id.yüzlük);
        besyuzuk=(Button)findViewById(R.id.besyuzluk);
        binlik=(Button)findViewById(R.id.binlik);

        anlık=(TextView)findViewById(R.id.anlık);

        anlık.setText(giris);


        yuzluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kacakadar=100;
                rastgele = (int) Math.ceil(Math.random() * kacakadar);
                anlık.setText("1'den 100'e kadar sayı tahmini yapabilirsiniz.");

            }
        });

        besyuzuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kacakadar=500;
                rastgele = (int) Math.ceil(Math.random() * kacakadar);
                anlık.setText("1'den 499'a kadar sayı tahmini yapabilirsiniz.");
            }
        });

        binlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kacakadar=1000;
                rastgele = (int) Math.ceil(Math.random() * kacakadar);
                anlık.setText("1'den 1000'e kadar sayı tahmini yapabilirsiniz");
            }
        });






        girdi=(EditText)findViewById(R.id.girdi);
        tahminEt=(Button)findViewById(R.id.Btahmin);
        yenioyun=(Button)findViewById(R.id.Byeni);



        tahminEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(siraKimde%2==0){
                tahmin=Integer.parseInt(girdi.getText().toString());
                kacKare++;
                if(rastgele>tahmin)
                    deger=(isim1+" yanlış tahmin ettin "+isim2+" lütfen daha büyük bir sayı gir!");
                if (rastgele<tahmin)
                    deger=(isim1+" yanlış tahmin ettin "+isim2+" lütfen daha küçük bir sayı gir!");
                if(rastgele==tahmin){
                    deger=("Tebrikler sayıyı "+Integer.toString(kacKare)+". denemede buldun "+isim1);


                }
                siraKimde++;
                anlık.setText(deger);
                    onStop();}

               else if(siraKimde%2==1){
                    tahmin=Integer.parseInt(girdi.getText().toString());
                    kacKare++;
                    if(rastgele>tahmin)
                        deger=(isim2+" yanlış tahmin ettin "+isim1+" lütfen daha büyük bir sayı gir!");
                    if (rastgele<tahmin)
                        deger=(isim2+" yanlış tahmin ettin "+isim1+" lütfen daha küçük bir sayı gir!");
                    if(rastgele==tahmin){
                        deger=("Tebrikler sayıyı "+Integer.toString(kacKare)+". denemede buldun "+isim2);

                    }
                    siraKimde++;
                    anlık.setText(deger);
                    onStop();}
            }
        });

        yenioyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rastgele = (int) Math.ceil(Math.random() * 100);
                kacKare=0;
                siraKimde=0;
                anlık.setText("Düello Başladı, Lütfen Aralık Seçiniz.");

            }
        });


    }
}