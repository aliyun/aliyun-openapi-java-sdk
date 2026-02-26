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

import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosQueueResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosQueueResponse.QueueListItem;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosQueueResponse.QueueListItem.RuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectTrafficQosQueueResponseUnmarshaller {

	public static DescribeExpressConnectTrafficQosQueueResponse unmarshall(DescribeExpressConnectTrafficQosQueueResponse describeExpressConnectTrafficQosQueueResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectTrafficQosQueueResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.RequestId"));

		List<QueueListItem> queueList = new ArrayList<QueueListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList.Length"); i++) {
			QueueListItem queueListItem = new QueueListItem();
			queueListItem.setQosId(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].QosId"));
			queueListItem.setQueueId(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].QueueId"));
			queueListItem.setQueueType(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].QueueType"));
			queueListItem.setBandwidthPercent(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].BandwidthPercent"));
			queueListItem.setQueueName(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].QueueName"));
			queueListItem.setQueueDescription(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].QueueDescription"));
			queueListItem.setStatus(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].Status"));

			List<RuleListItem> ruleList = new ArrayList<RuleListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList.Length"); j++) {
				RuleListItem ruleListItem = new RuleListItem();
				ruleListItem.setQosId(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].QosId"));
				ruleListItem.setQueueId(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].QueueId"));
				ruleListItem.setPriority(_ctx.integerValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].Priority"));
				ruleListItem.setBizProtocol(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].Protocol"));
				ruleListItem.setSrcCidr(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].SrcCidr"));
				ruleListItem.setDstCidr(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].DstCidr"));
				ruleListItem.setSrcIPv6Cidr(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].SrcIPv6Cidr"));
				ruleListItem.setDstIPv6Cidr(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].DstIPv6Cidr"));
				ruleListItem.setSrcPortRange(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].SrcPortRange"));
				ruleListItem.setDstPortRange(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].DstPortRange"));
				ruleListItem.setMatchDscp(_ctx.integerValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].MatchDscp"));
				ruleListItem.setRemarkingDscp(_ctx.integerValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].RemarkingDscp"));
				ruleListItem.setRuleName(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].RuleName"));
				ruleListItem.setRuleDescription(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].RuleDescription"));
				ruleListItem.setRuleId(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].RuleId"));
				ruleListItem.setStatus(_ctx.stringValue("DescribeExpressConnectTrafficQosQueueResponse.QueueList["+ i +"].RuleList["+ j +"].Status"));

				ruleList.add(ruleListItem);
			}
			queueListItem.setRuleList(ruleList);

			queueList.add(queueListItem);
		}
		describeExpressConnectTrafficQosQueueResponse.setQueueList(queueList);
	 
	 	return describeExpressConnectTrafficQosQueueResponse;
	}
}