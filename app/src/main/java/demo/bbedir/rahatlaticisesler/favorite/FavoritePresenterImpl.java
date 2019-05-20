package demo.bbedir.rahatlaticisesler.favorite;

import java.util.List;

import demo.bbedir.rahatlaticisesler.base.BasePresenterImpl;
import demo.bbedir.rahatlaticisesler.SoundObject;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public class FavoritePresenterImpl extends BasePresenterImpl<FavoriteView> implements FavoritePresenter, FavoriteInteractor.Callback {

    FavoriteInteractor mInteractor;

    public FavoritePresenterImpl(FavoriteView view) {
        super(view);
        mInteractor = new FavoriteInteractorImpl(this);

    }


    @Override
    public void onPageInitialize() {

        mView.showDialog();
        mInteractor.getFavoriteList();

    }

    @Override
    public void onRemoveClick(SoundObject soundObject) {

        mInteractor.removeFavorite(soundObject.getId());
    }

    @Override
    public void favoritesLoadedListener(List<SoundObject> soundObjectList) {

        mView.initialized();
        mView.hideDialog();
    }

    @Override
    public void favoriteRemovedListener(boolean success) {

        mView.removed();
    }

    @Override
    public void onDataNotFound() {

    }
}
