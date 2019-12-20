package com.aliyuncs.utils;

import com.aliyuncs.AcsRequest;
import io.opentracing.propagation.TextMap;

import java.util.Iterator;
import java.util.Map;

public class HttpHeadersInjectAdapter implements TextMap {

    private AcsRequest request ;

    public HttpHeadersInjectAdapter(AcsRequest request) {
        this.request = request;
    }

    @Override
    public void put(String key, String value) {
        request.putHeaderParameter(key, value);
    }

    @Override
    public Iterator<Map.Entry<String, String>> iterator() {
        throw new UnsupportedOperationException("This class should be used only with tracer#inject()");
    }
}
