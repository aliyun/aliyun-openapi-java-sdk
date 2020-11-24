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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeSceneDefensePoliciesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSceneDefensePoliciesResponse.Policy;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSceneDefensePoliciesResponse.Policy.Policy1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneDefensePoliciesResponseUnmarshaller {

	public static DescribeSceneDefensePoliciesResponse unmarshall(DescribeSceneDefensePoliciesResponse describeSceneDefensePoliciesResponse, UnmarshallerContext _ctx) {
		
		describeSceneDefensePoliciesResponse.setRequestId(_ctx.stringValue("DescribeSceneDefensePoliciesResponse.RequestId"));
		describeSceneDefensePoliciesResponse.setSuccess(_ctx.booleanValue("DescribeSceneDefensePoliciesResponse.Success"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSceneDefensePoliciesResponse.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyId(_ctx.stringValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].PolicyId"));
			policy.setName(_ctx.stringValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].Name"));
			policy.setTemplate(_ctx.stringValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].Template"));
			policy.setStartTime(_ctx.longValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].StartTime"));
			policy.setEndTime(_ctx.longValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].EndTime"));
			policy.setStatus(_ctx.integerValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].Status"));
			policy.setDone(_ctx.integerValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].Done"));
			policy.setObjectCount(_ctx.integerValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].ObjectCount"));

			List<Policy1> runtimePolicies = new ArrayList<Policy1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].RuntimePolicies.Length"); j++) {
				Policy1 policy1 = new Policy1();
				policy1.setPolicyType(_ctx.integerValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].RuntimePolicies["+ j +"].PolicyType"));
				policy1.setStatus(_ctx.integerValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].RuntimePolicies["+ j +"].Status"));
				policy1.setOldValue(_ctx.stringValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].RuntimePolicies["+ j +"].oldValue"));
				policy1.setNewValue(_ctx.stringValue("DescribeSceneDefensePoliciesResponse.Policies["+ i +"].RuntimePolicies["+ j +"].NewValue"));

				runtimePolicies.add(policy1);
			}
			policy.setRuntimePolicies(runtimePolicies);

			policies.add(policy);
		}
		describeSceneDefensePoliciesResponse.setPolicies(policies);
	 
	 	return describeSceneDefensePoliciesResponse;
	}
}