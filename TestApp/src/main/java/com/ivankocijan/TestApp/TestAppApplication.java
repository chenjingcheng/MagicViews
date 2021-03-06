package com.ivankocijan.TestApp;

import com.ivankocijan.magicviews.MagicViews;

import android.app.Application;

/**
 * @author Koc
 *         ivan.kocijan@infinum.hr
 * @since 19.12.14.
 */
public class TestAppApplication extends Application {

    @Override
    public void onCreate () {
        super.onCreate();

        MagicViews.setFontFolderPath(this, "font");
        MagicViews.setDefaultTypeFace(this, "open_sans_semi_bold.ttf");
    }
}
