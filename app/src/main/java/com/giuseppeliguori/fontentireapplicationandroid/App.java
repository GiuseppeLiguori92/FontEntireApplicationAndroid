package com.giuseppeliguori.fontentireapplicationandroid;

import android.app.Application;

/**
 * Created by GiuseppeLiguori on 12/10/16.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/CustomFont.ttf");
    }
}
