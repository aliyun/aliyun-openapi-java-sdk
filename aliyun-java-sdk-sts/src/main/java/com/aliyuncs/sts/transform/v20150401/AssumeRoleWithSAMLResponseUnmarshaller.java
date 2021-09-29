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

import com.aliyuncs.sts.model.v20150401.AssumeRoleWithSAMLResponse;
import com.aliyuncs.sts.model.v20150401.AssumeRoleWithSAMLResponse.AssumedRoleUser;
import com.aliyuncs.sts.model.v20150401.AssumeRoleWithSAMLResponse.Credentials;
import com.aliyuncs.sts.model.v20150401.AssumeRoleWithSAMLResponse.SAMLAssertionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssumeRoleWithSAMLResponseUnmarshaller {

	public static AssumeRoleWithSAMLResponse unmarshall(AssumeRoleWithSAMLResponse assumeRoleWithSAMLResponse, UnmarshallerContext _ctx) {
		
		assumeRoleWithSAMLResponse.setRequestId(_ctx.stringValue("AssumeRoleWithSAMLResponse.RequestId"));

		SAMLAssertionInfo sAMLAssertionInfo = new SAMLAssertionInfo();
		sAMLAssertionInfo.setSubjectType(_ctx.stringValue("AssumeRoleWithSAMLResponse.SAMLAssertionInfo.SubjectType"));
		sAMLAssertionInfo.setIssuer(_ctx.stringValue("AssumeRoleWithSAMLResponse.SAMLAssertionInfo.Issuer"));
		sAMLAssertionInfo.setRecipient(_ctx.stringValue("AssumeRoleWithSAMLResponse.SAMLAssertionInfo.Recipient"));
		sAMLAssertionInfo.setSubject(_ctx.stringValue("AssumeRoleWithSAMLResponse.SAMLAssertionInfo.Subject"));
		assumeRoleWithSAMLResponse.setSAMLAssertionInfo(sAMLAssertionInfo);

		AssumedRoleUser assumedRoleUser = new AssumedRoleUser();
		assumedRoleUser.setArn(_ctx.stringValue("AssumeRoleWithSAMLResponse.AssumedRoleUser.Arn"));
		assumedRoleUser.setAssumedRoleId(_ctx.stringValue("AssumeRoleWithSAMLResponse.AssumedRoleUser.AssumedRoleId"));
		assumeRoleWithSAMLResponse.setAssumedRoleUser(assumedRoleUser);

		Credentials credentials = new Credentials();
		credentials.setSecurityToken(_ctx.stringValue("AssumeRoleWithSAMLResponse.Credentials.SecurityToken"));
		credentials.setAccessKeyId(_ctx.stringValue("AssumeRoleWithSAMLResponse.Credentials.AccessKeyId"));
		credentials.setAccessKeySecret(_ctx.stringValue("AssumeRoleWithSAMLResponse.Credentials.AccessKeySecret"));
		credentials.setExpiration(_ctx.stringValue("AssumeRoleWithSAMLResponse.Credentials.Expiration"));
		assumeRoleWithSAMLResponse.setCredentials(credentials);
	 
	 	return assumeRoleWithSAMLResponse;
	}
}