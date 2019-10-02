package com.example.proteintracker6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Help2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help2);

//        TextView myTextView = new TextView(this);
        TextView textView = findViewById(R.id.textView1);
        textView.setText("hehe");

        Bundle b = getIntent().getExtras();
        String tmpString = b.getString("helpString");

       textView.setText(tmpString);
    }
}
