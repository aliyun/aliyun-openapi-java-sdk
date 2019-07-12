package com.aliyuncs.http;

import java.io.InputStream;
import java.util.Scanner;

import com.aliyuncs.profile.IClientProfile;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TimeoutResolve {

    protected static final String TIMEOUT_CONFIG = "timeout_config.json";
    private static JsonObject timeoutConfigData;

    static {
        ClassLoader classLoader = TimeoutResolve.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(TIMEOUT_CONFIG);
        Scanner scanner = new Scanner(is, "UTF-8");
        scanner.useDelimiter("\0");
        String jsonStr = scanner.hasNext() ? scanner.next() : "";
        scanner.close();
        timeoutConfigData = (new JsonParser()).parse(jsonStr).getAsJsonObject();
    }

    public void resolveTimeout(HttpRequest request, IClientProfile profile, String product, String version,
            String actionName) {
        if (request == null) {
            return;
        }
        long requestConnectTimeout = request.getSysConnectTimeout() != null ? request.getSysConnectTimeout().longValue()
                : 0;
        long clientConnectTimeout = profile.getHttpClientConfig().getConnectionTimeoutMillis();
        long finalConnectTimeout = requestConnectTimeout > 0 ? requestConnectTimeout
                : clientConnectTimeout > 0 ? clientConnectTimeout : HttpClientConfig.DEFAULT_CONNECTION_TIMEOUT;
        request.setSysConnectTimeout((int) finalConnectTimeout);

        long requestReadTimeout = request.getSysReadTimeout() != null ? request.getSysReadTimeout().longValue() : 0;
        long clientReadTimeout = profile.getHttpClientConfig().getReadTimeoutMillis();
        long apiReadTimeout = 0;
        try {
            apiReadTimeout = timeoutConfigData.get(product).getAsJsonObject().get(version).getAsJsonObject().get(
                    actionName).getAsLong() * 1000;
        } catch (Exception e) {
            // do noting
        }
        long finalReadTimeout = requestReadTimeout > 0 ? requestReadTimeout
                : clientReadTimeout > 0 ? clientReadTimeout
                        : apiReadTimeout > 0 ? apiReadTimeout : HttpClientConfig.DEFAULT_READ_TIMEOUT;
        request.setSysReadTimeout((int) finalReadTimeout);
    }

}
