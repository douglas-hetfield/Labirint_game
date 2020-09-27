package com.example.mylabirint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import Model.Labirint;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    private int position = 1;
    ArrayList <Labirint> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotate();
        createLabirint();
    }

    public void createLabirint(){
        Labirint lab = new Labirint();
        lab.setId(1);
        lab.setCodigo(1);
        lab.setArmPerCent(5);
        lab.setCodFront(0001);
        lab.setCodLeft(0000);
        lab.setCodRight(0000);
        lab.setDist(10);

        lista.add(lab);

    }

    private void rotate(){
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.animate().rotation(180).start();
    }

    public void up(android.view.View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.animate().rotation(180).start();
        this.position = 1;

        moviment(imageView, 0, -80);
    }

    public void left(android.view.View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.animate().rotation(90).start();
        this.position = 2;


        moviment(imageView, -80, 0);
    }

    public void right(android.view.View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.animate().rotation(270).start();
        this.position = 3;


        moviment(imageView, 80, 0);
    }

    public void down(android.view.View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        if (this.position != 4){
            int rotate = 0;
            if (this.position == 3) {
                rotate = 360;
            } else {
                rotate = 0;
            }

            imageView.animate().rotation(rotate).start();
            this.position = 4;
        }
        moviment(imageView, 0, 80);
    }

    public void moviment(ImageView view, int x, int y){
        int rate = 220;
        final View aSuaView = findViewById(R.id.view);
        float largura = aSuaView.getWidth();
        float altura = aSuaView.getHeight();
        System.out.println(largura);
        System.out.println(view.getX() + x);

        view.animate().x(x + view.getX()).y(y + view.getY()).setDuration(rate).start();
    }
}