package com.chesterrapp.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by BawejaTushar on 10/10/2016.
 */

public class ToastUtils {
    public static void showToast(@NonNull Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
