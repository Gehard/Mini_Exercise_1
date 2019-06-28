package com.example.mini_exercise_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        exit = findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
