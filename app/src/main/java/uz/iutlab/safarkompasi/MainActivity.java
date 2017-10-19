package uz.iutlab.safarkompasi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.name)
    TextView appName;
    @BindView(R.id.news_btn)
    Button news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        setTypeFace();




    }

    private void setTypeFace() {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Avenir-Book.ttf");
        appName.setTypeface(typeface);
    }


    @Override
    public void onBackPressed() {
      finish();
    }


    @OnClick(R.id.news_btn)
    public void onNewsClick(View view){
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }
}
