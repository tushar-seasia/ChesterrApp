package com.chesterrapp.util;

import android.support.annotation.Nullable;

/**
 * Created by BawejaTushar on 10/10/2016.
 */

public class StringUtils {
    public static  boolean isEmpty(@Nullable CharSequence sequence){
        if(sequence==null || sequence.toString().trim().length()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
