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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeAutoLiveStreamRuleResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeAutoLiveStreamRuleResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoLiveStreamRuleResponseUnmarshaller {

	public static DescribeAutoLiveStreamRuleResponse unmarshall(DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRuleResponse, UnmarshallerContext _ctx) {
		
		describeAutoLiveStreamRuleResponse.setRequestId(_ctx.stringValue("DescribeAutoLiveStreamRuleResponse.RequestId"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoLiveStreamRuleResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setStatus(_ctx.stringValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].Status"));
			rule.setMediaEncode(_ctx.integerValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].MediaEncode"));
			rule.setPlayDomain(_ctx.stringValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].PlayDomain"));
			rule.setCallBack(_ctx.stringValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].CallBack"));
			rule.setCreateTime(_ctx.stringValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].CreateTime"));
			rule.setRuleId(_ctx.longValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].RuleName"));

			List<String> channelIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].ChannelIds.Length"); j++) {
				channelIds.add(_ctx.stringValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].ChannelIds["+ j +"]"));
			}
			rule.setChannelIds(channelIds);

			List<String> channelIdPrefixes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].ChannelIdPrefixes.Length"); j++) {
				channelIdPrefixes.add(_ctx.stringValue("DescribeAutoLiveStreamRuleResponse.Rules["+ i +"].ChannelIdPrefixes["+ j +"]"));
			}
			rule.setChannelIdPrefixes(channelIdPrefixes);

			rules.add(rule);
		}
		describeAutoLiveStreamRuleResponse.setRules(rules);
	 
	 	return describeAutoLiveStreamRuleResponse;
	}
}