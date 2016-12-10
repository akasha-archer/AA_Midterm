package nyc.c4q.akashaarcher.aamidterm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.akashaarcher.aamidterm.pojos.Record;

/**
 * Created by akashaarcher on 12/10/16.
 */

public class RecordViewHolder extends RecyclerView.ViewHolder {

    private final View view;
    private TextView tvLiked;
    private TextView tvUserName;


    public RecordViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        view = itemView;
        tvLiked = (TextView) view.findViewById(R.id.tv_liked);
        tvUserName = (TextView) view.findViewById(R.id.tv_username);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.record_item, parent, false);
    }


    public void bind(Record record) {
        tvLiked.setText(record.getLiked());
        tvUserName.setText(record.getUsername());
    }

}
