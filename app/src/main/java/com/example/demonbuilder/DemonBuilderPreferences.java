package com.example.demonbuilder;

import android.content.Context;
import android.content.SharedPreferences;

public class DemonBuilderPreferences {
    private static final String PREF_NAME = "MyAppPreferences";
    private static final String KEY_LOGGED_IN = "isLoggedIn";

    public static void setLoggedIn(Context context, boolean isLoggedIn) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putBoolean(KEY_LOGGED_IN, isLoggedIn);
        editor.apply();
    }

    public static boolean isLoggedIn(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return preferences.getBoolean(KEY_LOGGED_IN, false);
    }
}
