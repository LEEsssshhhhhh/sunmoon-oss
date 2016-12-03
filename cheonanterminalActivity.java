package npp.a1234567;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class cheonanterminalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheonanterminal);

    }
    public void cheonanterminal1 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri.parse("https://drive.google.com/uc?export=download&id=0B4lob-osMnV1N3N3cFhmdndGamM");
        startActivity(intent);
    }
    public void cheonanterminal2 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri.parse("https://drive.google.com/uc?export=download&id=0B4lob-osMnV1OTg3VndGZzJFTjQ");
        startActivity(intent);
    }
    public void cheonanterminal3 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri.parse("https://drive.google.com/uc?export=download&id=0B4lob-osMnV1dDl6a2Z2X2dHTDQ");
        startActivity(intent);
    }

}
