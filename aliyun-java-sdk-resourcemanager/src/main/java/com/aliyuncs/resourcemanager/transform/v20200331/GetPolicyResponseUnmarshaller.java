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

import com.aliyuncs.resourcemanager.model.v20200331.GetPolicyResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetPolicyResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolicyResponseUnmarshaller {

	public static GetPolicyResponse unmarshall(GetPolicyResponse getPolicyResponse, UnmarshallerContext _ctx) {
		
		getPolicyResponse.setRequestId(_ctx.stringValue("GetPolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setAttachmentCount(_ctx.integerValue("GetPolicyResponse.Policy.AttachmentCount"));
		policy.setCreateDate(_ctx.stringValue("GetPolicyResponse.Policy.CreateDate"));
		policy.setDefaultVersion(_ctx.stringValue("GetPolicyResponse.Policy.DefaultVersion"));
		policy.setDescription(_ctx.stringValue("GetPolicyResponse.Policy.Description"));
		policy.setPolicyDocument(_ctx.stringValue("GetPolicyResponse.Policy.PolicyDocument"));
		policy.setPolicyName(_ctx.stringValue("GetPolicyResponse.Policy.PolicyName"));
		policy.setPolicyType(_ctx.stringValue("GetPolicyResponse.Policy.PolicyType"));
		policy.setUpdateDate(_ctx.stringValue("GetPolicyResponse.Policy.UpdateDate"));
		getPolicyResponse.setPolicy(policy);
	 
	 	return getPolicyResponse;
	}
}