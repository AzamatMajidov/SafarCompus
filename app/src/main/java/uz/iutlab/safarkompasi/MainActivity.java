package uz.iutlab.safarkompasi;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
        TextView myTextView = (TextView) findViewById(R.id.name);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Avenir-Book.ttf");
        myTextView.setTypeface(typeface);
    }
}
