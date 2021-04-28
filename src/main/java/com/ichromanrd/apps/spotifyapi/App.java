package com.ichromanrd.apps.spotifyapi;

import com.ichromanrd.apps.spotifyapi.api.SpotifyApi;
import com.ichromanrd.apps.spotifyapi.dto.CurrentPlaying;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class App {
    public static void main( String[] args ) {
        final String spotifyApiEndpoint = "https://api.spotify.com/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(spotifyApiEndpoint)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        SpotifyApi spotifyApi = retrofit.create(SpotifyApi.class);
        spotifyApi.getCurrentPlaying().enqueue(new Callback<CurrentPlaying>() {
            public void onResponse(Call<CurrentPlaying> call, Response<CurrentPlaying> response) {
                CurrentPlaying currentPlaying = response.body();
            }

            public void onFailure(Call<CurrentPlaying> call, Throwable throwable) {

            }
        });
    }
}
