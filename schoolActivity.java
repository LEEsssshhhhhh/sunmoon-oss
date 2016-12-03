package npp.a1234567;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class schoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

    }
    public void local (View v)
    {
        Intent intent = new Intent(getApplicationContext() , localActivity.class);
        startActivity(intent);
    }

    public void library (View v)
    {
        Intent intent = new Intent(getApplicationContext() , libraryActivity.class);
        startActivity(intent);
    }
    public void library (View v)
    {
        Intent intent = new Intent(getApplicationContext() , libraryActivity.class);
        startActivity(intent);
    }
    public void health (View v)
    {
        Intent intent = new Intent(getApplicationContext() , healthActivity.class);
        startActivity(intent);
    }
}
