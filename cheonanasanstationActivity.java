package npp.a1234567;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class cheonanasanstationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheonanasanstation);
    }
    public void cheonanasanstation1 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri.parse("https://drive.google.com/uc?export=download&id=0B4lob-osMnV1anFxYk5vVmRET2s");
        startActivity(intent);
    }
    public void cheonanasanstation2 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri.parse("https://drive.google.com/uc?export=download&id=0B4lob-osMnV1NVBsQy1tVU1wLTQ");
        startActivity(intent);
    }
    public void cheonanasanstation3 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri.parse("https://drive.google.com/uc?export=download&id=0B4lob-osMnV1ME9iZVU1RUNpS3M");
        startActivity(intent);
    }
}
