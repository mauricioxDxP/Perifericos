package com.example.calde.hola;

import android.databinding.DataBindingUtil;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.example.calde.hola.databinding.ActivityParlantesBinding;

public class Parlantes extends AppCompatActivity {
    SoundPool sp;
    private int fartsound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sp=new SoundPool(20, AudioManager.STREAM_MUSIC,0);
        fartsound=sp.load(this,R.raw.cuack,1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parlantes);
        ActivityParlantesBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_parlantes);
        binding.btPedos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            sp.play(fartsound,1,1,1,0,1);
            }
        });
        binding.btnCuackTouch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                sp.play(fartsound,1,1,1,0,1);
                return true;
            }
        });

    }
}
