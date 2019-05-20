package demo.bbedir.rahatlaticisesler.favorite;

import java.util.List;

import demo.bbedir.rahatlaticisesler.base.BaseInteractorImpl;
import demo.bbedir.rahatlaticisesler.CustomResponseCallBack;
import demo.bbedir.rahatlaticisesler.SoundObject;
import retrofit2.Response;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public class FavoriteInteractorImpl extends BaseInteractorImpl<FavoriteInteractor.Callback> implements FavoriteInteractor {

    private FavoriteService mService;

    public FavoriteInteractorImpl(FavoriteInteractor.Callback interactor) {
        super(interactor);
        mService = getApiHelper().getService(FavoriteService.class);
    }


    @Override
    public void getFavoriteList() {

        mService.getFavoriteList().enqueue(new CustomResponseCallBack<List<SoundObject>>() {
            @Override
            public void onSuccess(Response<List<SoundObject>> response) {

                getCallback().favoritesLoadedListener(response.body());
            }

            @Override
            public void onFail() {

                getCallback().onDataNotFound();
            }
        });


    }

    @Override
    public void removeFavorite(int id) {

        mService.removeFavorite().enqueue(new CustomResponseCallBack<Boolean>() {
            @Override
            public void onSuccess(Response<Boolean> response) {
                getCallback().favoriteRemovedListener(response.body());

            }

            @Override
            public void onFail() {
                getCallback().onDataNotFound();
            }
        });

    }


}
