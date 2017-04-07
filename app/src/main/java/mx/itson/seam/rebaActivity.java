package mx.itson.seam;

import android.os.Handler;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class rebaActivity extends ActionBarActivity implements View.OnClickListener {

    ImageButton boton_reba_01_01, boton_reba_01_02, boton_reba_01_03, boton_reba_01_04,
            boton_reba_02_01, boton_reba_02_02, boton_reba_02_03,
            boton_reba_03_01, boton_reba_03_02,
            boton_reba_04_01, boton_reba_04_02, boton_reba_04_03,
            boton_reba_05_01, boton_reba_05_02,
            boton_reba_06_01, boton_reba_06_02, boton_reba_06_03,
            boton_reba_07_01, boton_reba_07_02, boton_reba_07_03, boton_reba_07_04,
            boton_reba_08_01, boton_reba_08_02, boton_reba_08_03, boton_reba_08_04,
            boton_reba_09_01, boton_reba_09_02, boton_reba_09_03,
            boton_reba_10_01, boton_reba_10_02;

    FrameLayout reba_paso_01, reba_paso_02, reba_paso_03, reba_paso_04, reba_paso_05, reba_paso_06,
            reba_paso_07, reba_paso_08, reba_paso_09, reba_paso_10;

    int where; //¿En qué paso estamos?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reba);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        //Asignación Layouts (Pantallas de Pasos)
        reba_paso_01 = (FrameLayout) findViewById(R.id.reba_paso_01);
        reba_paso_02 = (FrameLayout) findViewById(R.id.reba_paso_02);
        reba_paso_03 = (FrameLayout) findViewById(R.id.reba_paso_03);
        reba_paso_04 = (FrameLayout) findViewById(R.id.reba_paso_04);
        reba_paso_05 = (FrameLayout) findViewById(R.id.reba_paso_05);
        reba_paso_06 = (FrameLayout) findViewById(R.id.reba_paso_06);
        reba_paso_07 = (FrameLayout) findViewById(R.id.reba_paso_07);
        reba_paso_08 = (FrameLayout) findViewById(R.id.reba_paso_08);
        reba_paso_09 = (FrameLayout) findViewById(R.id.reba_paso_09);
        reba_paso_10 = (FrameLayout) findViewById(R.id.reba_paso_10);
        //Botones Paso 1
        boton_reba_01_01 = (ImageButton) findViewById(R.id.boton_reba_01_01);
            boton_reba_01_01.setOnClickListener(this);
        boton_reba_01_02 = (ImageButton) findViewById(R.id.boton_reba_01_02);
            boton_reba_01_02.setOnClickListener(this);
        boton_reba_01_03 = (ImageButton) findViewById(R.id.boton_reba_01_03);
            boton_reba_01_03.setOnClickListener(this);
        boton_reba_01_04 = (ImageButton) findViewById(R.id.boton_reba_01_04);
            boton_reba_01_04.setOnClickListener(this);
        //Botones Paso 2
        boton_reba_02_01 = (ImageButton) findViewById(R.id.boton_reba_02_01);
            boton_reba_02_01.setOnClickListener(this);
        boton_reba_02_02 = (ImageButton) findViewById(R.id.boton_reba_02_02);
            boton_reba_02_02.setOnClickListener(this);
        boton_reba_02_03 = (ImageButton) findViewById(R.id.boton_reba_02_03);
            boton_reba_02_03.setOnClickListener(this);
        //Botones Paso 3
        boton_reba_03_01 = (ImageButton) findViewById(R.id.boton_reba_03_01);
            boton_reba_03_01.setOnClickListener(this);
        boton_reba_03_02 = (ImageButton) findViewById(R.id.boton_reba_03_02);
            boton_reba_03_02.setOnClickListener(this);
        //Botones Paso 4
        boton_reba_04_01 = (ImageButton) findViewById(R.id.boton_reba_04_01);
            boton_reba_04_01.setOnClickListener(this);
        boton_reba_04_02 = (ImageButton) findViewById(R.id.boton_reba_04_02);
            boton_reba_04_02.setOnClickListener(this);
        boton_reba_04_03 = (ImageButton) findViewById(R.id.boton_reba_04_03);
            boton_reba_04_03.setOnClickListener(this);
        //Botones Paso 5
        boton_reba_05_01 = (ImageButton) findViewById(R.id.boton_reba_05_01);
            boton_reba_05_01.setOnClickListener(this);
        boton_reba_05_02 = (ImageButton) findViewById(R.id.boton_reba_05_02);
            boton_reba_05_02.setOnClickListener(this);
        //Botones Paso 6
        boton_reba_06_01 = (ImageButton) findViewById(R.id.boton_reba_06_01);
            boton_reba_06_01.setOnClickListener(this);
        boton_reba_06_02 = (ImageButton) findViewById(R.id.boton_reba_06_02);
            boton_reba_06_02.setOnClickListener(this);
        boton_reba_06_03 = (ImageButton) findViewById(R.id.boton_reba_06_03);
            boton_reba_06_03.setOnClickListener(this);
        //Botones Paso 7
        boton_reba_07_01 = (ImageButton) findViewById(R.id.boton_reba_07_01);
            boton_reba_07_01.setOnClickListener(this);
        boton_reba_07_02 = (ImageButton) findViewById(R.id.boton_reba_07_02);
            boton_reba_07_02.setOnClickListener(this);
        boton_reba_07_03 = (ImageButton) findViewById(R.id.boton_reba_07_03);
            boton_reba_07_03.setOnClickListener(this);
        boton_reba_07_04 = (ImageButton) findViewById(R.id.boton_reba_07_04);
            boton_reba_07_04.setOnClickListener(this);
        //Botones Paso 8
        boton_reba_08_01 = (ImageButton) findViewById(R.id.boton_reba_08_01);
            boton_reba_08_01.setOnClickListener(this);
        boton_reba_08_02 = (ImageButton) findViewById(R.id.boton_reba_08_02);
            boton_reba_08_02.setOnClickListener(this);
        boton_reba_08_03 = (ImageButton) findViewById(R.id.boton_reba_08_03);
            boton_reba_08_03.setOnClickListener(this);
        boton_reba_08_04 = (ImageButton) findViewById(R.id.boton_reba_08_04);
            boton_reba_08_04.setOnClickListener(this);
        //Botones Paso 9
        boton_reba_09_01 = (ImageButton) findViewById(R.id.boton_reba_09_01);
            boton_reba_09_01.setOnClickListener(this);
        boton_reba_09_02 = (ImageButton) findViewById(R.id.boton_reba_09_02);
            boton_reba_09_02.setOnClickListener(this);
        boton_reba_09_03 = (ImageButton) findViewById(R.id.boton_reba_09_03);
            boton_reba_09_03.setOnClickListener(this);
        //Botones Paso 10
        boton_reba_10_01 = (ImageButton) findViewById(R.id.boton_reba_10_01);
            boton_reba_10_01.setOnClickListener(this);
        boton_reba_10_02 = (ImageButton) findViewById(R.id.boton_reba_10_02);
            boton_reba_10_02.setOnClickListener(this);

        where=1; //¿En que paso estamos?


    }

    public static void AnimationButtonPressed(ImageButton x) {
        ScaleAnimation scale_in =  new ScaleAnimation(0.8f, 1f, 0.8f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale_in.setDuration(250);     // animation duration in milliseconds
        scale_in.setFillAfter(true);    // If fillAfter is true, the transformation that this animation performed will persist when it is finished.
        x.startAnimation(scale_in);
    }

    @Override
    public void onBackPressed() {
        switch (where) {
            case 1:
                super.onBackPressed();
                break;

            case 2:
                reba_paso_02.setVisibility(View.INVISIBLE);
                reba_paso_01.setVisibility(View.VISIBLE);
                where = 1;
                break;

            case 3:
                reba_paso_03.setVisibility(View.INVISIBLE);
                reba_paso_02.setVisibility(View.VISIBLE);
                where = 2;
                break;

            case 4:
                reba_paso_04.setVisibility(View.INVISIBLE);
                reba_paso_03.setVisibility(View.VISIBLE);
                where = 3;
                break;

            case 5:
                reba_paso_05.setVisibility(View.INVISIBLE);
                reba_paso_04.setVisibility(View.VISIBLE);
                where = 4;
                break;

            case 6:
                reba_paso_06.setVisibility(View.INVISIBLE);
                reba_paso_05.setVisibility(View.VISIBLE);
                where = 5;
                break;

            case 7:
                reba_paso_07.setVisibility(View.INVISIBLE);
                reba_paso_06.setVisibility(View.VISIBLE);
                where = 6;
                break;

            case 8:
                reba_paso_08.setVisibility(View.INVISIBLE);
                reba_paso_07.setVisibility(View.VISIBLE);
                where = 7;
                break;

            case 9:
                reba_paso_09.setVisibility(View.INVISIBLE);
                reba_paso_08.setVisibility(View.VISIBLE);
                where = 8;
                break;

            case 10:
                reba_paso_10.setVisibility(View.INVISIBLE);
                reba_paso_09.setVisibility(View.VISIBLE);
                where = 9;
                break;

            case 11:
                //reba_paso_11.setVisibility(View.INVISIBLE);
                reba_paso_10.setVisibility(View.VISIBLE);
                where = 10;
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            //Botones Paso 1
            case R.id.boton_reba_01_01:
                AnimationButtonPressed(boton_reba_01_01);
                Handler handler_01_01 = new Handler();
                handler_01_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_01.setVisibility(View.INVISIBLE);
                        reba_paso_02.setVisibility(View.VISIBLE);
                        where = 2;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_01_02:
                AnimationButtonPressed(boton_reba_01_02);
                Handler handler_01_02 = new Handler();
                handler_01_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_01.setVisibility(View.INVISIBLE);
                        reba_paso_02.setVisibility(View.VISIBLE);
                        where = 2;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_01_03:
                AnimationButtonPressed(boton_reba_01_03);
                Handler handler_01_03 = new Handler();
                handler_01_03.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_01.setVisibility(View.INVISIBLE);
                        reba_paso_02.setVisibility(View.VISIBLE);
                        where = 2;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_01_04:
                AnimationButtonPressed(boton_reba_01_04);
                Handler handler_01_04 = new Handler();
                handler_01_04.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_01.setVisibility(View.INVISIBLE);
                        reba_paso_02.setVisibility(View.VISIBLE);
                        where = 2;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 2
            case R.id.boton_reba_02_01:
                AnimationButtonPressed(boton_reba_02_01);
                Handler handler_02_01 = new Handler();
                handler_02_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_02.setVisibility(View.INVISIBLE);
                        reba_paso_03.setVisibility(View.VISIBLE);
                        where = 3;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_02_02:
                AnimationButtonPressed(boton_reba_02_02);
                Handler handler_02_02 = new Handler();
                handler_02_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_02.setVisibility(View.INVISIBLE);
                        reba_paso_03.setVisibility(View.VISIBLE);
                        where = 3;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_02_03:
                AnimationButtonPressed(boton_reba_02_03);
                Handler handler_02_03 = new Handler();
                handler_02_03.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_02.setVisibility(View.INVISIBLE);
                        reba_paso_03.setVisibility(View.VISIBLE);
                        where = 3;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 3
            case R.id.boton_reba_03_01:
                AnimationButtonPressed(boton_reba_03_01);
                Handler handler_03_01 = new Handler();
                handler_03_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_03.setVisibility(View.INVISIBLE);
                        reba_paso_04.setVisibility(View.VISIBLE);
                        where = 4;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_03_02:
                AnimationButtonPressed(boton_reba_03_02);
                Handler handler_03_02 = new Handler();
                handler_03_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_03.setVisibility(View.INVISIBLE);
                        reba_paso_04.setVisibility(View.VISIBLE);
                        where = 4;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 4
            case R.id.boton_reba_04_01:
                AnimationButtonPressed(boton_reba_04_01);
                Handler handler_04_01 = new Handler();
                handler_04_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_04.setVisibility(View.INVISIBLE);
                        reba_paso_05.setVisibility(View.VISIBLE);
                        where = 5;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_04_02:
                AnimationButtonPressed(boton_reba_04_02);
                Handler handler_04_02 = new Handler();
                handler_04_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_04.setVisibility(View.INVISIBLE);
                        reba_paso_05.setVisibility(View.VISIBLE);
                        where = 5;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_04_03:
                AnimationButtonPressed(boton_reba_04_03);
                Handler handler_04_03 = new Handler();
                handler_04_03.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_04.setVisibility(View.INVISIBLE);
                        reba_paso_05.setVisibility(View.VISIBLE);
                        where = 5;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 5
            case R.id.boton_reba_05_01:
                AnimationButtonPressed(boton_reba_05_01);
                Handler handler_05_01 = new Handler();
                handler_05_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_05.setVisibility(View.INVISIBLE);
                        reba_paso_06.setVisibility(View.VISIBLE);
                        where = 6;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_05_02:
                AnimationButtonPressed(boton_reba_05_02);
                Handler handler_05_02 = new Handler();
                handler_05_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_05.setVisibility(View.INVISIBLE);
                        reba_paso_06.setVisibility(View.VISIBLE);
                        where = 6;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 6
            case R.id.boton_reba_06_01:
                AnimationButtonPressed(boton_reba_06_01);
                Handler handler_06_01 = new Handler();
                handler_06_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_06.setVisibility(View.INVISIBLE);
                        reba_paso_07.setVisibility(View.VISIBLE);
                        where = 7;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_06_02:
                AnimationButtonPressed(boton_reba_06_02);
                Handler handler_06_02 = new Handler();
                handler_06_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_06.setVisibility(View.INVISIBLE);
                        reba_paso_07.setVisibility(View.VISIBLE);
                        where = 7;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_06_03:
                AnimationButtonPressed(boton_reba_06_03);
                Handler handler_06_03 = new Handler();
                handler_06_03.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_06.setVisibility(View.INVISIBLE);
                        reba_paso_07.setVisibility(View.VISIBLE);
                        where = 7;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 7
            case R.id.boton_reba_07_01:
                AnimationButtonPressed(boton_reba_07_01);
                Handler handler_07_01 = new Handler();
                handler_07_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_07.setVisibility(View.INVISIBLE);
                        reba_paso_08.setVisibility(View.VISIBLE);
                        where = 8;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_07_02:
                AnimationButtonPressed(boton_reba_07_02);
                Handler handler_07_02 = new Handler();
                handler_07_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_07.setVisibility(View.INVISIBLE);
                        reba_paso_08.setVisibility(View.VISIBLE);
                        where = 8;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_07_03:
                AnimationButtonPressed(boton_reba_07_03);
                Handler handler_07_03 = new Handler();
                handler_07_03.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_07.setVisibility(View.INVISIBLE);
                        reba_paso_08.setVisibility(View.VISIBLE);
                        where = 8;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_07_04:
                AnimationButtonPressed(boton_reba_07_04);
                Handler handler_07_04 = new Handler();
                handler_07_04.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_07.setVisibility(View.INVISIBLE);
                        reba_paso_08.setVisibility(View.VISIBLE);
                        where = 8;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 8
            case R.id.boton_reba_08_01:
                AnimationButtonPressed(boton_reba_08_01);
                Handler handler_08_01 = new Handler();
                handler_08_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_08.setVisibility(View.INVISIBLE);
                        reba_paso_09.setVisibility(View.VISIBLE);
                        where = 9;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_08_02:
                AnimationButtonPressed(boton_reba_08_02);
                Handler handler_08_02 = new Handler();
                handler_08_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_08.setVisibility(View.INVISIBLE);
                        reba_paso_09.setVisibility(View.VISIBLE);
                        where = 9;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_08_03:
                AnimationButtonPressed(boton_reba_08_03);
                Handler handler_08_03 = new Handler();
                handler_08_03.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_08.setVisibility(View.INVISIBLE);
                        reba_paso_09.setVisibility(View.VISIBLE);
                        where = 9;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_08_04:
                AnimationButtonPressed(boton_reba_08_04);
                Handler handler_08_04 = new Handler();
                handler_08_04.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_08.setVisibility(View.INVISIBLE);
                        reba_paso_09.setVisibility(View.VISIBLE);
                        where = 9;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 9
            case R.id.boton_reba_09_01:
                AnimationButtonPressed(boton_reba_09_01);
                Handler handler_09_01 = new Handler();
                handler_09_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_09.setVisibility(View.INVISIBLE);
                        //reba_paso_10.setVisibility(View.VISIBLE);
                        where = 10;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_09_02:
                AnimationButtonPressed(boton_reba_09_02);
                Handler handler_09_02 = new Handler();
                handler_09_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_09.setVisibility(View.INVISIBLE);
                        //reba_paso_10.setVisibility(View.VISIBLE);
                        where = 10;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_09_03:
                AnimationButtonPressed(boton_reba_09_03);
                Handler handler_09_03 = new Handler();
                handler_09_03.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_09.setVisibility(View.INVISIBLE);
                        //reba_paso_10.setVisibility(View.VISIBLE);
                        where = 10;
                    }
                }, 250);

                //Asignar puntuación
                break;

            //Botones Paso 10
            case R.id.boton_reba_10_01:
                AnimationButtonPressed(boton_reba_10_01);
                Handler handler_10_01 = new Handler();
                handler_10_01.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_10.setVisibility(View.INVISIBLE);
                        //reba_paso_11.setVisibility(View.VISIBLE);
                        where = 11;
                    }
                }, 250);

                //Asignar puntuación
                break;

            case R.id.boton_reba_10_02:
                AnimationButtonPressed(boton_reba_10_02);
                Handler handler_10_02 = new Handler();
                handler_10_02.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reba_paso_10.setVisibility(View.INVISIBLE);
                        //reba_paso_11.setVisibility(View.VISIBLE);
                        where = 11;
                    }
                }, 250);

                //Asignar puntuación
                break;


        }
    }
}
