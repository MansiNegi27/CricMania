package com.example.mansi.cricmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //public static final String OVERS="com.example.mansi.cricmania.MainActivity.overs";
    public String OVERS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int overs=6;//default value
    public void getOvers(){
        EditText overs_edit = (EditText)findViewById(R.id.enter);
        overs =6*( Integer.parseInt(overs_edit.getText().toString()));
    }
    public void go(View view){
        getOvers();
        Intent i3 = new Intent(this,Main2Activity.class);
        i3.putExtra("OVERS",overs);
        startActivity(i3);
    }
}
