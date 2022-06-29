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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.ListPoliciesResponse;
import com.aliyuncs.tag.model.v20180828.ListPoliciesResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPoliciesResponseUnmarshaller {

	public static ListPoliciesResponse unmarshall(ListPoliciesResponse listPoliciesResponse, UnmarshallerContext _ctx) {
		
		listPoliciesResponse.setRequestId(_ctx.stringValue("ListPoliciesResponse.RequestId"));
		listPoliciesResponse.setNextToken(_ctx.stringValue("ListPoliciesResponse.NextToken"));

		List<Policy> policyList = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListPoliciesResponse.PolicyList.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyName(_ctx.stringValue("ListPoliciesResponse.PolicyList["+ i +"].PolicyName"));
			policy.setPolicyDesc(_ctx.stringValue("ListPoliciesResponse.PolicyList["+ i +"].PolicyDesc"));
			policy.setPolicyContent(_ctx.stringValue("ListPoliciesResponse.PolicyList["+ i +"].PolicyContent"));
			policy.setPolicyId(_ctx.stringValue("ListPoliciesResponse.PolicyList["+ i +"].PolicyId"));
			policy.setUserType(_ctx.stringValue("ListPoliciesResponse.PolicyList["+ i +"].UserType"));

			policyList.add(policy);
		}
		listPoliciesResponse.setPolicyList(policyList);
	 
	 	return listPoliciesResponse;
	}
}