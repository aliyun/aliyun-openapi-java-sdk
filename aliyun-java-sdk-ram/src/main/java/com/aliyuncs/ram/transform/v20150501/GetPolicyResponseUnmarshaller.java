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

	public static GetPolicyResponse unmarshall(GetPolicyResponse getPolicyResponse, UnmarshallerContext _ctx) {
		
		getPolicyResponse.setRequestId(_ctx.stringValue("GetPolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setPolicyName(_ctx.stringValue("GetPolicyResponse.Policy.PolicyName"));
		policy.setPolicyType(_ctx.stringValue("GetPolicyResponse.Policy.PolicyType"));
		policy.setDescription(_ctx.stringValue("GetPolicyResponse.Policy.Description"));
		policy.setDefaultVersion(_ctx.stringValue("GetPolicyResponse.Policy.DefaultVersion"));
		policy.setPolicyDocument(_ctx.stringValue("GetPolicyResponse.Policy.PolicyDocument"));
		policy.setCreateDate(_ctx.stringValue("GetPolicyResponse.Policy.CreateDate"));
		policy.setUpdateDate(_ctx.stringValue("GetPolicyResponse.Policy.UpdateDate"));
		policy.setAttachmentCount(_ctx.integerValue("GetPolicyResponse.Policy.AttachmentCount"));
		getPolicyResponse.setPolicy(policy);

		DefaultPolicyVersion defaultPolicyVersion = new DefaultPolicyVersion();
		defaultPolicyVersion.setVersionId(_ctx.stringValue("GetPolicyResponse.DefaultPolicyVersion.VersionId"));
		defaultPolicyVersion.setIsDefaultVersion(_ctx.booleanValue("GetPolicyResponse.DefaultPolicyVersion.IsDefaultVersion"));
		defaultPolicyVersion.setPolicyDocument(_ctx.stringValue("GetPolicyResponse.DefaultPolicyVersion.PolicyDocument"));
		defaultPolicyVersion.setCreateDate(_ctx.stringValue("GetPolicyResponse.DefaultPolicyVersion.CreateDate"));
		getPolicyResponse.setDefaultPolicyVersion(defaultPolicyVersion);
	 
	 	return getPolicyResponse;
	}
}