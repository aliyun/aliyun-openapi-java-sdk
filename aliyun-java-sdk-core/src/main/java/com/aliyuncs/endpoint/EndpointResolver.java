package com.aliyuncs.endpoint;

import com.aliyuncs.exceptions.ClientException;

public interface EndpointResolver {
    String resolve(ResolveEndpointRequest request) throws ClientException;
}
