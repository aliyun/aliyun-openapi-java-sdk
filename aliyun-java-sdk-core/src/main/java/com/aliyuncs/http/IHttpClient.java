package com.aliyuncs.http;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;

import com.aliyuncs.exceptions.ClientException;

public abstract class IHttpClient implements Closeable {

    protected HttpClientConfig clientConfig;

    public IHttpClient(HttpClientConfig clientConfig) throws ClientException {
        if (clientConfig == null) {
            clientConfig = HttpClientConfig.getDefault();
        }
        this.clientConfig = clientConfig;
        init(clientConfig);

    }

    protected abstract void init(HttpClientConfig clientConfig) throws ClientException;

    public abstract HttpResponse syncInvoke(HttpRequest apiRequest) throws IOException, ClientException;

    public abstract Future<HttpResponse> asyncInvoke(final HttpRequest apiRequest, final CallBack callback)
            throws IOException;

    @Deprecated
    public abstract void ignoreSSLCertificate();

    @Deprecated
    public abstract void restoreSSLCertificate();

    public abstract boolean isSingleton();
}
