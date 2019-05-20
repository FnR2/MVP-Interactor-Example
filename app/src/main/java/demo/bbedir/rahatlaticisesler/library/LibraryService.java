package demo.bbedir.rahatlaticisesler.library;

import java.util.List;

import demo.bbedir.rahatlaticisesler.base.BaseService;
import demo.bbedir.rahatlaticisesler.CategoryObject;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public interface LibraryService extends BaseService {

    @POST("movies/")
    Call<List<CategoryObject>> getCategoryList();
}
