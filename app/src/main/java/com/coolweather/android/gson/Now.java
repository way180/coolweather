package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lh3 on 2017/10/30.
 */

public class Now {

    @SerializedName("temp")
    public String temperature;

    @SerializedName("cond")
    public String more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
