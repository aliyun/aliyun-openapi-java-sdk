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
package com.aliyuncs.cloudauth.transform.v20171117;

import com.aliyuncs.cloudauth.model.v20171117.GetVerifyTokenResponse;
import com.aliyuncs.cloudauth.model.v20171117.GetVerifyTokenResponse.Data;
import com.aliyuncs.cloudauth.model.v20171117.GetVerifyTokenResponse.Data.StsToken;
import com.aliyuncs.cloudauth.model.v20171117.GetVerifyTokenResponse.Data.VerifyToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVerifyTokenResponseUnmarshaller {

	public static GetVerifyTokenResponse unmarshall(GetVerifyTokenResponse getVerifyTokenResponse, UnmarshallerContext context) {
		
		getVerifyTokenResponse.setRequestId(context.stringValue("GetVerifyTokenResponse.RequestId"));
		getVerifyTokenResponse.setSuccess(context.booleanValue("GetVerifyTokenResponse.Success"));
		getVerifyTokenResponse.setCode(context.stringValue("GetVerifyTokenResponse.Code"));
		getVerifyTokenResponse.setMessage(context.stringValue("GetVerifyTokenResponse.Message"));

		Data data = new Data();

		VerifyToken verifyToken = new VerifyToken();
		verifyToken.setToken(context.stringValue("GetVerifyTokenResponse.Data.VerifyToken.Token"));
		verifyToken.setDurationSeconds(context.integerValue("GetVerifyTokenResponse.Data.VerifyToken.DurationSeconds"));
		data.setVerifyToken(verifyToken);

		StsToken stsToken = new StsToken();
		stsToken.setAccessKeyId(context.stringValue("GetVerifyTokenResponse.Data.StsToken.AccessKeyId"));
		stsToken.setAccessKeySecret(context.stringValue("GetVerifyTokenResponse.Data.StsToken.AccessKeySecret"));
		stsToken.setExpiration(context.stringValue("GetVerifyTokenResponse.Data.StsToken.Expiration"));
		stsToken.setEndPoint(context.stringValue("GetVerifyTokenResponse.Data.StsToken.EndPoint"));
		stsToken.setBucketName(context.stringValue("GetVerifyTokenResponse.Data.StsToken.BucketName"));
		stsToken.setPath(context.stringValue("GetVerifyTokenResponse.Data.StsToken.Path"));
		stsToken.setToken(context.stringValue("GetVerifyTokenResponse.Data.StsToken.Token"));
		data.setStsToken(stsToken);
		getVerifyTokenResponse.setData(data);
	 
	 	return getVerifyTokenResponse;
	}
}