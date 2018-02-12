package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by zayed on 12-Feb-18.
 */

public class SharedPrefarnceHandler {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Context context;

    private static final String PREFERENCES_NAME="fileName";
    private static final String NAME="name";
    private static final String PASSWORD="password";

    public SharedPrefarnceHandler(Context context) {
        this.context=context;
        sharedPreferences=context.getSharedPreferences(PREFERENCES_NAME,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }

    public void saveInfo(String name,String pass){
        editor.putString(NAME,name);
        editor.putString(PASSWORD,pass);
        editor.commit();
    }

    public String getName()
    {
       return sharedPreferences.getString(NAME,"no name in found");
    }

    public String getPass()
    {
        return sharedPreferences.getString(PASSWORD,"no password found");
    }

    public void clearInfo()
    {
        editor.clear();
        editor.commit();
    }


}
