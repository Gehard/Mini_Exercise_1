package com.example.mini_exercise_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityOne extends AppCompatActivity {

     Button exitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        exitbtn = findViewById(R.id.exit);

        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityOne.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
