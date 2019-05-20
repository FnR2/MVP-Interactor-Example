package demo.bbedir.rahatlaticisesler.favorite;

import java.util.List;

import demo.bbedir.rahatlaticisesler.base.BaseInteractor;
import demo.bbedir.rahatlaticisesler.base.BaseInteractorCallback;
import demo.bbedir.rahatlaticisesler.SoundObject;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public interface FavoriteInteractor extends BaseInteractor {

    interface Callback extends BaseInteractorCallback {

        void favoritesLoadedListener(List<SoundObject> soundObjectList);

        void favoriteRemovedListener(boolean success);
    }

    void getFavoriteList();

    void removeFavorite(int id);
}
