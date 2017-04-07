package mx.itson.seam;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    ImageButton botonOpcion01, botonOpcion02, botonOpcion03;
    ImageView figuraOpcionOff, figuraOpcion01, figuraOpcion02, figuraOpcion03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonOpcion01 = (ImageButton) findViewById(R.id.opcion_01);
        botonOpcion02 = (ImageButton) findViewById(R.id.opcion_02);
        botonOpcion03 = (ImageButton) findViewById(R.id.opcion_03);

        figuraOpcionOff = (ImageView) findViewById(R.id.figura_menu_opcion_off);
        figuraOpcion01 = (ImageView) findViewById(R.id.figura_menu_opcion_01);
        figuraOpcion02 = (ImageView) findViewById(R.id.figura_menu_opcion_02);
        figuraOpcion03 = (ImageView) findViewById(R.id.figura_menu_opcion_03);

        figuraOpcion01.setVisibility(View.INVISIBLE);
        figuraOpcion02.setVisibility(View.INVISIBLE);
        figuraOpcion03.setVisibility(View.INVISIBLE);

        botonOpcion01.setOnClickListener(this);
        botonOpcion02.setOnClickListener(this);
        botonOpcion03.setOnClickListener(this);
    }

    public static void AnimationScaleIn(ImageButton x) {
        ScaleAnimation scale_in =  new ScaleAnimation(1f, 1.1f, 1f, 1.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale_in.setDuration(250);     // animation duration in milliseconds
        scale_in.setFillAfter(true);    // If fillAfter is true, the transformation that this animation performed will persist when it is finished.
        x.startAnimation(scale_in);

    }

    public void AnimationOut(ImageButton x) {
        ScaleAnimation scale_out =  new ScaleAnimation(1.10005f, 1f, 1.10005f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale_out.setDuration(250);     // animation duration in milliseconds
        scale_out.setFillAfter(true);    // If fillAfter is true, the transformation that this animation performed will persist when it is finished.
        scale_out.cancel();
        x.startAnimation(scale_out);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.opcion_01:
                figuraOpcionOff.setVisibility(View.INVISIBLE);
                figuraOpcion02.setVisibility(View.INVISIBLE);
                figuraOpcion03.setVisibility(View.INVISIBLE);
                figuraOpcion01.setVisibility(View.VISIBLE);
                botonOpcion01.setBackground(getResources().getDrawable(R.drawable.ovalo_light));
                AnimationScaleIn(botonOpcion01);
                Handler handler_reba = new Handler();
                handler_reba.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent1 = new Intent(MainActivity.this, rebaActivity.class);
                        startActivity(intent1);
                        Handler handler_reba_out = new Handler();
                        handler_reba_out.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                botonOpcion01.setBackground(getResources().getDrawable(R.drawable.ovalo));
                                AnimationOut(botonOpcion01);
                            }
                        }, 100);
                    }
                }, 250);
                break;

            case R.id.opcion_02:
                figuraOpcionOff.setVisibility(View.INVISIBLE);
                figuraOpcion01.setVisibility(View.INVISIBLE);
                figuraOpcion03.setVisibility(View.INVISIBLE);
                figuraOpcion02.setVisibility(View.VISIBLE);
                botonOpcion02.setBackground(getResources().getDrawable(R.drawable.ovalo_light));
                AnimationScaleIn(botonOpcion02);
                Handler handler_rula = new Handler();
                handler_rula.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent2 = new Intent(MainActivity.this, rulaActivity.class);
                        startActivity(intent2);
                        Handler handler_rula_out = new Handler();
                        handler_rula_out.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                botonOpcion02.setBackground(getResources().getDrawable(R.drawable.ovalo));
                                AnimationOut(botonOpcion02);
                            }
                        }, 100);
                    }
                }, 250);
                break;

            case R.id.opcion_03:
                figuraOpcionOff.setVisibility(View.INVISIBLE);
                figuraOpcion01.setVisibility(View.INVISIBLE);
                figuraOpcion02.setVisibility(View.INVISIBLE);
                figuraOpcion03.setVisibility(View.VISIBLE);
                botonOpcion03.setBackground(getResources().getDrawable(R.drawable.ovalo_light));
                AnimationScaleIn(botonOpcion03);
                Handler handler_consultar = new Handler();
                handler_consultar.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent3 = new Intent(MainActivity.this, consultarActivity.class);
                        startActivity(intent3);
                        Handler handler_consultar_out = new Handler();
                        handler_consultar_out.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                botonOpcion03.setBackground(getResources().getDrawable(R.drawable.ovalo));
                                AnimationOut(botonOpcion03);
                            }
                        }, 100);
                    }
                }, 250);
                break;


        }

    }
}
