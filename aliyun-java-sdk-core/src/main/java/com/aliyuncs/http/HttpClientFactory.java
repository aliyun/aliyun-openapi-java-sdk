package com.aliyuncs.http;

import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.utils.StringUtils;

import java.lang.reflect.Constructor;

public class HttpClientFactory {

    public static String HTTP_CLIENT_IMPL_KEY = "aliyuncs.sdk.httpclient";
    public static String COMPATIBLE_HTTP_CLIENT_CLASS_NAME = CompatibleUrlConnClient.class.getName();

    public static IHttpClient buildClient(IClientProfile profile) {
        try {
            HttpClientConfig clientConfig = profile.getHttpClientConfig();
            if (clientConfig == null) {
                clientConfig = HttpClientConfig.getDefault();
                profile.setHttpClientConfig(clientConfig);
            }

            String customClientClassName = null;
            if (clientConfig.isCompatibleMode()) {
                customClientClassName = COMPATIBLE_HTTP_CLIENT_CLASS_NAME;
            } else if (clientConfig.getClientType() == HttpClientType.Custom && !StringUtils.isEmpty(clientConfig.getCustomClientClassName())) {
                customClientClassName = clientConfig.getCustomClientClassName();
            } else {
                customClientClassName = System.getProperty(HTTP_CLIENT_IMPL_KEY);
            }
            if (StringUtils.isEmpty(customClientClassName)) {
                customClientClassName = clientConfig.getClientType().getImplClass().getName();
            }

            Class httpClientClass = Class.forName(customClientClassName);
            if (!IHttpClient.class.isAssignableFrom(httpClientClass)) {
                throw new IllegalStateException(String.format("%s is not assignable from com.aliyuncs.http.IHttpClient", customClientClassName));
            }
            Constructor<? extends IHttpClient> constructor = httpClientClass.getConstructor(HttpClientConfig.class);
            return constructor.newInstance(clientConfig);
        } catch (Exception e) {
            // keep compatibility
            throw new IllegalStateException("HttpClientFactory buildClient failed", e);
        }
    }

}
