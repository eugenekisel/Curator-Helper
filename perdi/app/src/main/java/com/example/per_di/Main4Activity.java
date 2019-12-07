package com.example.per_di;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toast toast = Toast.makeText(getApplicationContext(),"пуньк 3", Toast.LENGTH_SHORT);
        toast.show();
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent8 = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(intent8);
            }
        });
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent9 = new Intent(Main4Activity.this, Main3Activity.class);
                startActivity(intent9);
            }
        });
    }
}