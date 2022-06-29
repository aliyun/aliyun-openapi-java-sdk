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

package com.aliyuncs.tag.transform.v20180828;

import com.aliyuncs.tag.model.v20180828.GetPolicyResponse;
import com.aliyuncs.tag.model.v20180828.GetPolicyResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolicyResponseUnmarshaller {

	public static GetPolicyResponse unmarshall(GetPolicyResponse getPolicyResponse, UnmarshallerContext _ctx) {
		
		getPolicyResponse.setRequestId(_ctx.stringValue("GetPolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setPolicyName(_ctx.stringValue("GetPolicyResponse.Policy.PolicyName"));
		policy.setPolicyDesc(_ctx.stringValue("GetPolicyResponse.Policy.PolicyDesc"));
		policy.setPolicyContent(_ctx.stringValue("GetPolicyResponse.Policy.PolicyContent"));
		policy.setUserType(_ctx.stringValue("GetPolicyResponse.Policy.UserType"));
		getPolicyResponse.setPolicy(policy);
	 
	 	return getPolicyResponse;
	}
}