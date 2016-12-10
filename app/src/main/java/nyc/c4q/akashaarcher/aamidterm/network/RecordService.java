package nyc.c4q.akashaarcher.aamidterm.network;

import nyc.c4q.akashaarcher.aamidterm.pojos.Data;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by akashaarcher on 12/10/16.
 */

public interface RecordService {
    @GET("api/timelines/users/918753190470619136")
    Call<Data> listRecords();
}
