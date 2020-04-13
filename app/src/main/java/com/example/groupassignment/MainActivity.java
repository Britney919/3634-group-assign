package com.example.groupassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout = findViewById(R.id.main_fc);

        final HomeFragment homeFragment = new HomeFragment();

        final StatsFragment statsFragment = new StatsFragment();

        final QuizFragment quizFragment = new QuizFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_fc,homeFragment).commit();

        Button homeBtn = findViewById(R.id.home_btn);
        Button statsBtn = findViewById(R.id.stats_btn);
        Button quizBtn = findViewById(R.id.quiz_btn);


        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fc,homeFragment).commit();
            }
        });
        statsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fc,statsFragment).commit();
            }
        });
        quizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fc,quizFragment).commit();
            }
        });
    }
}
