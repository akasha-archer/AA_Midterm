package nyc.c4q.akashaarcher.aamidterm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.akashaarcher.aamidterm.pojos.Data;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Log.d(TAG, "NUmber of items in list: " + data.getRecords().size());
    }
}
