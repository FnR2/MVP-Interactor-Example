package demo.bbedir.rahatlaticisesler;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * CREATED BY bbedir on 2019-05-14.
 */
public abstract class CustomResponseCallBack<T> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {

        try {
            if (null != response.body() && response.body().getClass().equals(BaseResponse.class)) {


                onSuccess(response);

            } else {

                onFail();
            }
        } catch (Exception e) {
            onFail();
        }

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {

    }

    public abstract void onSuccess(Response<T> response);

    public abstract void onFail();
}
