package com.example.wangxin.mvvpdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by wAngxIn on 2017/3/27.
 * 当数据发生变化时还是需要手动发出通知。
 * 通过调用 notifyPropertyChanged(BR.firstName)
 * 可以通知系统 BR.firstName 这个 entry 的数据已经发生变化，需要更新 UI
 */

public class PlainUser extends BaseObservable {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
