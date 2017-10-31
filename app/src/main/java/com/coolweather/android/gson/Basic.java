package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author lh3
 * @date 2017/10/30
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
