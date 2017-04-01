package com.org.spotify.controller;

import com.org.spotify.model.ApiResponse;
import com.org.spotify.service.PlaylistService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by sowmyaparameshwara on 3/28/17.
 */
@RestController
public class SpotifyController {
    Logger log = Logger.getLogger(SpotifyController.class);
    private PlaylistService playlistService;

    @Autowired
    public SpotifyController(PlaylistService playlistService){
        this.playlistService = playlistService;
    }


    @PostMapping(path="playlist")
    public @ResponseBody ApiResponse getTrackData(@RequestParam("trackId")String trackId){
        return playlistService.getTrackData(trackId);

    }

}
