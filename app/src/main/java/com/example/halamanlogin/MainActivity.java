package com.example.halamanlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtusername, txtkatasandi;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtusername =(EditText)findViewById(R.id.txtusername);
        txtkatasandi =(EditText)findViewById(R.id.txtkatasandi);
        btnLogin =(Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = txtusername.getText().toString();
                String katasandi = txtkatasandi.getText().toString();
                if (username.equalsIgnoreCase("Muamar") && katasandi.equalsIgnoreCase("Muamar")){
                    Toast.makeText(MainActivity.this,"Sukses Login",Toast.LENGTH_SHORT).show();
                    Intent move = new Intent(MainActivity.this , HalamanUtama.class);
                    move.putExtra("username",username);
                    startActivity(move);
                }else {
                    Toast.makeText(MainActivity.this,"Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}