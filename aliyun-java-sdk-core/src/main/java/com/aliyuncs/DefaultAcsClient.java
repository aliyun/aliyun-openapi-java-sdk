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
package com.aliyuncs;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.auth.LegacyCredentials;
import com.aliyuncs.auth.StaticCredentialsProvider;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.reader.Reader;
import com.aliyuncs.reader.ReaderFactory;
import com.aliyuncs.regions.Endpoint;
import com.aliyuncs.regions.ProductDomain;
import com.aliyuncs.transform.UnmarshallerContext;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class DefaultAcsClient implements IAcsClient {
    private int maxRetryNumber = 3;
    private boolean autoRetry = true;
    private IClientProfile clientProfile = null;
    private boolean urlTestFlag = false;
    private AlibabaCloudCredentialsProvider credentialsProvider;

    public DefaultAcsClient() {
        this.clientProfile = DefaultProfile.getProfile();
    }

    public DefaultAcsClient(IClientProfile profile) {
        this.clientProfile = profile;
        this.credentialsProvider = new StaticCredentialsProvider(profile);
        this.clientProfile.setCredentialsProvider(this.credentialsProvider);
    }

    public DefaultAcsClient(IClientProfile profile, AlibabaCloudCredentials credentials) {
        this.clientProfile = profile;
        this.credentialsProvider = new StaticCredentialsProvider(credentials);
        this.clientProfile.setCredentialsProvider(this.credentialsProvider);
    }

    public DefaultAcsClient(IClientProfile profile, AlibabaCloudCredentialsProvider credentialsProvider) {
        this.clientProfile = profile;
        this.credentialsProvider = credentialsProvider;
        this.clientProfile.setCredentialsProvider(this.credentialsProvider);
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request)
        throws ClientException, ServerException {
        return this.doAction(request, autoRetry, maxRetryNumber, this.clientProfile);
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request,
                                                         boolean autoRetry, int maxRetryCounts)
        throws ClientException, ServerException {
        return this.doAction(request, autoRetry, maxRetryCounts, this.clientProfile);
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, IClientProfile profile)
        throws ClientException, ServerException {
        return this.doAction(request, this.autoRetry, this.maxRetryNumber, profile);
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, String regionId, Credential credential)
        throws ClientException, ServerException {
        boolean retry = this.autoRetry;
        int retryNumber = this.maxRetryNumber;
        ISigner signer = null;
        FormatType format = null;
        List<Endpoint> endpoints = null;
        if (null == request.getRegionId()) {
            request.setRegionId(regionId);
        }
        if (null != this.clientProfile) {
            signer = clientProfile.getSigner();
            format = clientProfile.getFormat();
            try {
                endpoints = clientProfile.getEndpoints(request.getProduct(), request.getRegionId(),
                    request.getLocationProduct(),
                    request.getEndpointType());
            } catch (Throwable e) {
                endpoints = clientProfile.getEndpoints(request.getRegionId(), request.getProduct());
            }
        }

        return this.doAction(request, retry, retryNumber, request.getRegionId(), credential, signer, format, endpoints);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request)
        throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request);
        return parseAcsResponse(request.getResponseClass(), baseResponse);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request,
                                                    boolean autoRetry, int maxRetryCounts)
        throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request, autoRetry, maxRetryCounts);
        return parseAcsResponse(request.getResponseClass(), baseResponse);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, IClientProfile profile)
        throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request, profile);
        return parseAcsResponse(request.getResponseClass(), baseResponse);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, String regionId, Credential credential)
        throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request, regionId, credential);
        return parseAcsResponse(request.getResponseClass(), baseResponse);
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, boolean autoRetry,
                                                         int maxRetryCounts, IClientProfile profile)
        throws ClientException, ServerException {
        if (null == profile) {
            throw new ClientException("SDK.InvalidProfile", "No active profile found.");
        }
        boolean retry = autoRetry;
        int retryNumber = maxRetryCounts;
        String region = profile.getRegionId();
        if (null == request.getRegionId()) {
            request.setRegionId(region);
        }

        AlibabaCloudCredentials credentials = this.credentialsProvider.getCredentials();
        ISigner signer = profile.getSigner();
        FormatType format = profile.getFormat();
        List<Endpoint> endpoints;
        try {
            endpoints = clientProfile.getEndpoints(request.getProduct(), request.getRegionId(),
                request.getLocationProduct(),
                request.getEndpointType());
        } catch (Throwable e) {
            endpoints = clientProfile.getEndpoints(request.getRegionId(), request.getProduct());
        }
        return this.doAction(request, retry, retryNumber, request.getRegionId(), credentials, signer, format, endpoints);
    }

    private <T extends AcsResponse> T parseAcsResponse(Class<T> clasz, HttpResponse baseResponse)
        throws ServerException, ClientException {

        FormatType format = baseResponse.getHttpContentType();

        if (baseResponse.isSuccess()) {
            return readResponse(clasz, baseResponse, format);
        } else {
            AcsError error = readError(baseResponse, format);
            if (500 <= baseResponse.getStatus()) {
                throw new ServerException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId());
            } else {
                throw new ClientException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId());
            }
        }
    }

    @Deprecated
    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request,
                                                         boolean autoRetry, int maxRetryNumber,
                                                         String regionId, Credential credential,
                                                         ISigner signer, FormatType format,
                                                         List<Endpoint> endpoints)
        throws ClientException, ServerException {
        return doAction(
            request, autoRetry, maxRetryNumber, regionId, new LegacyCredentials(credential),
            signer, format, endpoints
        );
    }

    private  <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request,
                                                         boolean autoRetry, int maxRetryNumber,
                                                         String regionId,
                                                         AlibabaCloudCredentials credentials,
                                                         ISigner signer, FormatType format,
                                                         List<Endpoint> endpoints)
        throws ClientException, ServerException {

        try {
            FormatType requestFormatType = request.getAcceptFormat();
            if (null != requestFormatType) {
                format = requestFormatType;
            }
            ProductDomain domain = Endpoint.findProductDomain(regionId, request.getProduct(), endpoints);
            if (null == domain) {
                throw new ClientException("SDK.InvalidRegionId", "Can not find endpoint to access.");
            }

            boolean shouldRetry = true;
            for (int retryTimes = 0; shouldRetry; retryTimes ++) {

                shouldRetry = autoRetry && retryTimes < maxRetryNumber;

                HttpRequest httpRequest = request.signRequest(signer, credentials, format, domain);

                HttpResponse response;
                response = HttpResponse.getResponse(httpRequest);
                if (response.getHttpContent() == null) {
                    if (shouldRetry) {
                        continue;
                    } else {
                        throw new ClientException("SDK.ConnectionReset", "Connection reset.");
                    }
                }

                if (500 <= response.getStatus() && shouldRetry) {
                    continue;
                }

                return response;
            }

        } catch (InvalidKeyException exp) {
            throw new ClientException("SDK.InvalidAccessSecret", "Speicified access secret is not valid.");
        } catch (SocketTimeoutException exp) {
            throw new ClientException("SDK.ServerUnreachable",
                "SocketTimeoutException has occurred on a socket read or accept.");
        } catch (IOException exp) {
            throw new ClientException("SDK.ServerUnreachable", "Server unreachable: " + exp.toString());
        } catch (NoSuchAlgorithmException exp) {
            throw new ClientException("SDK.InvalidMD5Algorithm", "MD5 hash is not supported by client side.");
        }

        return null;
    }

    private <T extends AcsResponse> T readResponse(Class<T> clasz, HttpResponse httpResponse, FormatType format)
        throws ClientException {
        Reader reader = ReaderFactory.createInstance(format);
        UnmarshallerContext context = new UnmarshallerContext();
        T response = null;
        String stringContent = getResponseContent(httpResponse);
        try {
            response = clasz.newInstance();
        } catch (Exception e) {
            throw new ClientException("SDK.InvalidResponseClass", "Unable to allocate " + clasz.getName() + " class");
        }
        
        String responseEndpoint = clasz.getName().substring(clasz.getName().lastIndexOf(".") + 1);
        if (response.checkShowJsonItemName()) {
            context.setResponseMap(reader.read(stringContent, responseEndpoint));
        } else {
            context.setResponseMap(reader.readForHideArrayItem(stringContent, responseEndpoint)); 
        }
        
        context.setHttpResponse(httpResponse);
        response.getInstance(context);
        return response;
    }

    private String getResponseContent(HttpResponse httpResponse) throws ClientException {
        String stringContent = null;
        try {
            if (null == httpResponse.getEncoding()) {
                stringContent = new String(httpResponse.getHttpContent());
            } else {
                stringContent = new String(httpResponse.getHttpContent(), httpResponse.getEncoding());
            }
        } catch (UnsupportedEncodingException exp) {
            throw new ClientException("SDK.UnsupportedEncoding",
                "Can not parse response due to un supported encoding.");
        }
        return stringContent;
    }

    private AcsError readError(HttpResponse httpResponse, FormatType format) throws ClientException {
        AcsError error = new AcsError();
        String responseEndpoint = "Error";
        Reader reader = ReaderFactory.createInstance(format);
        UnmarshallerContext context = new UnmarshallerContext();
        String stringContent = getResponseContent(httpResponse);
        context.setResponseMap(reader.read(stringContent, responseEndpoint));
        return error.getInstance(context);
    }

    public boolean isAutoRetry() {
        return autoRetry;
    }

    public void setAutoRetry(boolean autoRetry) {
        this.autoRetry = autoRetry;
    }

    public int getMaxRetryNumber() {
        return maxRetryNumber;
    }

    public void setMaxRetryNumber(int maxRetryNumber) {
        this.maxRetryNumber = maxRetryNumber;
    }

    public void setUrlTestFlag(boolean flag) {
        this.urlTestFlag = flag;
    }
}
