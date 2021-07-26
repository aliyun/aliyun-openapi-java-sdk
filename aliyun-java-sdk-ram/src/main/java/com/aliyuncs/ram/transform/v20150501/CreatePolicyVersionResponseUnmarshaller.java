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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.CreatePolicyVersionResponse;
import com.aliyuncs.ram.model.v20150501.CreatePolicyVersionResponse.PolicyVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePolicyVersionResponseUnmarshaller {

	public static CreatePolicyVersionResponse unmarshall(CreatePolicyVersionResponse createPolicyVersionResponse, UnmarshallerContext _ctx) {
		
		createPolicyVersionResponse.setRequestId(_ctx.stringValue("CreatePolicyVersionResponse.RequestId"));

		PolicyVersion policyVersion = new PolicyVersion();
		policyVersion.setIsDefaultVersion(_ctx.booleanValue("CreatePolicyVersionResponse.PolicyVersion.IsDefaultVersion"));
		policyVersion.setPolicyDocument(_ctx.stringValue("CreatePolicyVersionResponse.PolicyVersion.PolicyDocument"));
		policyVersion.setVersionId(_ctx.stringValue("CreatePolicyVersionResponse.PolicyVersion.VersionId"));
		policyVersion.setCreateDate(_ctx.stringValue("CreatePolicyVersionResponse.PolicyVersion.CreateDate"));
		createPolicyVersionResponse.setPolicyVersion(policyVersion);
	 
	 	return createPolicyVersionResponse;
	}
}