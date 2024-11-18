package net.exceptions;

public class ServerUnavailableException extends IllegalStateException {
    public ServerUnavailableException(String host, int port) {
        super(String.format("Server %s and port %d is unavailable, repeat later on", host, port));
    }
}
