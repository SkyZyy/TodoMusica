package com.example.todomusica.Class;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class CheckFollowRequest extends StringRequest {
    private static  final String route = "https://todomusicatest.000webhostapp.com/CheckFollow.php";
    private Map<String, String> params;

    public CheckFollowRequest(Integer userId, Integer artistId, Response.Listener<String> listener) {
        super(Method.POST, route, listener, null);

        params = new HashMap<>();
        params.put("userId", userId+"");
        params.put("artistId", artistId+"");
    }

    @Override
    public Map<String, String> getParams() { return params; }
}
