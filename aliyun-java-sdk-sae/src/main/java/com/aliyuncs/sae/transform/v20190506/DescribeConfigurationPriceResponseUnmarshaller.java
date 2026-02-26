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
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.CpuMemPrice;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.CpuMemPrice.Order9;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.CpuMemPrice.Rule11;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.Order;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.RequestPrice;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.RequestPrice.Order1;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.RequestPrice.Rule3;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.Rule;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.TrafficPrice;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.TrafficPrice.Order5;
import com.aliyuncs.sae.model.v20190506.DescribeConfigurationPriceResponse.Data.TrafficPrice.Rule7;
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

		RequestPrice requestPrice = new RequestPrice();

		Order1 order1 = new Order1();
		order1.setOriginalAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.RequestPrice.Order.OriginalAmount"));
		order1.setDiscountAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.RequestPrice.Order.DiscountAmount"));
		order1.setTradeAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.RequestPrice.Order.TradeAmount"));

		List<String> ruleIds4 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationPriceResponse.Data.RequestPrice.Order.RuleIds.Length"); i++) {
			ruleIds4.add(_ctx.stringValue("DescribeConfigurationPriceResponse.Data.RequestPrice.Order.RuleIds["+ i +"]"));
		}
		order1.setRuleIds4(ruleIds4);
		requestPrice.setOrder1(order1);

		List<Rule3> rules2 = new ArrayList<Rule3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationPriceResponse.Data.RequestPrice.Rules.Length"); i++) {
			Rule3 rule3 = new Rule3();
			rule3.setRuleDescId(_ctx.longValue("DescribeConfigurationPriceResponse.Data.RequestPrice.Rules["+ i +"].RuleDescId"));
			rule3.setName(_ctx.stringValue("DescribeConfigurationPriceResponse.Data.RequestPrice.Rules["+ i +"].Name"));

			rules2.add(rule3);
		}
		requestPrice.setRules2(rules2);
		data.setRequestPrice(requestPrice);

		TrafficPrice trafficPrice = new TrafficPrice();

		Order5 order5 = new Order5();
		order5.setOriginalAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.TrafficPrice.Order.OriginalAmount"));
		order5.setDiscountAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.TrafficPrice.Order.DiscountAmount"));
		order5.setTradeAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.TrafficPrice.Order.TradeAmount"));

		List<String> ruleIds8 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationPriceResponse.Data.TrafficPrice.Order.RuleIds.Length"); i++) {
			ruleIds8.add(_ctx.stringValue("DescribeConfigurationPriceResponse.Data.TrafficPrice.Order.RuleIds["+ i +"]"));
		}
		order5.setRuleIds8(ruleIds8);
		trafficPrice.setOrder5(order5);

		List<Rule7> rules6 = new ArrayList<Rule7>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationPriceResponse.Data.TrafficPrice.Rules.Length"); i++) {
			Rule7 rule7 = new Rule7();
			rule7.setRuleDescId(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.TrafficPrice.Rules["+ i +"].RuleDescId"));
			rule7.setName(_ctx.stringValue("DescribeConfigurationPriceResponse.Data.TrafficPrice.Rules["+ i +"].Name"));

			rules6.add(rule7);
		}
		trafficPrice.setRules6(rules6);
		data.setTrafficPrice(trafficPrice);

		CpuMemPrice cpuMemPrice = new CpuMemPrice();

		Order9 order9 = new Order9();
		order9.setOriginalAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.CpuMemPrice.Order.OriginalAmount"));
		order9.setDiscountAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.CpuMemPrice.Order.DiscountAmount"));
		order9.setTradeAmount(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.CpuMemPrice.Order.TradeAmount"));

		List<String> ruleIds12 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationPriceResponse.Data.CpuMemPrice.Order.RuleIds.Length"); i++) {
			ruleIds12.add(_ctx.stringValue("DescribeConfigurationPriceResponse.Data.CpuMemPrice.Order.RuleIds["+ i +"]"));
		}
		order9.setRuleIds12(ruleIds12);
		cpuMemPrice.setOrder9(order9);

		List<Rule11> rules10 = new ArrayList<Rule11>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationPriceResponse.Data.CpuMemPrice.Rules.Length"); i++) {
			Rule11 rule11 = new Rule11();
			rule11.setRuleDescId(_ctx.floatValue("DescribeConfigurationPriceResponse.Data.CpuMemPrice.Rules["+ i +"].RuleDescId"));
			rule11.setName(_ctx.stringValue("DescribeConfigurationPriceResponse.Data.CpuMemPrice.Rules["+ i +"].Name"));

			rules10.add(rule11);
		}
		cpuMemPrice.setRules10(rules10);
		data.setCpuMemPrice(cpuMemPrice);

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