package nyc.c4q.akashaarcher.aamidterm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.akashaarcher.aamidterm.pojos.Record;

/**
 * Created by akashaarcher on 12/10/16.
 */

public class RecordAdapter extends RecyclerView.Adapter {

    Context context;
    private List<Record> records;

    public RecordAdapter(Context context) {
        this.context = context;
        this.records = new ArrayList<>();
    }


    public void setRecords(List<Record> records) {
        this.records = records;
        notifyDataSetChanged();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecordViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecordViewHolder postViewHolder = (RecordViewHolder) holder;
        Record recordList = records.get(position);
        postViewHolder.bind(recordList);

    }

    @Override
    public int getItemCount() {
        return records.size();
    }
}
