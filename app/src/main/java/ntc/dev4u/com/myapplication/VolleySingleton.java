package ntc.dev4u.com.myapplication;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * IDE: Android Studio
 * Created by Nguyen Trong Cong  - 2DEV4U.COM
 * Name packge: ntc.dev4u.com.myapplication
 * Name project: VolleyDemo
 * Date: 3/28/2017
 * Time: 13:39
 */

class VolleySingleton {

    private static final String TAG = "VolleySingleton";
    private static VolleySingleton sInstance;
    private RequestQueue mRequestQueue;

    private VolleySingleton(Context context) {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
    }

    public static synchronized VolleySingleton getInstance(Context context) {
        if (sInstance == null)
            sInstance = new VolleySingleton(context);
        return sInstance;
    }

    public RequestQueue getRequestQueue() {
        return mRequestQueue;
    }
}
