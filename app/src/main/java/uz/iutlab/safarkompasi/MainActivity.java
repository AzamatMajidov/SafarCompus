package uz.iutlab.safarkompasi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int backButtonCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        TextView myTextView = (TextView) findViewById(R.id.name);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Avenir-Book.ttf");
        myTextView.setTypeface(typeface);
    }



    @Override
    public void onBackPressed() {
//        super.onBackPressed();

        if(backButtonCount >= 1)
        {
            finish();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Press the back button once again to close the application.", Toast.LENGTH_SHORT).show();
            backButtonCount++;
        }

    }
}
