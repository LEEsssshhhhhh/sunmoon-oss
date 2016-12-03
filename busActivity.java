package npp.a1234567;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.File;
import java.io.FileInputStream;

public class busActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);


    }

    public void cheonancampus (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri.parse("https://drive.google.com/uc?export=download&id=0B4lob-osMnV1d3VXMlI0NzJmcmM");
        startActivity(intent);
    }

    public void onyangstation(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri.parse("https://drive.google.com/uc?export=download&id=0B4lob-osMnV1ZllHT1BvUXExMVU");
        startActivity(intent);
    }
    public void cheonanasanstation(View v)
    {
        Intent intent = new Intent(getApplicationContext() , cheonanasanstationActivity.class);
        startActivity(intent);
    }
    public void cheonanterminal (View v)
    {
        Intent intent = new Intent(getApplicationContext() , cheonanterminalActivity.class);
        startActivity(intent);
    }


}
