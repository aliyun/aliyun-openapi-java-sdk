/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sts.transform.v20150401;

import com.aliyuncs.sts.model.v20150401.AssumeRoleResponse;
import com.aliyuncs.sts.model.v20150401.AssumeRoleResponse.AssumedRoleUser;
import com.aliyuncs.sts.model.v20150401.AssumeRoleResponse.Credentials;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssumeRoleResponseUnmarshaller {

	public static AssumeRoleResponse unmarshall(AssumeRoleResponse assumeRoleResponse, UnmarshallerContext _ctx) {
		
		assumeRoleResponse.setRequestId(_ctx.stringValue("AssumeRoleResponse.RequestId"));

		AssumedRoleUser assumedRoleUser = new AssumedRoleUser();
		assumedRoleUser.setAssumedRoleId(_ctx.stringValue("AssumeRoleResponse.AssumedRoleUser.AssumedRoleId"));
		assumedRoleUser.setArn(_ctx.stringValue("AssumeRoleResponse.AssumedRoleUser.Arn"));
		assumeRoleResponse.setAssumedRoleUser(assumedRoleUser);

		Credentials credentials = new Credentials();
		credentials.setSecurityToken(_ctx.stringValue("AssumeRoleResponse.Credentials.SecurityToken"));
		credentials.setExpiration(_ctx.stringValue("AssumeRoleResponse.Credentials.Expiration"));
		credentials.setAccessKeySecret(_ctx.stringValue("AssumeRoleResponse.Credentials.AccessKeySecret"));
		credentials.setAccessKeyId(_ctx.stringValue("AssumeRoleResponse.Credentials.AccessKeyId"));
		assumeRoleResponse.setCredentials(credentials);
	 
	 	return assumeRoleResponse;
	}
}