package com.ichromanrd.apps.spotifyapi.api;

import com.ichromanrd.apps.spotifyapi.dto.CurrentPlaying;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SpotifyApi {
    @GET("v1/me/player/currently-playing")
    Call<CurrentPlaying> getCurrentPlaying();
}
