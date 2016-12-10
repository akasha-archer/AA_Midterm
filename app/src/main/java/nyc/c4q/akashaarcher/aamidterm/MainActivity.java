package nyc.c4q.akashaarcher.aamidterm;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import nyc.c4q.akashaarcher.aamidterm.network.RecordService;
import nyc.c4q.akashaarcher.aamidterm.pojos.Record;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;

    private List<Record> recordList;
    private RecordAdapter adapter;
    RecordService postService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecordFragment homeFragment = new RecordFragment();
        FragmentTransaction mainFragTransaction = getSupportFragmentManager().beginTransaction();
        mainFragTransaction.add(R.id.main_container, homeFragment);
        mainFragTransaction.commit();
    }



}
