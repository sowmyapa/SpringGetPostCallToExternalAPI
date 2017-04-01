package com.org.spotify.model;

import java.util.List;

/**
 * Data Transfer Object to send back to the User
 */
public class AlbumDTO {
    private String album;
    private List<String> artist;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public List<String> getArtist() {
        return artist;
    }

    public void setArtist(List<String> artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlbumDTO albumDTO = (AlbumDTO) o;

        if (album != null ? !album.equals(albumDTO.album) : albumDTO.album != null) return false;
        return artist != null ? artist.equals(albumDTO.artist) : albumDTO.artist == null;
    }

    @Override
    public int hashCode() {
        int result = album != null ? album.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        return result;
    }
}
