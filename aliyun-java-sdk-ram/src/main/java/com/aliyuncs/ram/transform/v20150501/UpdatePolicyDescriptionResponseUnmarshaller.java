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

import com.aliyuncs.ram.model.v20150501.UpdatePolicyDescriptionResponse;
import com.aliyuncs.ram.model.v20150501.UpdatePolicyDescriptionResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePolicyDescriptionResponseUnmarshaller {

	public static UpdatePolicyDescriptionResponse unmarshall(UpdatePolicyDescriptionResponse updatePolicyDescriptionResponse, UnmarshallerContext _ctx) {
		
		updatePolicyDescriptionResponse.setRequestId(_ctx.stringValue("UpdatePolicyDescriptionResponse.RequestId"));

		Policy policy = new Policy();
		policy.setPolicyName(_ctx.stringValue("UpdatePolicyDescriptionResponse.Policy.PolicyName"));
		policy.setPolicyType(_ctx.stringValue("UpdatePolicyDescriptionResponse.Policy.PolicyType"));
		policy.setCreateDate(_ctx.stringValue("UpdatePolicyDescriptionResponse.Policy.CreateDate"));
		policy.setUpdateDate(_ctx.stringValue("UpdatePolicyDescriptionResponse.Policy.UpdateDate"));
		policy.setDescription(_ctx.stringValue("UpdatePolicyDescriptionResponse.Policy.Description"));
		policy.setDefaultVersion(_ctx.stringValue("UpdatePolicyDescriptionResponse.Policy.DefaultVersion"));
		updatePolicyDescriptionResponse.setPolicy(policy);
	 
	 	return updatePolicyDescriptionResponse;
	}
}