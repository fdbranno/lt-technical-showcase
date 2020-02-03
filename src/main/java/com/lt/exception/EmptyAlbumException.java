package com.lt.exception;

public class EmptyAlbumException extends Exception {
    public EmptyAlbumException() {
        super("Empty Album");
    }

    public EmptyAlbumException(String message) {
        super(message);
    }
}
