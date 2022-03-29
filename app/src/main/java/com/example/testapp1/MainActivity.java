package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_click_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView textHello = findViewById(R.id.txt_hello);
                    textHello.setText("Xin chao!");
                    Log.v("TAG", "Button is clicked!");
                    String str = "";
                    float a = Float.parseFloat(str);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}