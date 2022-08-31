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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafPolicyResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafPolicyResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafPolicyResponseUnmarshaller {

	public static DescribeDcdnWafPolicyResponse unmarshall(DescribeDcdnWafPolicyResponse describeDcdnWafPolicyResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafPolicyResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafPolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setPolicyStatus(_ctx.stringValue("DescribeDcdnWafPolicyResponse.Policy.PolicyStatus"));
		policy.setDefenseScene(_ctx.stringValue("DescribeDcdnWafPolicyResponse.Policy.DefenseScene"));
		policy.setDomainCount(_ctx.integerValue("DescribeDcdnWafPolicyResponse.Policy.DomainCount"));
		policy.setPolicyName(_ctx.stringValue("DescribeDcdnWafPolicyResponse.Policy.PolicyName"));
		policy.setPolicyId(_ctx.longValue("DescribeDcdnWafPolicyResponse.Policy.PolicyId"));
		policy.setRuleCount(_ctx.longValue("DescribeDcdnWafPolicyResponse.Policy.RuleCount"));
		policy.setGmtModified(_ctx.stringValue("DescribeDcdnWafPolicyResponse.Policy.GmtModified"));
		policy.setPolicyType(_ctx.stringValue("DescribeDcdnWafPolicyResponse.Policy.PolicyType"));
		describeDcdnWafPolicyResponse.setPolicy(policy);
	 
	 	return describeDcdnWafPolicyResponse;
	}
}