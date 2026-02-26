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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListAbacPoliciesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAbacPoliciesResponse.PolicyListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAbacPoliciesResponseUnmarshaller {

	public static ListAbacPoliciesResponse unmarshall(ListAbacPoliciesResponse listAbacPoliciesResponse, UnmarshallerContext _ctx) {
		
		listAbacPoliciesResponse.setRequestId(_ctx.stringValue("ListAbacPoliciesResponse.RequestId"));
		listAbacPoliciesResponse.setErrorCode(_ctx.stringValue("ListAbacPoliciesResponse.ErrorCode"));
		listAbacPoliciesResponse.setErrorMessage(_ctx.stringValue("ListAbacPoliciesResponse.ErrorMessage"));
		listAbacPoliciesResponse.setSuccess(_ctx.booleanValue("ListAbacPoliciesResponse.Success"));
		listAbacPoliciesResponse.setTid(_ctx.longValue("ListAbacPoliciesResponse.Tid"));
		listAbacPoliciesResponse.setTotalCount(_ctx.longValue("ListAbacPoliciesResponse.TotalCount"));

		List<PolicyListItem> policyList = new ArrayList<PolicyListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAbacPoliciesResponse.PolicyList.Length"); i++) {
			PolicyListItem policyListItem = new PolicyListItem();
			policyListItem.setAbacPolicyId(_ctx.longValue("ListAbacPoliciesResponse.PolicyList["+ i +"].AbacPolicyId"));
			policyListItem.setAbacPolicyName(_ctx.stringValue("ListAbacPoliciesResponse.PolicyList["+ i +"].AbacPolicyName"));
			policyListItem.setAbacPolicyDesc(_ctx.stringValue("ListAbacPoliciesResponse.PolicyList["+ i +"].AbacPolicyDesc"));
			policyListItem.setAbacPolicyContent(_ctx.stringValue("ListAbacPoliciesResponse.PolicyList["+ i +"].AbacPolicyContent"));
			policyListItem.setCreatorId(_ctx.longValue("ListAbacPoliciesResponse.PolicyList["+ i +"].CreatorId"));
			policyListItem.setAbacPolicySource(_ctx.stringValue("ListAbacPoliciesResponse.PolicyList["+ i +"].AbacPolicySource"));

			policyList.add(policyListItem);
		}
		listAbacPoliciesResponse.setPolicyList(policyList);
	 
	 	return listAbacPoliciesResponse;
	}
}