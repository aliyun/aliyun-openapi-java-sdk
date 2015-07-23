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
package com.aliyuncs.sts.transform.v20150401;

import com.aliyuncs.sts.model.v20150401.GetFederationTokenResponse;
import com.aliyuncs.sts.model.v20150401.GetFederationTokenResponse.Credentials;
import com.aliyuncs.sts.model.v20150401.GetFederationTokenResponse.FederatedUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFederationTokenResponseUnmarshaller {

	public static GetFederationTokenResponse unmarshall(GetFederationTokenResponse getFederationTokenResponse, UnmarshallerContext context) {
		
		getFederationTokenResponse.setRequestId(context.stringValue("GetFederationTokenResponse.RequestId"));

		Credentials  credentials = new Credentials();
		credentials.setSecurityToken(context.stringValue("GetFederationTokenResponse.Credentials.SecurityToken"));
		credentials.setAccessKeySecret(context.stringValue("GetFederationTokenResponse.Credentials.AccessKeySecret"));
		credentials.setAccessKeyId(context.stringValue("GetFederationTokenResponse.Credentials.AccessKeyId"));
		credentials.setExpiration(context.stringValue("GetFederationTokenResponse.Credentials.Expiration"));
		getFederationTokenResponse.setCredentials(credentials);

		FederatedUser  federatedUser = new FederatedUser();
		federatedUser.setArn(context.stringValue("GetFederationTokenResponse.FederatedUser.Arn"));
		federatedUser.setFederatedUserId(context.stringValue("GetFederationTokenResponse.FederatedUser.FederatedUserId"));
		getFederationTokenResponse.setFederatedUser(federatedUser);
	 
	 	return getFederationTokenResponse;
	}
}