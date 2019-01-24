package ntc.dev4u.com.myapplication;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Map<String, String> postParam= new HashMap<String, String>();
        postParam.put("login_id", "chungtv");
        postParam.put("password", "123456");

        volleyJsonObjectRequest(new JSONObject(postParam));
    }


    private void volleyJsonObjectRequest(JSONObject object) {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, "http://157.7.165.192/member/login", object,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d(TAG, "JsonObjectRequest onResponse: " + response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "JsonObjectRequest onErrorResponse: " + error.getMessage());
            }
        });
        VolleySingleton.getInstance(this).getRequestQueue().add(jsonObjectRequest);
    }

}
