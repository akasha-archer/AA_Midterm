package nyc.c4q.akashaarcher.aamidterm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.akashaarcher.aamidterm.network.RecordService;
import nyc.c4q.akashaarcher.aamidterm.network.ServiceFactory;
import nyc.c4q.akashaarcher.aamidterm.pojos.Data;
import nyc.c4q.akashaarcher.aamidterm.pojos.Record;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static nyc.c4q.akashaarcher.aamidterm.network.ServiceFactory.BASE_URL;

/**
 * Created by akashaarcher on 12/10/16.
 */

public class RecordFragment extends Fragment {

    private static final String TAG = "MainActivity ";
    private RecyclerView recyclerView;

    private List<Record> recordList;
    private RecordAdapter adapter;
    RecordService recordService;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recordService = ServiceFactory.createService();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        recordList = new ArrayList<>();

        adapter = new RecordAdapter(getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.records_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Retrofit builder = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        RecordService recordService = builder.create(RecordService.class);

        Call<Data> recordCall = recordService.listRecords();
        recordCall.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                Data recordResp = response.body();
                recordList = recordResp.getRecords();
                adapter.setRecords(recordList);
                Log.d(TAG, recordList.size() + "");
                Log.d(TAG, "There was a success" + response);
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                Log.d(TAG, "There was a failure" + t);
            }

        });

    }
}
