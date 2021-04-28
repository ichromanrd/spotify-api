package com.ichromanrd.apps.spotifyapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Song {
    private Album album;
    private List<Artist> artists;
    private Integer discNumber;
    private Long durationMs;
    private Boolean explicit;
    private ExternalId externalIds;
    private ExternalUrl externalUrls;
    private String href;
    private String id;
    private Boolean isLocal;
    private Boolean isPlayable;
    private String name;
    private Integer popularity;
    private String previewUrl;
    private Integer trackNumber;
    private String type;
    private String uri;
}
