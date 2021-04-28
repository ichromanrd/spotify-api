package com.ichromanrd.apps.spotifyapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
    private int height;
    private int width;
    private String url;
}
