/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.auth;

/**
 * Created by haowei.yao on 2017/9/12.
 */

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;

/**
 * This implementation of AlibabaCloudCredentialsProvider accesses Alibaba Cloud STS service to assume a Role and get
 * back a temporary session for authentication.
 */
public class InstanceProfileCredentialsProvider implements AlibabaCloudCredentialsProvider {

    /**
     * Default duration for started sessions.
     */
    private InstanceProfileCredentials credentials = null;
    public int ecsMetadataServiceFetchCount = 0;
    private ECSMetadataServiceCredentialsFetcher fetcher;
    private static final int MAX_ECS_METADATA_FETCH_RETRY_TIMES = 3;
    private int maxRetryTimes = MAX_ECS_METADATA_FETCH_RETRY_TIMES;
    private final String roleName;

    public InstanceProfileCredentialsProvider(String roleName) {
        if (null == roleName) {
            throw new NullPointerException("You must specifiy a valid role name.");
        }
        this.roleName = roleName;
        this.fetcher = new ECSMetadataServiceCredentialsFetcher();
        this.fetcher.setRoleName(this.roleName);
    }

    public InstanceProfileCredentialsProvider withFetcher(ECSMetadataServiceCredentialsFetcher fetcher) {
        this.fetcher = fetcher;
        this.fetcher.setRoleName(roleName);
        return this;
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        if (credentials == null) {
            ecsMetadataServiceFetchCount += 1;
            credentials = fetcher.fetch(maxRetryTimes);
        } else if (credentials.isExpired()) {
            throw new ClientException("SDK.SessionTokenExpired", "Current session token has expired.");
        } else if (credentials.willSoonExpire() && credentials.shouldRefresh()) {
            try {
                ecsMetadataServiceFetchCount += 1;
                credentials = fetcher.fetch();
            } catch (ClientException e) {
                // Use the current expiring session token and wait for next round
                credentials.setLastFailedRefreshTime();
            }
        }
        return credentials;
    }
}