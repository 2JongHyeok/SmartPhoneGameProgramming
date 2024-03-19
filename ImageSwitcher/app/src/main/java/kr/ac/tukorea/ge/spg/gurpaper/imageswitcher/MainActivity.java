package kr.ac.tukorea.ge.spg.gurpaper.imageswitcher;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int nowPage=0;
    private int[] resIds = new int[]{
            R.mipmap.cat_1,
            R.mipmap.cat_2,
            R.mipmap.cat_3,
            R.mipmap.cat_4,
            R.mipmap.cat_5,
            R.mipmap.cat_6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnPrev(View view) {
        ImageView iv = findViewById(R.id.mainImageView);
        if(nowPage!=0){
            iv.setImageResource(resIds[nowPage-1]);
            nowPage--;
        }
        TextView tv =findViewById(R.id.pageTextView);
        tv.setText(nowPage+1+"/"+resIds.length);
    }

    public void onBtnNext(View view) {
        ImageView iv = findViewById(R.id.mainImageView);
        if(nowPage!=5) {
            iv.setImageResource(resIds[nowPage + 1]);
            nowPage++;
        }
        TextView tv =findViewById(R.id.pageTextView);
        tv.setText(nowPage+1+"/"+resIds.length);
    }
}