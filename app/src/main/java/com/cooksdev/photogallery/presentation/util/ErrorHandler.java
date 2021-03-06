package com.cooksdev.photogallery.presentation.util;

import android.content.Context;
import android.content.res.Resources;

import com.cooksdev.photogallery.R;
import com.cooksdev.photogallery.PhotoGalleryApplication;

/**
 * Created by roma on 21.08.16.
 */
public class ErrorHandler {

    public static String handleError() {
        Context context = PhotoGalleryApplication.getInstance();
        Resources resources = context.getResources();
        if (!ConnectionUtils.isNetworkAvailable(context))
            return resources.getString(R.string.error_internet_connection);
        else
            return resources.getString(R.string.error_something_bad_happened);
    }
}
