package omahti.olc.learntocode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        int myNumFromIntent = getIntent().getIntExtra("value1", 0);
        String myStringFromIntent = getIntent().getStringExtra("value2");
        Toast.makeText(MyListActivity.this, String.valueOf(myNumFromIntent), Toast.LENGTH_SHORT).show();

    }
}
