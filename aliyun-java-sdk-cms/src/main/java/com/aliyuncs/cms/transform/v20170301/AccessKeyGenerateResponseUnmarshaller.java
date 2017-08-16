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
package com.aliyuncs.cms.transform.v20170301;

import com.aliyuncs.cms.model.v20170301.AccessKeyGenerateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AccessKeyGenerateResponseUnmarshaller {

	public static AccessKeyGenerateResponse unmarshall(AccessKeyGenerateResponse accessKeyGenerateResponse, UnmarshallerContext context) {
		
		accessKeyGenerateResponse.setRequestId(context.stringValue("AccessKeyGenerateResponse.RequestId"));
		accessKeyGenerateResponse.setErrorCode(context.integerValue("AccessKeyGenerateResponse.ErrorCode"));
		accessKeyGenerateResponse.setErrorMessage(context.stringValue("AccessKeyGenerateResponse.ErrorMessage"));
		accessKeyGenerateResponse.setSuccess(context.booleanValue("AccessKeyGenerateResponse.Success"));
		accessKeyGenerateResponse.setUserId(context.longValue("AccessKeyGenerateResponse.UserId"));
		accessKeyGenerateResponse.setAccessKey(context.stringValue("AccessKeyGenerateResponse.AccessKey"));
		accessKeyGenerateResponse.setSecretKey(context.stringValue("AccessKeyGenerateResponse.SecretKey"));
	 
	 	return accessKeyGenerateResponse;
	}
}