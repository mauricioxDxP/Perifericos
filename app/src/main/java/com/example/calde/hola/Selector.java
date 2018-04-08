package com.example.calde.hola;


import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.calde.hola.databinding.ActivitySelectorBinding;

public class Selector extends AppCompatActivity {

    Context c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        ActivitySelectorBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_selector);

        c=this;

        binding.btholamundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(c,SoyUnHolaMundo.class);
                startActivity(intent);
            }
        });
        binding.btParlantes.setText("Parlantes");
        binding.btParlantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(c,Parlantes.class);
                startActivity(intent);
            }
        });


    }
}
