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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.ImportSwaggerResponseUnmarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version
 */
public class ImportSwaggerResponse extends AcsResponse {

    private String requestId;

    private List<ApiImportSwaggerSuccess> Success;

    private List<ApiImportSwaggerFailed> Failed;

    public static class ApiImportSwaggerSuccess {
        private String path;
        private String httpMethod;
        private String apiUid;
        private String apiOperation;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getHttpMethod() {
            return httpMethod;
        }

        public void setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
        }

        public String getApiUid() {
            return apiUid;
        }

        public void setApiUid(String apiUid) {
            this.apiUid = apiUid;
        }

        public String getApiOperation() {
            return apiOperation;
        }

        public void setApiOperation(String apiOperation) {
            this.apiOperation = apiOperation;
        }
    }

    public static class ApiImportSwaggerFailed {
        private String path;
        private String httpMethod;
        private String errorMsg;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getHttpMethod() {
            return httpMethod;
        }

        public void setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ApiImportSwaggerSuccess> getSuccess() {
        return Success;
    }

    public void setSuccess(
        List<ApiImportSwaggerSuccess> success) {
        Success = success;
    }

    public List<ApiImportSwaggerFailed> getFailed() {
        return Failed;
    }

    public void setFailed(
        List<ApiImportSwaggerFailed> failed) {
        Failed = failed;
    }

    @Override
    public AcsResponse getInstance(UnmarshallerContext context) throws ClientException, ServerException {
        return ImportSwaggerResponseUnmarshaller.unmarshall(this, context);
    }
}
