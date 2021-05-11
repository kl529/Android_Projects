package com.example.findyourmind;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

/**

 * 데이터 저장 및 로드 클래스

 */

public class loginManager {

    public static final String PREFERENCES_NAME = "rebuild_preference";

    private static final String DEFAULT_VALUE_STRING = "";


    private static SharedPreferences getPreferences(Context context) {

        return context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);

    }



    /**

     * String 값 저장

     * @param context

     * @param key1

     * @param value

     */

    public static void setString(Context context, String key1, String value) {

        SharedPreferences prefs = getPreferences(context);

        SharedPreferences.Editor editor = prefs.edit();

        editor.putString(key1, value);

        editor.commit();

    }

    /**

     * String 값 로드

     * @param context

     * @param key1
     * @return

     */

    public static String getString(Context context, String key1) {

        SharedPreferences prefs = getPreferences(context);
        String value = prefs.getString(key1, DEFAULT_VALUE_STRING);

        return value;
    }

    /**

     * 키 값 삭제

     * @param context

     * @param key1
     *
     */

    public static void removeKey(Context context, String key1) {

        SharedPreferences prefs = getPreferences(context);

        SharedPreferences.Editor edit = prefs.edit();

        edit.remove(key1);

        edit.commit();

    }


    /**

     * 모든 저장 데이터 삭제

     * @param context

     */

    public static void clear(Context context) {

        SharedPreferences prefs = getPreferences(context);

        SharedPreferences.Editor edit = prefs.edit();

        edit.clear();

        edit.commit();

    }

}
