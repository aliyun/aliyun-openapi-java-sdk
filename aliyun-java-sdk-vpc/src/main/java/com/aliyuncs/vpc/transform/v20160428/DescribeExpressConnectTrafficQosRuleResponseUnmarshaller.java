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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosRuleResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosRuleResponse.RuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectTrafficQosRuleResponseUnmarshaller {

	public static DescribeExpressConnectTrafficQosRuleResponse unmarshall(DescribeExpressConnectTrafficQosRuleResponse describeExpressConnectTrafficQosRuleResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectTrafficQosRuleResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RequestId"));

		List<RuleListItem> ruleList = new ArrayList<RuleListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList.Length"); i++) {
			RuleListItem ruleListItem = new RuleListItem();
			ruleListItem.setQosId(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].QosId"));
			ruleListItem.setQueueId(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].QueueId"));
			ruleListItem.setPriority(_ctx.integerValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].Priority"));
			ruleListItem.setBizProtocol(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].Protocol"));
			ruleListItem.setSrcCidr(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].SrcCidr"));
			ruleListItem.setDstCidr(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].DstCidr"));
			ruleListItem.setSrcIPv6Cidr(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].SrcIPv6Cidr"));
			ruleListItem.setDstIPv6Cidr(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].DstIPv6Cidr"));
			ruleListItem.setSrcPortRange(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].SrcPortRange"));
			ruleListItem.setDstPortRange(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].DstPortRange"));
			ruleListItem.setMatchDscp(_ctx.integerValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].MatchDscp"));
			ruleListItem.setRemarkingDscp(_ctx.integerValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].RemarkingDscp"));
			ruleListItem.setRuleName(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].RuleName"));
			ruleListItem.setRuleDescription(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].RuleDescription"));
			ruleListItem.setRuleId(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].RuleId"));
			ruleListItem.setStatus(_ctx.stringValue("DescribeExpressConnectTrafficQosRuleResponse.RuleList["+ i +"].Status"));

			ruleList.add(ruleListItem);
		}
		describeExpressConnectTrafficQosRuleResponse.setRuleList(ruleList);
	 
	 	return describeExpressConnectTrafficQosRuleResponse;
	}
}