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

import com.aliyuncs.adcp.model.v20220101.DescribePolicyInstancesResponse;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyInstancesResponse.Policy;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyInstancesResponseUnmarshaller {

	public static DescribePolicyInstancesResponse unmarshall(DescribePolicyInstancesResponse describePolicyInstancesResponse, UnmarshallerContext _ctx) {
		
		describePolicyInstancesResponse.setRequestId(_ctx.stringValue("DescribePolicyInstancesResponse.RequestId"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyInstancesResponse.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyName(_ctx.stringValue("DescribePolicyInstancesResponse.Policies["+ i +"].PolicyName"));
			policy.setInstanceName(_ctx.stringValue("DescribePolicyInstancesResponse.Policies["+ i +"].InstanceName"));
			policy.setPolicyCategory(_ctx.stringValue("DescribePolicyInstancesResponse.Policies["+ i +"].PolicyCategory"));
			policy.setPolicyDescription(_ctx.stringValue("DescribePolicyInstancesResponse.Policies["+ i +"].PolicyDescription"));
			policy.setPolicySeverity(_ctx.stringValue("DescribePolicyInstancesResponse.Policies["+ i +"].PolicySeverity"));
			policy.setPolicyScope(_ctx.stringValue("DescribePolicyInstancesResponse.Policies["+ i +"].PolicyScope"));
			policy.setPolicyAction(_ctx.stringValue("DescribePolicyInstancesResponse.Policies["+ i +"].PolicyAction"));
			policy.setTotalViolations(_ctx.longValue("DescribePolicyInstancesResponse.Policies["+ i +"].TotalViolations"));
			policy.setClusterId(_ctx.stringValue("DescribePolicyInstancesResponse.Policies["+ i +"].ClusterId"));
			policy.setPolicyParameters(_ctx.mapValue("DescribePolicyInstancesResponse.Policies["+ i +"].PolicyParameters"));

			policies.add(policy);
		}
		describePolicyInstancesResponse.setPolicies(policies);
	 
	 	return describePolicyInstancesResponse;
	}
}