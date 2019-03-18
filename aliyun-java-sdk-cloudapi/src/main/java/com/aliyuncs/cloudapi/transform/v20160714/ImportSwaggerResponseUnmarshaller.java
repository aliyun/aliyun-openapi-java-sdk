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
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.ImportSwaggerResponse;
import com.aliyuncs.cloudapi.model.v20160714.ImportSwaggerResponse.ApiImportSwaggerFailed;
import com.aliyuncs.cloudapi.model.v20160714.ImportSwaggerResponse.ApiImportSwaggerSuccess;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author auto create
 * @version
 */
public class ImportSwaggerResponseUnmarshaller {
    public static ImportSwaggerResponse unmarshall(ImportSwaggerResponse importSwaggerResponse,
                                                   UnmarshallerContext context) {

        importSwaggerResponse.setRequestId(context.stringValue("ImportSwaggerResponse.RequestId"));

        List<ApiImportSwaggerSuccess> apiImportSwaggerSuccessList = new ArrayList<ApiImportSwaggerSuccess>();
        for (int i = 0; i < context.lengthValue("ImportSwaggerResponse.Success.Length"); i++) {
            ApiImportSwaggerSuccess apiImportSwaggerSuccess = new ApiImportSwaggerSuccess();
            apiImportSwaggerSuccess.setApiUid(
                context.stringValue("ImportSwaggerResponse.Success[" + i + "].ApiUid"));
            apiImportSwaggerSuccess.setPath(
                context.stringValue("ImportSwaggerResponse.Success[" + i + "].Path"));
            apiImportSwaggerSuccess.setApiOperation(
                context.stringValue("ImportSwaggerResponse.Success[" + i + "].ApiOperation"));
            apiImportSwaggerSuccess.setHttpMethod(
                context.stringValue("ImportSwaggerResponse.Success[" + i + "].HttpMethod"));
            apiImportSwaggerSuccessList.add(apiImportSwaggerSuccess);
        }
        importSwaggerResponse.setSuccess(apiImportSwaggerSuccessList);

        List<ApiImportSwaggerFailed> apiImportSwaggerFaileds = new ArrayList<ApiImportSwaggerFailed>();
        for (int i = 0; i < context.lengthValue("ImportSwaggerResponse.Failed.Length"); i++) {
            ApiImportSwaggerFailed apiImportSwaggerFailed = new ApiImportSwaggerFailed();
            apiImportSwaggerFailed.setErrorMsg(
                context.stringValue("ImportSwaggerResponse.Failed[" + i + "].ErrorMsg"));
            apiImportSwaggerFailed.setPath(
                context.stringValue("ImportSwaggerResponse.Failed[" + i + "].Path"));
            apiImportSwaggerFailed.setHttpMethod(
                context.stringValue("ImportSwaggerResponse.Failed[" + i + "].HttpMethod"));

            apiImportSwaggerFaileds.add(apiImportSwaggerFailed);
        }
        importSwaggerResponse.setFailed(apiImportSwaggerFaileds);

        return importSwaggerResponse;
    }
}
