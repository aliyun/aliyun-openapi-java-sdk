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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListPoliciesForRoleResponse;
import com.aliyuncs.ram.model.v20150501.ListPoliciesForRoleResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPoliciesForRoleResponseUnmarshaller {

	public static ListPoliciesForRoleResponse unmarshall(ListPoliciesForRoleResponse listPoliciesForRoleResponse, UnmarshallerContext _ctx) {
		
		listPoliciesForRoleResponse.setRequestId(_ctx.stringValue("ListPoliciesForRoleResponse.RequestId"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListPoliciesForRoleResponse.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyName(_ctx.stringValue("ListPoliciesForRoleResponse.Policies["+ i +"].PolicyName"));
			policy.setPolicyType(_ctx.stringValue("ListPoliciesForRoleResponse.Policies["+ i +"].PolicyType"));
			policy.setDescription(_ctx.stringValue("ListPoliciesForRoleResponse.Policies["+ i +"].Description"));
			policy.setDefaultVersion(_ctx.stringValue("ListPoliciesForRoleResponse.Policies["+ i +"].DefaultVersion"));
			policy.setAttachDate(_ctx.stringValue("ListPoliciesForRoleResponse.Policies["+ i +"].AttachDate"));

			policies.add(policy);
		}
		listPoliciesForRoleResponse.setPolicies(policies);
	 
	 	return listPoliciesForRoleResponse;
	}
}