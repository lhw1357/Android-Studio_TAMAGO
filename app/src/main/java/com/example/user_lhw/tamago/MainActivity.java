package com.example.user_lhw.tamago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.user_lhw.tamago.R.id.touch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView left;
    Button Touch;
    int left1=50;
    String left2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left=(TextView)findViewById(R.id.left);
        Touch=(Button)findViewById(R.id.touch);


        Touch.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){

            case touch:
                left1-=1;
                left2=String.valueOf(left1);
                left.setText(left2);
                if(left1>35&&left1<=50) {
                    Touch.setBackgroundResource(R.drawable.egg);
                }else if(left1>20&&left1<=35){
                    Touch.setBackgroundResource(R.drawable.egg1);
                }else if(left1>10&&left1<=20){
                    Touch.setBackgroundResource(R.drawable.egg2);
                }else if(left1>0&&left1<=10){
                    Touch.setBackgroundResource(R.drawable.egg3);
                }else{
                    Touch.setBackgroundResource(R.drawable.egg4);
                    left.setText("Congratulations!");
                }
                break;

        }
    }
}
