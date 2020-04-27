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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.GetPolicyVersionResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetPolicyVersionResponse.PolicyVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolicyVersionResponseUnmarshaller {

	public static GetPolicyVersionResponse unmarshall(GetPolicyVersionResponse getPolicyVersionResponse, UnmarshallerContext _ctx) {
		
		getPolicyVersionResponse.setRequestId(_ctx.stringValue("GetPolicyVersionResponse.RequestId"));

		PolicyVersion policyVersion = new PolicyVersion();
		policyVersion.setVersionId(_ctx.stringValue("GetPolicyVersionResponse.PolicyVersion.VersionId"));
		policyVersion.setIsDefaultVersion(_ctx.booleanValue("GetPolicyVersionResponse.PolicyVersion.IsDefaultVersion"));
		policyVersion.setPolicyDocument(_ctx.stringValue("GetPolicyVersionResponse.PolicyVersion.PolicyDocument"));
		policyVersion.setCreateDate(_ctx.stringValue("GetPolicyVersionResponse.PolicyVersion.CreateDate"));
		getPolicyVersionResponse.setPolicyVersion(policyVersion);
	 
	 	return getPolicyVersionResponse;
	}
}