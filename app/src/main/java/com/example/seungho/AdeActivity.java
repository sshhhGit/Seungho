package com.example.seungho;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdeActivity extends AppCompatActivity {
    public static final int REQUEST_CODE = 200;
    Button btnSb, btnGa, btnNa, btnDa, btnA_1, btnB_1, btnC_1, btnD_1, btnE_1, btnF_1, btnG_1, btnH_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ade);

        btnSb = (Button) findViewById(R.id.btnAD);

    }

    public void mOnClickSb(View view) {

        Intent intent = new Intent(getApplicationContext(), ShoppingbasketActivity.class);
        startActivityForResult(intent, REQUEST_CODE);

    }
    public void mOnClickCoffee(View view) {
        Intent intent = new Intent(getApplicationContext(), CoffeeActivity.class);
        startActivity(intent);
    }
    public void mOnClickTea(View view) {
        Intent intent = new Intent(getApplicationContext(), TeaActivity.class);
        startActivity(intent);
    }
    public void mOnClickAde(View view) {
        Intent intent = new Intent(getApplicationContext(), AdeActivity.class);
        startActivity(intent);
    }
}