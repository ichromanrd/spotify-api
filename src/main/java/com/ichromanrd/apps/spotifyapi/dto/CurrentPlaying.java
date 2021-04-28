package com.ichromanrd.apps.spotifyapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentPlaying {
    private Long timestamp;
    private Long progressMs;
    private Song item;
    private String currentlyPlayingType;
    private Boolean isPlaying;
}
