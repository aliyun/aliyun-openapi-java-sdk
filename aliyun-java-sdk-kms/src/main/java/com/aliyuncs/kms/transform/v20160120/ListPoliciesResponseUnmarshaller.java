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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.ListPoliciesResponse;
import com.aliyuncs.kms.model.v20160120.ListPoliciesResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPoliciesResponseUnmarshaller {

	public static ListPoliciesResponse unmarshall(ListPoliciesResponse listPoliciesResponse, UnmarshallerContext _ctx) {
		
		listPoliciesResponse.setRequestId(_ctx.stringValue("ListPoliciesResponse.RequestId"));
		listPoliciesResponse.setPageNumber(_ctx.integerValue("ListPoliciesResponse.PageNumber"));
		listPoliciesResponse.setPageSize(_ctx.integerValue("ListPoliciesResponse.PageSize"));
		listPoliciesResponse.setTotalCount(_ctx.integerValue("ListPoliciesResponse.TotalCount"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListPoliciesResponse.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setName(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].Name"));

			policies.add(policy);
		}
		listPoliciesResponse.setPolicies(policies);
	 
	 	return listPoliciesResponse;
	}
}