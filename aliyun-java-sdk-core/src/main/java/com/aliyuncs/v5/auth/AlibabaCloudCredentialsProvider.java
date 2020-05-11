package com.aliyuncs.v5.auth;

import com.aliyuncs.v5.exceptions.ClientException;
import com.aliyuncs.v5.exceptions.ServerException;

public interface AlibabaCloudCredentialsProvider {

     AlibabaCloudCredentials getCredentials() throws ClientException, ServerException;
}
