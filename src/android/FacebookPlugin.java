package com.fb;

import org.apache.cordova.*;
import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class FacebookPlugin extends CordovaPlugin {
    private static final String LOG_TAG = "FacebookPlugin";

    @Override
    public boolean execute(String action, JSONArray data, final CallbackContext callbackContext) throws JSONException {
        if (action.equals("sendActivateAppEvent")) {
            Activity activity = getActivity();
            FacebookSdk.sdkInitialize(activity.getApplicationContext());
            AppEventsLogger.activateApp(activity);
            return true;
        } else {
            return false;
        }
    }

    private Activity getActivity() {
        return cordova.getActivity();
    }
}
