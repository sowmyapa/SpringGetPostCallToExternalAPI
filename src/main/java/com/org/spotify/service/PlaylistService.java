package com.org.spotify.service;

import com.org.spotify.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaylistService {
    private RestTemplate restTemplate;

    private static int ID=1;

    @Autowired
    public PlaylistService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public AlbumDTO grabAlbumInformation(String spotifyId) {

        Album spotfiyResponse = restTemplate.getForObject("https://api.spotify.com/v1/albums/"+spotifyId, Album.class);
        AlbumDTO returnResponse = new AlbumDTO();
        List<Artist> artists = spotfiyResponse.getArtists();
        List<String> artistList = new ArrayList<>();
        artists.stream()
                .forEach(artist -> {
                    artistList.add(artist.getName());
                });
        returnResponse.setArtist(artistList);
        returnResponse.setAlbum(spotfiyResponse.getName());

       /* MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        headers.add("Content-Type", "application/json");

        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        HttpEntity<User> request = new HttpEntity<User>(user, headers);

        User user1 = restTemplate.postForObject("http://localhost:8080/user", request, User.class);
        return user1;*/

        return returnResponse;
    }

    public ApiResponse getTrackData(String trackId) {
        String spotifyUrl="https://api.spotify.com/v1/tracks/"+trackId;
        SpotifyResponse spotifyResponse = restTemplate.getForObject(spotifyUrl, SpotifyResponse.class);

        PostModel postModel = new PostModel();
        postModel.setAlbum(spotifyResponse.getAlbum().getName());
        postModel.setArtist(spotifyResponse.getArtists().get(0).getName());
        postModel.setPlaylistId(ID++);
        postModel.setSong(spotifyResponse.getName());
        postModel.setUrl(spotifyResponse.getHref());

        String response = restTemplate.postForObject("https://kkuwbyropc.execute-api.us-east-1.amazonaws.com/internexam",postModel,String.class);
        ApiResponse apiResponse = restTemplate.getForObject("https://kkuwbyropc.execute-api.us-east-1.amazonaws.com/internexam",ApiResponse.class);
        return apiResponse;
    }

}
