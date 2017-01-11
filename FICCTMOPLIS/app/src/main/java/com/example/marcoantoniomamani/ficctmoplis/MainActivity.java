package com.example.marcoantoniomamani.ficctmoplis;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView botton;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botton=(BottomNavigationView)findViewById(R.id.bottomNavigationView);

        botton.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.BtnBoleta){
                   ;
                }
                if (item.getItemId()==R.id.BtnCalendarioA){

                }
                if (item.getItemId()==R.id.BtnInformacion){

                }
                if (item.getItemId()==R.id.BtnModulos){

                }
                if (item.getItemId()==R.id.BtnMaestroO){

                }
                return false;
            }
        });
        botton.setItemIconTintList(null);
        botton.setItemTextColor(ColorStateList.valueOf(getColor(R.color.blanco)));
   //    botton.setBackgroundColor(R.color.color_light);
   //     botton.setBackgroundResource(R.color.colorPrimary);
    }
}
