package com.studio.pattimura.testingclasssharing2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HalamanLogin extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);

        btnLogin = (Button) findViewById(R.id.btnMasuk);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnLogin) {
            startActivity(new Intent(HalamanLogin.this, Introduction.class));
            finish();
        }
    }
}
