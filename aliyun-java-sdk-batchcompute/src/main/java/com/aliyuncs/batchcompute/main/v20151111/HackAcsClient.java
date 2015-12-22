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
package com.aliyuncs.batchcompute.main.v20151111;

import com.aliyuncs.AcsError;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.reader.Reader;
import com.aliyuncs.reader.ReaderFactory;
import com.aliyuncs.transform.UnmarshallerContext;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/5/7.
 */
public class HackAcsClient {

    protected static <T extends AcsResponse> T parseAcsResponse(Class<T> clasz, HttpResponse baseResponse) throws ServerException, ClientException {
        FormatType format = baseResponse.getContentType();
        if (baseResponse.isSuccess()) {
            return readResponse(clasz, baseResponse, format);
        } else {
            AcsError error = readError(baseResponse, format);
            if (500 <= baseResponse.getStatus()) {
                throw new ServerException(error.getErrorCode(), error.getErrorMessage(),error.getRequestId());
            } else {
                throw new ClientException(error.getErrorCode(), error.getErrorMessage(),error.getRequestId());
            }
        }
    }

    private static <T extends AcsResponse> T readResponse(Class<T> clasz, HttpResponse httpResponse, FormatType format) throws ClientException {
        Reader reader = ReaderFactory.createInstance(format);
        UnmarshallerContext context = new UnmarshallerContext();
        AcsResponse response = null;
        String stringContent = getResponseContent(httpResponse);

        try {
            response = (AcsResponse) clasz.newInstance();
        } catch (Exception var9) {
            throw new ClientException("SDK.InvalidResponseClass", "Unable to allocate " + clasz.getName() + " class",
                    httpResponse.getHeaderValue("Request-Id"));
        }

        String responseEndpoint = clasz.getName().substring(clasz.getName().lastIndexOf(".") + 1);
        context.setResponseMap(reader.read(stringContent, responseEndpoint));
        context.setHttpResponse(httpResponse);
        response.getInstance(context);
        return (T) response;
    }

    private static AcsError readError(HttpResponse httpResponse, FormatType format) throws ClientException {
        AcsError error = new AcsError();
        String responseEndpoint = "Error";
        Reader reader = ReaderFactory.createInstance(format);
        UnmarshallerContext context = new UnmarshallerContext();
        String stringContent = getResponseContent(httpResponse);
        context.setResponseMap(reader.read(stringContent, responseEndpoint));

        return unmarshall(error, context);
    }

    private static String getResponseContent(HttpResponse httpResponse) throws ClientException {
        String stringContent = null;

        try {
            stringContent = new String(httpResponse.getContent(), httpResponse.getEncoding());
            return stringContent;
        } catch (UnsupportedEncodingException var4) {
            throw new ClientException("SDK.UnsupportedEncoding", "Can not parse response due to un supported encoding.",
                    httpResponse.getHeaderValue("Request-Id"));
        }
    }


    //兼容
    private static AcsError unmarshall(AcsError error, UnmarshallerContext context) {
        Map map = context.getResponseMap();
        error.setStatusCode(context.getHttpStatus());
        error.setRequestId((String) map.get("Error.RequestId"));


        String code = (String) map.get("Error.Code");
        code = code != null ? code : (String) map.get("Error.ErrorCode");

        error.setErrorCode(code);
        error.setErrorMessage((String) map.get("Error.Message"));
        return error;
    }

}
