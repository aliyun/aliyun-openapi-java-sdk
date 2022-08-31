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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafPoliciesResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafPoliciesResponse.PolicyItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafPoliciesResponseUnmarshaller {

	public static DescribeDcdnWafPoliciesResponse unmarshall(DescribeDcdnWafPoliciesResponse describeDcdnWafPoliciesResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafPoliciesResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafPoliciesResponse.RequestId"));
		describeDcdnWafPoliciesResponse.setPageSize(_ctx.integerValue("DescribeDcdnWafPoliciesResponse.PageSize"));
		describeDcdnWafPoliciesResponse.setPageNumber(_ctx.integerValue("DescribeDcdnWafPoliciesResponse.PageNumber"));
		describeDcdnWafPoliciesResponse.setTotalCount(_ctx.integerValue("DescribeDcdnWafPoliciesResponse.TotalCount"));

		List<PolicyItem> policies = new ArrayList<PolicyItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafPoliciesResponse.Policies.Length"); i++) {
			PolicyItem policyItem = new PolicyItem();
			policyItem.setPolicyStatus(_ctx.stringValue("DescribeDcdnWafPoliciesResponse.Policies["+ i +"].PolicyStatus"));
			policyItem.setDefenseScene(_ctx.stringValue("DescribeDcdnWafPoliciesResponse.Policies["+ i +"].DefenseScene"));
			policyItem.setDomainCount(_ctx.integerValue("DescribeDcdnWafPoliciesResponse.Policies["+ i +"].DomainCount"));
			policyItem.setPolicyName(_ctx.stringValue("DescribeDcdnWafPoliciesResponse.Policies["+ i +"].PolicyName"));
			policyItem.setPolicyId(_ctx.longValue("DescribeDcdnWafPoliciesResponse.Policies["+ i +"].PolicyId"));
			policyItem.setRuleCount(_ctx.longValue("DescribeDcdnWafPoliciesResponse.Policies["+ i +"].RuleCount"));
			policyItem.setGmtModified(_ctx.stringValue("DescribeDcdnWafPoliciesResponse.Policies["+ i +"].GmtModified"));
			policyItem.setPolicyType(_ctx.stringValue("DescribeDcdnWafPoliciesResponse.Policies["+ i +"].PolicyType"));

			policies.add(policyItem);
		}
		describeDcdnWafPoliciesResponse.setPolicies(policies);
	 
	 	return describeDcdnWafPoliciesResponse;
	}
}