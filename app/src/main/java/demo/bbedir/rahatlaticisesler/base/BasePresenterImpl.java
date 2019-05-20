package demo.bbedir.rahatlaticisesler.base;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public abstract class BasePresenterImpl<View extends BaseView, Interactor extends BaseInteractorImpl> implements BasePresenter, BaseInteractorCallback {

    protected View mView;
    protected Interactor mInteractor;

    protected BasePresenterImpl(View view, Interactor interactor) {
        this.mView = view;
        this.mInteractor = interactor;

    }

    void detach() {
        mView = null;
        mInteractor = null;
    }
}
