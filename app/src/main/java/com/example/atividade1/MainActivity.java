package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int pointPlayer;
    int pointComputer;
    Button btnRock;
    Button btnPaper;
    Button btnScissors;
    TextView txtPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPoints = (TextView) findViewById(R.id.txtPoints);


        btnRock = (Button) findViewById(R.id.btnRock);
        btnPaper = (Button) findViewById(R.id.btnPaper);
        btnScissors = (Button) findViewById(R.id.btnScissors);


        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(1);
            }
        });

        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(2);
            }
        });

        btnScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(3);
            }
        });
    }

    void play(int val){
        int r = new Random().nextInt(3) + 1;

        if(val == 1 && r == 1){
            Toast.makeText(getApplicationContext(), "Computador > PEDRA", Toast.LENGTH_LONG).show();
        }else if(val == 1 && r == 2){
            Toast.makeText(getApplicationContext(), "Computador > PAPEL", Toast.LENGTH_LONG).show();
            pointComputer = pointComputer + 1;
        }else if(val == 1 && r == 3){
            Toast.makeText(getApplicationContext(), "Computador > TESOURA", Toast.LENGTH_LONG).show();
            pointPlayer = pointPlayer + 1;
        }

        else if(val == 2 && r == 1){
            Toast.makeText(getApplicationContext(), "Computador > PEDRA", Toast.LENGTH_LONG).show();
            pointPlayer = pointPlayer + 1;
        }else if(val == 2 && r == 2){
            Toast.makeText(getApplicationContext(), "Computador > PAPEL", Toast.LENGTH_LONG).show();
        }else if(val == 2 && r == 3){
            Toast.makeText(getApplicationContext(), "Computador > TESOURA", Toast.LENGTH_LONG).show();
            pointComputer = pointComputer + 1;
        }

        else if(val == 3 && r == 1){
            Toast.makeText(getApplicationContext(), "Computador > PEDRA", Toast.LENGTH_LONG).show();
            pointComputer = pointComputer + 1;
        }else if(val == 3 && r == 2){
            Toast.makeText(getApplicationContext(), "Computador > PAPEL", Toast.LENGTH_LONG).show();
            pointPlayer = pointPlayer + 1;
        }else if(val == 3 && r == 3){
            Toast.makeText(getApplicationContext(), "Computador > TESOURA", Toast.LENGTH_LONG).show();
        }
        txtPoints.setText("Computador " + pointComputer + " < > " + pointPlayer +  " Jogador");
    }
    

}