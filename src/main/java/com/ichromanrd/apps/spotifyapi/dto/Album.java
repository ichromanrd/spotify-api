package com.ichromanrd.apps.spotifyapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {
    private String albumType;
    private List<Artist> artists;
    private ExternalUrl externalUrls;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private String releaseDate;
    private String releaseDatePrecision;
    private int totalTracks;
    private String type;
    private String uri;
}
