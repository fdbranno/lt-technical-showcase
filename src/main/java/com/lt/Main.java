package com.lt;

import com.lt.model.Photo;
import com.lt.util.DataRetriever;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Incorrect number of arguments");
            System.out.println("For usage help use arg --usage");
            System.exit(1);
        } else {
            if (args[0].equals("--usage")) {
                usage();
                System.exit(0);
            } else {
                try {
                    //Grab albumId from command line
                    Integer albumId = Integer.parseInt(args[0]);

                    //Retrieve list of photos
                    List<Photo> photos = DataRetriever.getPhotos(albumId);

                    if (photos.size() == 0) {
                        System.out.println("Album does not exist or is empty");
                    } else {
                        for (Photo photo : photos) {
                            System.out.println(photo.toString());
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Argument '" + args[0] + "' must be an integer");
                    usage();
                    System.exit(1);
                }
            }
        }
    }

    private static void usage() {
        System.out.println("usage: java -jar photo-album-1.0-SNAPSHOT [Integer value of album to inspect]");
    }
}
