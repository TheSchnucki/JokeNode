package com.udacity.gradle.builditbigger.jokepresentationdeluxe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokePresentationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_presentation);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("Joke");

        TextView jokeTv = findViewById(R.id.joke_tv);
        jokeTv.setText(joke);
    }
}
