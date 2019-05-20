package demo.bbedir.rahatlaticisesler.base;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public abstract class BasePresenterImpl<View extends BaseView> implements BasePresenter, BaseInteractorCallback {

    protected View mView;


    protected BasePresenterImpl(View view) {
        this.mView = view;

    }

    void detach() {
        mView = null;

    }
}
