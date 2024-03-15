package kr.ac.tukorea.ge.spg.gurpaper.imageswitcher;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnPrev(View view) {
        ImageView iv = findViewById(R.id.mainImageView);
        iv.setImageResource(R.mipmap.cat_1);
    }

    public void onBtnNext(View view) {
        ImageView iv = findViewById(R.id.mainImageView);
        iv.setImageResource(R.mipmap.cat_2);
    }
}