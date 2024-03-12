package kr.ac.tukorea.ge.spg.gurpaper.samplejavaapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.pushMeButton);
        //#2
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.nameTextView);
                tv.setText("PushMe");
            }
        });

        Button btn2 = findViewById(R.id.anotherButton);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.nameTextView);
                tv.setText("Another");
            }
        });
    }
}