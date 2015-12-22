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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.http.HttpResponse;

/**
 * Created by guangchun.luo on 15/6/5.
 */
public abstract class BatchComputeResponse extends AcsResponse{
    protected HttpResponse httpResponse;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    String requestId;
    int statusCode;
    public void setRequestId(String requestId){
        this.requestId = requestId;
    }
    public String getRequestId(){
        return requestId;
    }


    public HttpResponse getHttpResponse(){
        return httpResponse;
    }
    public void setHttpResponse(HttpResponse httpResponse){
        this.httpResponse = httpResponse;

        //parse common fields
        parseCommonFields();
    }
    private void parseCommonFields(){
        String requestId = httpResponse.getHeaderValue("Request-Id");
        int status = httpResponse.getStatus();
        this.setRequestId(requestId);
        this.setStatusCode(status);
    }
}
