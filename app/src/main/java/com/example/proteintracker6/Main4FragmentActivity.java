package com.example.proteintracker6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class Main4FragmentActivity extends AppCompatActivity implements Mhs01Fragment.SendMessage, Mhs1Fragment.SendMessage1 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_fragment);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Mhs01Fragment mhs01Fragment = Mhs01Fragment.newInstance("22", "ee");
        ft.replace(R.id.FM1, mhs01Fragment); //--mereplace frame main ke protein fragment
        ft.commit();

    }

    @Override
    public void SendData1(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Mhs1Fragment mhs1Fragment = Mhs1Fragment.newInstance(Message, "x");
        ft.replace(R.id.FM1, mhs1Fragment);
        ft.commit();
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Mhs01Fragment mhs01Fragment = Mhs01Fragment.newInstance(Message, "x");
        ft.replace(R.id.FM1, mhs01Fragment);
        ft.commit();
    }

}
