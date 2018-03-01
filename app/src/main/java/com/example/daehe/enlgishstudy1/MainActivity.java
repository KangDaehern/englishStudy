package com.example.daehe.enlgishstudy1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mProblemAll;
    private Button mProblemWrong;
    private Button mProblemConfused;
    private Button mProblemRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.button_all:
                startActivity(new Intent(this, ProblemAllAcitivity.class));
                break;
            case R.id.button_right:
                startActivity(new Intent(this, ProblemRightActivity.class));
                break;
            case R.id.button_wrong:
                startActivity(new Intent(this, ProblemWrongActivity.class));
                break;
            case R.id.button_confused:
                startActivity(new Intent(this, ProblemConfusedActivity.class));
                break;
        }
    }

    private void initView(){
        mProblemAll = (Button)findViewById(R.id.button_all);
        mProblemRight = (Button)findViewById(R.id.button_right);
        mProblemWrong = (Button)findViewById(R.id.button_wrong);
        mProblemConfused = (Button)findViewById(R.id.button_confused);

        mProblemAll.setOnClickListener(this);
        mProblemConfused.setOnClickListener(this);
        mProblemWrong.setOnClickListener(this);
        mProblemRight.setOnClickListener(this);
    }
}
