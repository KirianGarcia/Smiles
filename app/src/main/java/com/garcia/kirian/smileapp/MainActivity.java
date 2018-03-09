package com.garcia.kirian.smileapp;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    boolean flagFace;
    AnimatedVectorDrawable cambiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flagFace=true;
        cambiar = (AnimatedVectorDrawable) getDrawable(R.drawable.ad_animacion);
        final ImageView smile = (ImageView) findViewById(R.id.imageView);
        smile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!cambiar.isRunning()) {
                    flagFace=!flagFace;
                    if(!flagFace){
                        cambiar = (AnimatedVectorDrawable) getDrawable(R.drawable.ad_animacion);
                    }else{
                        cambiar = (AnimatedVectorDrawable) getDrawable(R.drawable.ad_animacion2);
                    }
                    smile.setImageDrawable(cambiar);
                    cambiar.start();
                }
            }
        });



        final FloatingActionsMenu menuMultipleActions = (FloatingActionsMenu) findViewById(R.id.multiple_actions);






    }
}
