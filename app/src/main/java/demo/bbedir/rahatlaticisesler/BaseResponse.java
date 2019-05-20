package demo.bbedir.rahatlaticisesler;

import java.io.Serializable;

/**
 * CREATED BY bbedir on 2019-05-17.
 */
public class BaseResponse<T> implements Serializable {

    private T mResponseBody;

    public T getResponseBody() {
        return mResponseBody;
    }

    public void setResponseBody(T responseBody) {
        this.mResponseBody = responseBody;
    }
}
