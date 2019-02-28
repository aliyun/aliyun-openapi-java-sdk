package com.aliyuncs.http;

import com.aliyuncs.exceptions.ClientException;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;

public abstract class IHttpClient implements Closeable {

    protected boolean ignoreHttpsCert = false;

    public IHttpClient(HttpClientConfig clientConfig) throws ClientException {
        if (clientConfig == null) {
            clientConfig = HttpClientConfig.getDefault();
        }
        init(clientConfig);
    }

    protected abstract void init(HttpClientConfig clientConfig) throws ClientException;

    public abstract HttpResponse syncInvoke(HttpRequest apiRequest) throws IOException;

    public abstract Future<HttpResponse> asyncInvoke(final HttpRequest apiRequest, final CallBack callback) throws IOException;

    public abstract void ignoreSSLCertificate();

    public abstract void restoreSSLCertificate();

    public abstract boolean isSingleton();

}
