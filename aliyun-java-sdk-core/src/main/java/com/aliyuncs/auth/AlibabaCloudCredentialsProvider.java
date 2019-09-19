package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;

public interface AlibabaCloudCredentialsProvider {

     AlibabaCloudCredentials getCredentials() throws ClientException, ServerException;
}
