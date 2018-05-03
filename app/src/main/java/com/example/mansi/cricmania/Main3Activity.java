package com.example.mansi.cricmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    int runs_a;
    int wickets_a;
    int extras_a;
    int runs_b;
    int wickets_b;
    int extras_b;
    String winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i2 = getIntent();
        runs_a = i2.getIntExtra("RUNS_A",0);
        runs_b = i2.getIntExtra("RUNS_B",0);
        wickets_a = i2.getIntExtra("WICKETS_A",0);
        wickets_b = i2.getIntExtra("WICKETS_B",0);
        extras_a = i2.getIntExtra("EXTRAS_A",0);
        extras_b = i2.getIntExtra("EXTRAS_B",0);
        TextView summary = (TextView)findViewById(R.id.summary);
        if(runs_a>runs_b){
            winner="Team A wins";
        }else{
            winner="Team B wins";
        }
        summary.setText("Summary:\n"+winner+"\n"+"Team A: \n"+"Runs: "+runs_a+"\n"+"Wickets Taken: "+wickets_b+"\n"+"Extras: "+extras_a+"\n"+"Team B: \n"+"Runs: "+runs_b+"\n"+"Wickets Taken: "+wickets_a+"\n"+"Extras: "+extras_b+"\n");
    }
    public void new_game(View view){
        Intent i4 = new Intent(this,MainActivity.class);
        startActivity(i4);
    }

}