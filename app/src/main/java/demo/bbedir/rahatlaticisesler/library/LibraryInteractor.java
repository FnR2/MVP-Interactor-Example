package demo.bbedir.rahatlaticisesler.library;

import java.util.List;

import demo.bbedir.rahatlaticisesler.base.BaseInteractorCallback;
import demo.bbedir.rahatlaticisesler.CategoryObject;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public interface LibraryInteractor {


    interface Callback extends BaseInteractorCallback {

        void categoryListLoadListener(List<CategoryObject> categoryObjectList);
    }

    void getCategoryList();
}
