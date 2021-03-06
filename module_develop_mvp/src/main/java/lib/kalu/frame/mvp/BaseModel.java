package lib.kalu.frame.mvp;

import android.util.Log;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * @author zhanghang
 * @description: mvp => m
 * @date :2022-01-17
 */
@Keep
public abstract class BaseModel {

    @Keep
    public BaseModel() {
        init();
    }

    private final void init() {
        Log.d("BaseModel", "init =>");
    }

    /***********************/

    private final CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    protected final CompositeDisposable getDisposables() {
        return mCompositeDisposable;
    }

    protected final void addDisposable(@NonNull Disposable disposable) {
        if (null == disposable)
            return;
        mCompositeDisposable.add(disposable);
    }
}