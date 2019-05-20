package demo.bbedir.rahatlaticisesler;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * CREATED BY bbedir on 2019-05-14.
 */
public final class RetrofitClient {

    private static final String BASE_URL = "https://conceptcartoonservice.visualinnovative.com";
    private static Retrofit retrofit = null;

    public static Retrofit getInstance() {
        if (retrofit == null) {
            synchronized (RetrofitClient.class) {

                OkHttpClient.Builder client = new OkHttpClient.Builder();


                OkHttpClient okHttpClient = client.build();

                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okHttpClient)
                        .build();
            }

        }

        return retrofit;
    }

}
