package demo.bbedir.rahatlaticisesler.base;

import demo.bbedir.rahatlaticisesler.ApiHelper;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public abstract class BaseInteractorImpl<BaseInteractorCallback> implements BaseInteractor {

    private BaseInteractorCallback mCallback;
    private ApiHelper mApiHelper;



    protected BaseInteractorImpl(BaseInteractorCallback callback) {
        this.mCallback = callback;
        this.mApiHelper = new ApiHelper();
    }


    public BaseInteractorCallback getCallback() {
        return this.mCallback;
    }

    public ApiHelper getApiHelper() {
        return mApiHelper;
    }


}
