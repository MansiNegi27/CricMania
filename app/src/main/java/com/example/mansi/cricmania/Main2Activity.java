package com.example.mansi.cricmania;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.content.DialogInterface;
public class Main2Activity extends AppCompatActivity {
    int overs2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i3=getIntent();
        overs2 = i3.getIntExtra("OVERS",6);
    }
    public String RUNS_A;
    public String RUNS_B;
    public String WICKETS_A;
    public String WICKETS_B;
    public String EXTRAS_A;
    public String EXTRAS_B;
    int runs1= 0;
    int balls1= 0;
    int wickets1= 0;
    int runs2= 0;
    int balls2= 0;
    int wickets2= 0;
    int extra1=0;
    int extra2=0;
    public void addScore(View view){
        switch(view.getId()){
            case R.id.one:
             runs1 +=1;
             wickets1 +=0;
             balls1 +=1;
             displayScore(runs1,wickets1);
             break;
            case R.id.two:
                runs1 +=2;
                wickets1 +=0;
                balls1 +=1;
                displayScore(runs1,wickets1);
                break;
            case R.id.three:
                runs1 +=3;
                wickets1 +=0;
                balls1 +=1;
                displayScore(runs1,wickets1);
                break;
            case R.id.four:
                runs1 +=4;
                wickets1 +=0;
                balls1 +=1;
                displayScore(runs1,wickets1);
                break;
            case R.id.five:
                runs1 +=5;
                wickets1 +=0;
                balls1 +=1;
                displayScore(runs1,wickets1);
                break;
            case R.id.six:
                runs1 +=6;
                wickets1 +=0;
                balls1 +=1;
                displayScore(runs1,wickets1);
                break;
            case R.id.nb:
                runs1 +=0;
                wickets1 +=0;
                balls1 -=1;
                extra1+=1;
                displayScore(runs1,wickets1);
                break;
            case R.id.lb:
                runs1 +=1;
                wickets1 +=0;
                balls1 +=0;
                extra1+=1;
                displayScore(runs1,wickets1);
                break;
            case R.id.w:
                runs1 +=0;
                wickets1 +=0;
                balls1 -=1;
                extra1+=1;
                displayScore(runs1,wickets1);
                break;
            case R.id.out:
                runs1 +=0;
                wickets1 +=1;
                balls1 +=1;
                displayScore(runs1,wickets1);
                break;

            case R.id.one1:
                runs2 +=1;
                wickets2 +=0;
                balls2 +=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.two2:
                runs2 +=2;
                wickets2 +=0;
                balls2 +=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.three3:
                runs2 +=3;
                wickets2 +=0;
                balls2 +=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.four4:
                runs2 +=4;
                wickets2 +=0;
                balls2 +=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.five5:
                runs2+=5;
                wickets2+=0;
                balls2+=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.six6:
                runs2 +=6;
                wickets2 +=0;
                balls2 +=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.nb1:
                runs2 +=0;
                wickets2 +=0;
                balls2 -=1;
                extra2+=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.lb1:
                runs2 +=1;
                wickets2 +=0;
                balls2 +=0;
                extra2+=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.w1:
                runs2 +=0;
                wickets2 +=0;
                balls2 -=1;
                extra2+=1;
                displayScore2(runs2,wickets2);
                break;
            case R.id.out1:
                runs2 +=0;
                wickets2 +=1;
                balls2 +=1;
                displayScore2(runs2,wickets2);
                break;
        }


    }
   public void displayScore2(int runs_2, int wickets_2){
        if(balls2<overs2 && wickets2<10) {
            TextView score_B_view = (TextView) findViewById(R.id.score_b);
            score_B_view.setText("Score:\n"+runs_2 + "/" + wickets_2);
            TextView count_balls = (TextView) findViewById(R.id.count_balls);
            count_balls.setText("Balls left :"+(overs2-balls2)+"/"+overs2);
        }else if(balls2==overs2 || wickets2==10){
            TextView score_b_view = (TextView) findViewById(R.id.score_b);
            score_b_view.setText("Score:\n"+runs_2 + "/" + wickets_2);
            TextView count_balls = (TextView) findViewById(R.id.count_balls);
            count_balls.setText("Balls left :"+(overs2-balls2)+"/"+overs2);

            AlertDialog.Builder dialog1 = new AlertDialog.Builder(this);
            dialog1.setMessage("Game Over");
            AlertDialog alert = dialog1.create();
            alert.show();
        }
    }

   public void displayScore(int runs_1,int wickets_1) {
       if (balls1 < overs2 && wickets1 <10) {
           TextView score_a_view = (TextView) findViewById(R.id.score_a);
           score_a_view.setText(overs2+"Score:\n"+runs_1 + "/" + wickets_1);
           TextView count_balls = (TextView) findViewById(R.id.count_balls);
           count_balls.setText("Balls left :"+(overs2-balls1)+"/"+overs2);
       }else if(balls1 == overs2 || wickets1 ==10){
           TextView score_a_view = (TextView) findViewById(R.id.score_a);
           score_a_view.setText("Score:\n"+runs_1 + "/" + wickets_1);
           TextView count_balls = (TextView) findViewById(R.id.count_balls);
           count_balls.setText("Balls left :"+(overs2-balls1)+"/"+overs2);

           AlertDialog.Builder dialog2 = new AlertDialog.Builder(this);
           dialog2.setMessage("let the other team play");
           AlertDialog alert2 = dialog2.create();
           alert2.show();
       }
   }
    public void resetScore(View view){
        runs1 = 0;
        runs2 = 0;
        wickets1 = 0;
        wickets2 = 0;
        balls1 = 0;
        balls2 = 0;
        overs2 = 0;
        displayScore(0,0);
        displayScore2(0,0);
        Intent i1 = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(i1);
    }
    public void submitScore(View view){
        Intent i2 = new Intent(Main2Activity.this,Main3Activity.class);
        i2.putExtra("RUNS_A",runs1);
        i2.putExtra("RUNS_B",runs2);
        i2.putExtra("WICKETS_A",wickets1);
        i2.putExtra("WICKETS_B",wickets2);
        i2.putExtra("EXTRAS_A",extra1);
        i2.putExtra("EXTRAS_B",extra2);
        startActivity(i2);
    }


}
