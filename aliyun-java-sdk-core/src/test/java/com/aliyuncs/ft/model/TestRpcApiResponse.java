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
package com.aliyuncs.ft.model;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.TestRpcApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;
import com.google.gson.annotations.SerializedName;

/**
 * @author auto create
 */
public class TestRpcApiResponse extends AcsResponse {

    @SerializedName("RemoteAddr")
    private String remoteAddr;

    @SerializedName("QueryString")
    private String queryString;

    @SerializedName("RequestURL")
    private String requestURL;

    @SerializedName("Params")
    private Params params;

    public String getRemoteAddr() {
        return this.remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getRequestURL() {
        return this.requestURL;
    }

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public Params getParams() {
        return this.params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    @Override
    public TestRpcApiResponse getInstance(UnmarshallerContext context) {
        return TestRpcApiResponseUnmarshaller.unmarshall(this, context);
    }

    public static class Params {

        @SerializedName("QueryParam")
        private String queryParam;

        @SerializedName("BodyParam")
        private String bodyParam;

        public String getQueryParam() {
            return this.queryParam;
        }

        public void setQueryParam(String queryParam) {
            this.queryParam = queryParam;
        }

        public String getBodyParam() {
            return this.bodyParam;
        }

        public void setBodyParam(String bodyParam) {
            this.bodyParam = bodyParam;
        }
    }
}
