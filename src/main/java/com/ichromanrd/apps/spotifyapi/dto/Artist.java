package com.ichromanrd.apps.spotifyapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {
    private ExternalUrl externalUrls;
    private String href;
    private String id;
    private String name;
    private String type;
    private String uri;
}
