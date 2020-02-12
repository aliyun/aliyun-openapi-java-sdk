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

import com.aliyuncs.rtc.model.v20180111.DescribeMAURuleResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeMAURuleResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMAURuleResponseUnmarshaller {

	public static DescribeMAURuleResponse unmarshall(DescribeMAURuleResponse describeMAURuleResponse, UnmarshallerContext _ctx) {
		
		describeMAURuleResponse.setRequestId(_ctx.stringValue("DescribeMAURuleResponse.RequestId"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMAURuleResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("DescribeMAURuleResponse.Rules["+ i +"].RuleId"));
			rule.setChannelPrefix(_ctx.stringValue("DescribeMAURuleResponse.Rules["+ i +"].ChannelPrefix"));
			rule.setUseridPrefix(_ctx.stringValue("DescribeMAURuleResponse.Rules["+ i +"].UseridPrefix"));
			rule.setTemplateId(_ctx.longValue("DescribeMAURuleResponse.Rules["+ i +"].TemplateId"));
			rule.setCallBack(_ctx.stringValue("DescribeMAURuleResponse.Rules["+ i +"].CallBack"));
			rule.setIsEnable(_ctx.integerValue("DescribeMAURuleResponse.Rules["+ i +"].IsEnable"));

			rules.add(rule);
		}
		describeMAURuleResponse.setRules(rules);
	 
	 	return describeMAURuleResponse;
	}
}