package npp.a1234567;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class foodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

    }
    public void orange (View v)
    {
        Intent intent = new Intent(getApplicationContext() , orangeActivity.class);
        startActivity(intent);
    }
    public void delivery (View v)
    {
        Intent intent = new Intent(getApplicationContext() , deliveryActivity.class);
        startActivity(intent);
    }
    public void delivery (View v)
    {
        Intent intent = new Intent(getApplicationContext() , deliveryActivity.class);
        startActivity(intent);
    }

}
