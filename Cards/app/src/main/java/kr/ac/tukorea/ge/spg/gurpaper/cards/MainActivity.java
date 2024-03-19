package kr.ac.tukorea.ge.spg.gurpaper.cards;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageButton previousImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnCard(View view) {
        Log.d("Tag", "Card!!");

        if (previousImageButton != null) {
            previousImageButton.setImageResource(R.mipmap.card_blue_back);
        }
        
        ImageButton imageButton = (ImageButton) view;
        imageButton.setImageResource(R.mipmap.card_as);

        previousImageButton = imageButton;
    }
}