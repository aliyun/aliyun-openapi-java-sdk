package com.aliyuncs.v5.endpoint;

import com.aliyuncs.v5.exceptions.ClientException;

public interface EndpointResolver {
    String resolve(ResolveEndpointRequest request) throws ClientException;
}
