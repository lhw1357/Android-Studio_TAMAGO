package com.example.user_lhw.tamago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView left;
    int left1=1000000;
    String left2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left=(TextView)findViewById(R.id.left);
        Button touch = (Button) findViewById(R.id.touch);


        touch.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){

            case R.id.touch:
                left1-=1;
                left2=String.valueOf(left1);
                left.setText(left2);

                break;

        }
    }
}
