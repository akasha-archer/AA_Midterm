package nyc.c4q.akashaarcher.aamidterm.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by akashaarcher on 12/10/16.
 */

public class ServiceFactory {
    public static final String BASE_URL = "https://vine.co/";
    private static Retrofit retrofit;
    private static Retrofit.Builder builder;

    public static RecordService createService() {
        if (retrofit == null) {
            builder = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

        }
        retrofit = builder.build();
        return retrofit.create(RecordService.class);
    }
}
