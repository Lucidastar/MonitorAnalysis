package com.lucida.monitoranalysis.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.orhanobut.logger.AndroidLogAdapter;

/**
 * @author hyli
 * description：
 * @date 2020/5/12 16:32
 */
public class MineLogAdapter extends AndroidLogAdapter {
    @Override
    public void log(int priority, @Nullable String tag, @NonNull String message) {
        super.log(priority, "mine", message);
    }
}
