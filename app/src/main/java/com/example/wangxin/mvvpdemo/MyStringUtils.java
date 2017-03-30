package com.example.wangxin.mvvpdemo;

/**
 * Created by wAngxIn on 2017/3/27.
 */

public class MyStringUtils {
    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }
}
