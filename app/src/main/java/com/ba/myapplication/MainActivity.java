package com.ba.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t = findViewById(R.id.tv);

        Button btn = findViewById(R.id.button1234);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("hello , Abo Hasan" + i++);
                Log.e("tag","hello , Abo Hasan Akeel");
//                Intent myIntent = new Intent(CurrentActivity.this, NextActivity.class);
//                myIntent.putExtra("key", value); //Optional parameters
//                CurrentActivity.this.startActivity(myIntent);

            }
        });

    }
}
