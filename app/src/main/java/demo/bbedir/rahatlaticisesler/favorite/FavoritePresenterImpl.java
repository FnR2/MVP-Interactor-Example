package demo.bbedir.rahatlaticisesler.favorite;

import java.util.List;

import demo.bbedir.rahatlaticisesler.base.BasePresenterImpl;
import demo.bbedir.rahatlaticisesler.SoundObject;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public class FavoritePresenterImpl extends BasePresenterImpl<FavoriteView, FavoriteInteractorImpl> implements FavoritePresenter, FavoriteInteractor.Callback {


    public FavoritePresenterImpl(FavoriteView view, FavoriteInteractorImpl interactor) {
        super(view, interactor);

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
