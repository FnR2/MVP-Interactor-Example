package demo.bbedir.rahatlaticisesler.library;

import java.util.List;

import demo.bbedir.rahatlaticisesler.base.BaseInteractorImpl;
import demo.bbedir.rahatlaticisesler.CategoryObject;
import demo.bbedir.rahatlaticisesler.CustomResponseCallBack;
import retrofit2.Response;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public class LibraryInteractorImpl extends BaseInteractorImpl<LibraryInteractor.Callback> implements LibraryInteractor {


    private LibraryService mService;

    public LibraryInteractorImpl(LibraryInteractor.Callback callback) {
        super(callback);
        mService = getApiHelper().getService(LibraryService.class);
    }

    @Override
    public void getCategoryList() {

        mService.getCategoryList().enqueue(new CustomResponseCallBack<List<CategoryObject>>() {
            @Override
            public void onSuccess(Response<List<CategoryObject>> response) {
                getCallback().categoryListLoadListener(response.body());
            }

            @Override
            public void onFail() {
                getCallback().onDataNotFound();
            }
        });
    }
}
