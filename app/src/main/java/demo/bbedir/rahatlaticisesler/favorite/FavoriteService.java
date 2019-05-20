package demo.bbedir.rahatlaticisesler.favorite;

import java.util.List;

import demo.bbedir.rahatlaticisesler.base.BaseService;
import demo.bbedir.rahatlaticisesler.SoundObject;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public interface FavoriteService extends BaseService {

    @POST("movies/")
    Call<List<SoundObject>> getFavoriteList();


    @POST("movies/")
    Call<Boolean> removeFavorite();

}
