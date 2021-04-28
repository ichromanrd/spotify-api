package com.ichromanrd.apps.spotifyapi.response;

import lombok.Data;

@Data
public class CurrentPlayingResponse {
    private String albumImage;
    private String artistId;
    private String songId;
    private String albumId;
    private String yearId;
    private Long length;
    private Long currentPosition;
    private Boolean liked;
    private Boolean shuffled;
}
