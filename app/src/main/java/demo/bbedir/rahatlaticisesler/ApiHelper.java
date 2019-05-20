package demo.bbedir.rahatlaticisesler;

import demo.bbedir.rahatlaticisesler.base.BaseService;
import demo.bbedir.rahatlaticisesler.favorite.FavoriteService;
import retrofit2.Retrofit;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public class ApiHelper {

    private Retrofit retrofitClient;

    public ApiHelper() {

        retrofitClient = RetrofitClient.getInstance();

    }

    public <T extends BaseService> T getService(Class<T> service) {
        return retrofitClient.create(service);
    }


}
