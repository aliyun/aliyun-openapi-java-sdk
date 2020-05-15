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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribePoliciesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribePoliciesResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePoliciesResponseUnmarshaller {

	public static DescribePoliciesResponse unmarshall(DescribePoliciesResponse describePoliciesResponse, UnmarshallerContext _ctx) {
		
		describePoliciesResponse.setRequestId(_ctx.stringValue("DescribePoliciesResponse.RequestId"));
		describePoliciesResponse.setSuccess(_ctx.booleanValue("DescribePoliciesResponse.Success"));
		describePoliciesResponse.setCode(_ctx.stringValue("DescribePoliciesResponse.Code"));
		describePoliciesResponse.setMessage(_ctx.stringValue("DescribePoliciesResponse.Message"));
		describePoliciesResponse.setTotalCount(_ctx.integerValue("DescribePoliciesResponse.TotalCount"));
		describePoliciesResponse.setPageSize(_ctx.integerValue("DescribePoliciesResponse.PageSize"));
		describePoliciesResponse.setPageNumber(_ctx.integerValue("DescribePoliciesResponse.PageNumber"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("DescribePoliciesResponse.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyId(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].PolicyId"));
			policy.setPolicyName(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].PolicyName"));
			policy.setClientId(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].ClientId"));
			policy.setVaultId(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].VaultId"));
			policy.setSource(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].Source"));
			policy.setSchedule(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].Schedule"));
			policy.setRetention(_ctx.longValue("DescribePoliciesResponse.Policies["+ i +"].Retention"));
			policy.setStatus(_ctx.stringValue("DescribePoliciesResponse.Policies["+ i +"].Status"));
			policy.setLastRunTime(_ctx.longValue("DescribePoliciesResponse.Policies["+ i +"].LastRunTime"));
			policy.setCreatedTime(_ctx.longValue("DescribePoliciesResponse.Policies["+ i +"].CreatedTime"));
			policy.setUpdatedTime(_ctx.longValue("DescribePoliciesResponse.Policies["+ i +"].UpdatedTime"));

			policies.add(policy);
		}
		describePoliciesResponse.setPolicies(policies);
	 
	 	return describePoliciesResponse;
	}
}