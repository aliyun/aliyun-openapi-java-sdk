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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.BagUsage;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.Order;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigurationPriceResponseUnmarshaller {

	public static DescribeConfigurationPriceResponse unmarshall(DescribeConfigurationPriceResponse describeConfigurationPriceResponse, UnmarshallerContext _ctx) {
		
		describeConfigurationPriceResponse.setRequestId(_ctx.stringValue("DescribeConfigurationPriceResponse.RequestId"));
		describeConfigurationPriceResponse.setMessage(_ctx.stringValue("DescribeConfigurationPriceResponse.Message"));
		describeConfigurationPriceResponse.setTraceId(_ctx.stringValue("DescribeConfigurationPriceResponse.TraceId"));
		describeConfigurationPriceResponse.setErrorCode(_ctx.stringValue("DescribeConfigurationPriceResponse.ErrorCode"));
		describeConfigurationPriceResponse.setCode(_ctx.stringValue("DescribeConfigurationPriceResponse.Code"));
		describeConfigurationPriceResponse.setSuccess(_ctx.booleanValue("DescribeConfigurationPriceResponse.Success"));

		Data data = new Data();

		BagUsage bagUsage = new BagUsage();
		bagUsage.setCpu(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.BagUsage.Cpu"));
		bagUsage.setMem(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.BagUsage.Mem"));
		data.setBagUsage(bagUsage);

		Order order = new Order();
		order.setOriginalAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.Order.OriginalAmount"));
		order.setDiscountAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.Order.DiscountAmount"));
		order.setTradeAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.Order.TradeAmount"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationPriceResponse.Data.Order.RuleIds.Length"); i++) {
			ruleIds.add(_ctx.stringValue("DescribeConfigurationPriceResponse.Data.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds(ruleIds);
		data.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationPriceResponse.Data.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(_ctx.longValue("DescribeConfigurationPriceResponse.Data.Rules["+ i +"].RuleDescId"));
			rule.setName(_ctx.stringValue("DescribeConfigurationPriceResponse.Data.Rules["+ i +"].Name"));

			rules.add(rule);
		}
		data.setRules(rules);
		describeConfigurationPriceResponse.setData(data);
	 
	 	return describeConfigurationPriceResponse;
	}
}