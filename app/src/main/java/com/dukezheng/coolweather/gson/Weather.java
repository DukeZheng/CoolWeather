package com.dukezheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public Basic basic;
    public Update update;
    public String status;
    public Now now;
    @SerializedName("daily_forecast")
    public List<DailyForecast> forecastList;
    public Aqi aqi;
    public Suggestion suggestion;
}
