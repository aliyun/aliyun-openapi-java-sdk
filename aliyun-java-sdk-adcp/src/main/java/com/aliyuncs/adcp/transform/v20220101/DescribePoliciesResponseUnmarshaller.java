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

package com.aliyuncs.adcp.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adcp.model.v20220101.DescribePoliciesResponse;
import com.aliyuncs.adcp.model.v20220101.DescribePoliciesResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePoliciesResponseUnmarshaller {

	public static DescribePoliciesResponse unmarshall(DescribePoliciesResponse describePoliciesResponse, UnmarshallerContext _ctx) {
		
		describePoliciesResponse.setRequestId(_ctx.stringValue("DescribePoliciesResponse.RequestId"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("DescribePoliciesResponse.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setCategory(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].Category"));

			List<String> names = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePoliciesResponse.Policies["+ i +"].Names.Length"); j++) {
				names.add(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].Names["+ j +"]"));
			}
			policy.setNames(names);

			policies.add(policy);
		}
		describePoliciesResponse.setPolicies(policies);
	 
	 	return describePoliciesResponse;
	}
}