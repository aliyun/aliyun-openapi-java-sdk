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

import com.aliyuncs.ram.model.v20150501.CreatePolicyResponse;
import com.aliyuncs.ram.model.v20150501.CreatePolicyResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePolicyResponseUnmarshaller {

	public static CreatePolicyResponse unmarshall(CreatePolicyResponse createPolicyResponse, UnmarshallerContext context) {
		
		createPolicyResponse.setRequestId(context.stringValue("CreatePolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setPolicyName(context.stringValue("CreatePolicyResponse.Policy.PolicyName"));
		policy.setPolicyType(context.stringValue("CreatePolicyResponse.Policy.PolicyType"));
		policy.setDescription(context.stringValue("CreatePolicyResponse.Policy.Description"));
		policy.setDefaultVersion(context.stringValue("CreatePolicyResponse.Policy.DefaultVersion"));
		policy.setCreateDate(context.stringValue("CreatePolicyResponse.Policy.CreateDate"));
		createPolicyResponse.setPolicy(policy);
	 
	 	return createPolicyResponse;
	}
}