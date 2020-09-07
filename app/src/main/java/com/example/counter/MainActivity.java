package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counterValue;
    Button btMinus, btPlus;
    TextView myCounter,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMinus = findViewById(R.id.btMinus);
        btPlus = findViewById(R.id.btPlus);
        myCounter = findViewById(R.id.myCounter);
        reset = findViewById(R.id.reset);


        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counterValue != 0) {
                    counterValue -= 1;
                    myCounter.setText(counterValue+"");
                }

            };
        });


        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counterValue += 1;
                myCounter.setText(counterValue+"");
            };
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterValue = 0;
                myCounter.setText(counterValue+"");
            }
        });
    }
}