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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetAbacPolicyResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetAbacPolicyResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAbacPolicyResponseUnmarshaller {

	public static GetAbacPolicyResponse unmarshall(GetAbacPolicyResponse getAbacPolicyResponse, UnmarshallerContext _ctx) {
		
		getAbacPolicyResponse.setRequestId(_ctx.stringValue("GetAbacPolicyResponse.RequestId"));
		getAbacPolicyResponse.setErrorCode(_ctx.stringValue("GetAbacPolicyResponse.ErrorCode"));
		getAbacPolicyResponse.setErrorMessage(_ctx.stringValue("GetAbacPolicyResponse.ErrorMessage"));
		getAbacPolicyResponse.setSuccess(_ctx.booleanValue("GetAbacPolicyResponse.Success"));

		Policy policy = new Policy();
		policy.setPolicyName(_ctx.stringValue("GetAbacPolicyResponse.Policy.PolicyName"));
		policy.setPolicyDesc(_ctx.stringValue("GetAbacPolicyResponse.Policy.PolicyDesc"));
		policy.setPolicyContent(_ctx.stringValue("GetAbacPolicyResponse.Policy.PolicyContent"));
		policy.setCreatorId(_ctx.longValue("GetAbacPolicyResponse.Policy.CreatorId"));
		policy.setPolicySource(_ctx.stringValue("GetAbacPolicyResponse.Policy.PolicySource"));
		policy.setAuthorizedQuantity(_ctx.stringValue("GetAbacPolicyResponse.Policy.AuthorizedQuantity"));
		policy.setPolicyId(_ctx.longValue("GetAbacPolicyResponse.Policy.PolicyId"));
		getAbacPolicyResponse.setPolicy(policy);
	 
	 	return getAbacPolicyResponse;
	}
}