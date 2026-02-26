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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTrafficMarkingPoliciesResponse;
import com.aliyuncs.cbn.model.v20170912.ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicy;
import com.aliyuncs.cbn.model.v20170912.ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicy.TrafficMatchRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrafficMarkingPoliciesResponseUnmarshaller {

	public static ListTrafficMarkingPoliciesResponse unmarshall(ListTrafficMarkingPoliciesResponse listTrafficMarkingPoliciesResponse, UnmarshallerContext _ctx) {
		
		listTrafficMarkingPoliciesResponse.setRequestId(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.RequestId"));
		listTrafficMarkingPoliciesResponse.setNextToken(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.NextToken"));
		listTrafficMarkingPoliciesResponse.setTotalCount(_ctx.integerValue("ListTrafficMarkingPoliciesResponse.TotalCount"));
		listTrafficMarkingPoliciesResponse.setMaxResults(_ctx.integerValue("ListTrafficMarkingPoliciesResponse.MaxResults"));

		List<TrafficMarkingPolicy> trafficMarkingPolicies = new ArrayList<TrafficMarkingPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies.Length"); i++) {
			TrafficMarkingPolicy trafficMarkingPolicy = new TrafficMarkingPolicy();
			trafficMarkingPolicy.setTrafficMarkingPolicyStatus(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMarkingPolicyStatus"));
			trafficMarkingPolicy.setTrafficMarkingPolicyId(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMarkingPolicyId"));
			trafficMarkingPolicy.setMarkingDscp(_ctx.integerValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].MarkingDscp"));
			trafficMarkingPolicy.setTrafficMarkingPolicyName(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMarkingPolicyName"));
			trafficMarkingPolicy.setPriority(_ctx.integerValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].Priority"));
			trafficMarkingPolicy.setTrafficMarkingPolicyDescription(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMarkingPolicyDescription"));
			trafficMarkingPolicy.setTransitRouterId(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TransitRouterId"));

			List<TrafficMatchRule> trafficMatchRules = new ArrayList<TrafficMatchRule>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules.Length"); j++) {
				TrafficMatchRule trafficMatchRule = new TrafficMatchRule();
				trafficMatchRule.setMatchDscp(_ctx.integerValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].MatchDscp"));
				trafficMatchRule.setDstCidr(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].DstCidr"));
				trafficMatchRule.setTrafficMatchRuleDescription(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].TrafficMatchRuleDescription"));
				trafficMatchRule.setBizProtocol(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].Protocol"));
				trafficMatchRule.setTrafficMatchRuleId(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].TrafficMatchRuleId"));
				trafficMatchRule.setSrcCidr(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].SrcCidr"));
				trafficMatchRule.setTrafficMatchRuleName(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].TrafficMatchRuleName"));
				trafficMatchRule.setTrafficMatchRuleStatus(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].TrafficMatchRuleStatus"));
				trafficMatchRule.setAddressFamily(_ctx.stringValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].AddressFamily"));

				List<Integer> dstPortRange = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].DstPortRange.Length"); k++) {
					dstPortRange.add(_ctx.integerValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].DstPortRange["+ k +"]"));
				}
				trafficMatchRule.setDstPortRange(dstPortRange);

				List<Integer> srcPortRange = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].SrcPortRange.Length"); k++) {
					srcPortRange.add(_ctx.integerValue("ListTrafficMarkingPoliciesResponse.TrafficMarkingPolicies["+ i +"].TrafficMatchRules["+ j +"].SrcPortRange["+ k +"]"));
				}
				trafficMatchRule.setSrcPortRange(srcPortRange);

				trafficMatchRules.add(trafficMatchRule);
			}
			trafficMarkingPolicy.setTrafficMatchRules(trafficMatchRules);

			trafficMarkingPolicies.add(trafficMarkingPolicy);
		}
		listTrafficMarkingPoliciesResponse.setTrafficMarkingPolicies(trafficMarkingPolicies);
	 
	 	return listTrafficMarkingPoliciesResponse;
	}
}