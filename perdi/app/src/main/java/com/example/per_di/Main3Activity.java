package com.example.per_di;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toast toast = Toast.makeText(getApplicationContext(),"пуньк 2", Toast.LENGTH_SHORT);
        toast.show();
        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
    }
}
