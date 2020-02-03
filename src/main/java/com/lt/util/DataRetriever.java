package com.lt.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lt.exception.EmptyAlbumException;
import com.lt.model.Photo;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class DataRetriever {
    private static final String ALBUM_BASE_URL = "https://jsonplaceholder.typicode.com/photos?albumId=";

    public static List<Photo> getPhotos(Integer albumId) throws EmptyAlbumException {
        //Hit web service to get json response
        String response = new RestTemplate().getForObject(ALBUM_BASE_URL + albumId, String.class);

        //Convert json response to list of Photo objects
        List<Photo> photos = new Gson().fromJson(response, new TypeToken<ArrayList<Photo>>(){}.getType());

        //Check for empty response
        if (photos == null || photos.size() == 0) {
            throw new EmptyAlbumException("Empty album returned");
        }

        return photos;
    }
}
