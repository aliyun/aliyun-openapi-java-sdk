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

import com.aliyuncs.ram.model.v20150501.GetPolicyResponse;
import com.aliyuncs.ram.model.v20150501.GetPolicyResponse.DefaultPolicyVersion;
import com.aliyuncs.ram.model.v20150501.GetPolicyResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolicyResponseUnmarshaller {

	public static GetPolicyResponse unmarshall(GetPolicyResponse getPolicyResponse, UnmarshallerContext context) {
		
		getPolicyResponse.setRequestId(context.stringValue("GetPolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setPolicyName(context.stringValue("GetPolicyResponse.Policy.PolicyName"));
		policy.setPolicyType(context.stringValue("GetPolicyResponse.Policy.PolicyType"));
		policy.setDescription(context.stringValue("GetPolicyResponse.Policy.Description"));
		policy.setDefaultVersion(context.stringValue("GetPolicyResponse.Policy.DefaultVersion"));
		policy.setPolicyDocument(context.stringValue("GetPolicyResponse.Policy.PolicyDocument"));
		policy.setCreateDate(context.stringValue("GetPolicyResponse.Policy.CreateDate"));
		policy.setUpdateDate(context.stringValue("GetPolicyResponse.Policy.UpdateDate"));
		policy.setAttachmentCount(context.integerValue("GetPolicyResponse.Policy.AttachmentCount"));
		getPolicyResponse.setPolicy(policy);

		DefaultPolicyVersion defaultPolicyVersion = new DefaultPolicyVersion();
		defaultPolicyVersion.setVersionId(context.stringValue("GetPolicyResponse.DefaultPolicyVersion.VersionId"));
		defaultPolicyVersion.setIsDefaultVersion(context.booleanValue("GetPolicyResponse.DefaultPolicyVersion.IsDefaultVersion"));
		defaultPolicyVersion.setPolicyDocument(context.stringValue("GetPolicyResponse.DefaultPolicyVersion.PolicyDocument"));
		defaultPolicyVersion.setCreateDate(context.stringValue("GetPolicyResponse.DefaultPolicyVersion.CreateDate"));
		getPolicyResponse.setDefaultPolicyVersion(defaultPolicyVersion);
	 
	 	return getPolicyResponse;
	}
}