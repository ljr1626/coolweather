package com.example.coolweather.util;

/**
 * Created by LJR_PC on 2016/8/27.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
