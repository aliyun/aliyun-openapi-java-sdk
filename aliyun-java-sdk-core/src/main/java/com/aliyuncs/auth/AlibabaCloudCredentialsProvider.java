package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;

public interface AlibabaCloudCredentialsProvider {

    public AlibabaCloudCredentials getCredentials() throws ClientException, ServerException;
}
