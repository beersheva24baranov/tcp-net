package net;

import org.json.JSONObject;
import static net.TCPConfigurationProperties.*;

public record Request(String requestType, String requestData) {
    @Override
    public String toString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(REQUEST_TYPE_FIELD, requestType);
        jsonObject.put(REQUEST_DATA_FIELD, requestData);
        return jsonObject.toString();
    }
}
