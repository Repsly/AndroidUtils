package com.repsly.utils.lib.device;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/**
 * Created by Alen on 26.5.2016..
 */
public class CallUtil {

    private static final String KEY_URI = "tel:";

    public static boolean isCallEnabled(Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_TELEPHONY);
    }

    public static void startCall(Context context, String receiver) {
        context.startActivity(new Intent(Intent.ACTION_CALL).setData(Uri.parse(KEY_URI + receiver)));
    }

}
