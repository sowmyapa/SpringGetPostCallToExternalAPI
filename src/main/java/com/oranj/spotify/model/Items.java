package com.oranj.spotify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sowmyaparameshwara on 3/28/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {

    @JsonProperty("Song")
    private Song song;
    private PlayList playlistId;
    @JsonProperty("Album")
    private AlbumModel album;
    @JsonProperty("Artist")
    private ArtistModel artist;
    @JsonProperty("URL")
    private URLModel url;

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public PlayList getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(PlayList playlistId) {
        this.playlistId = playlistId;
    }

    public AlbumModel getAlbum() {
        return album;
    }

    public void setAlbum(AlbumModel album) {
        this.album = album;
    }

    public ArtistModel getArtist() {
        return artist;
    }

    public void setArtist(ArtistModel artist) {
        this.artist = artist;
    }

    public URLModel getUrl() {
        return url;
    }

    public void setUrl(URLModel url) {
        this.url = url;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class AlbumModel{
        @JsonProperty("S")
        private String s;

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class ArtistModel{
        @JsonProperty("S")
        private String s;

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class URLModel{
        @JsonProperty("S")
        private String s;

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }
    }

}
