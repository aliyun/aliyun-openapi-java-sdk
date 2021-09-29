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

import com.aliyuncs.sts.model.v20150401.AssumeRoleWithOIDCResponse;
import com.aliyuncs.sts.model.v20150401.AssumeRoleWithOIDCResponse.AssumedRoleUser;
import com.aliyuncs.sts.model.v20150401.AssumeRoleWithOIDCResponse.Credentials;
import com.aliyuncs.sts.model.v20150401.AssumeRoleWithOIDCResponse.OIDCTokenInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssumeRoleWithOIDCResponseUnmarshaller {

	public static AssumeRoleWithOIDCResponse unmarshall(AssumeRoleWithOIDCResponse assumeRoleWithOIDCResponse, UnmarshallerContext _ctx) {
		
		assumeRoleWithOIDCResponse.setRequestId(_ctx.stringValue("AssumeRoleWithOIDCResponse.RequestId"));

		OIDCTokenInfo oIDCTokenInfo = new OIDCTokenInfo();
		oIDCTokenInfo.setSubject(_ctx.stringValue("AssumeRoleWithOIDCResponse.OIDCTokenInfo.Subject"));
		oIDCTokenInfo.setIssuer(_ctx.stringValue("AssumeRoleWithOIDCResponse.OIDCTokenInfo.Issuer"));
		oIDCTokenInfo.setClientIds(_ctx.stringValue("AssumeRoleWithOIDCResponse.OIDCTokenInfo.ClientIds"));
		assumeRoleWithOIDCResponse.setOIDCTokenInfo(oIDCTokenInfo);

		AssumedRoleUser assumedRoleUser = new AssumedRoleUser();
		assumedRoleUser.setAssumedRoleId(_ctx.stringValue("AssumeRoleWithOIDCResponse.AssumedRoleUser.AssumedRoleId"));
		assumedRoleUser.setArn(_ctx.stringValue("AssumeRoleWithOIDCResponse.AssumedRoleUser.Arn"));
		assumeRoleWithOIDCResponse.setAssumedRoleUser(assumedRoleUser);

		Credentials credentials = new Credentials();
		credentials.setSecurityToken(_ctx.stringValue("AssumeRoleWithOIDCResponse.Credentials.SecurityToken"));
		credentials.setExpiration(_ctx.stringValue("AssumeRoleWithOIDCResponse.Credentials.Expiration"));
		credentials.setAccessKeySecret(_ctx.stringValue("AssumeRoleWithOIDCResponse.Credentials.AccessKeySecret"));
		credentials.setAccessKeyId(_ctx.stringValue("AssumeRoleWithOIDCResponse.Credentials.AccessKeyId"));
		assumeRoleWithOIDCResponse.setCredentials(credentials);
	 
	 	return assumeRoleWithOIDCResponse;
	}
}