package net;

public interface NetworkClient {
    public String sendAndReceive(String requestType, String requestData);
}
