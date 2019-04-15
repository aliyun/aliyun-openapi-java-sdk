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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.DescribeEipPriceResponse;
import com.aliyuncs.ecsinc.model.v20160314.DescribeEipPriceResponse.PriceInfo;
import com.aliyuncs.ecsinc.model.v20160314.DescribeEipPriceResponse.PriceInfo.Order;
import com.aliyuncs.ecsinc.model.v20160314.DescribeEipPriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEipPriceResponseUnmarshaller {

	public static DescribeEipPriceResponse unmarshall(DescribeEipPriceResponse describeEipPriceResponse, UnmarshallerContext context) {
		
		describeEipPriceResponse.setRequestId(context.stringValue("DescribeEipPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Order order = new Order();
		order.setOriginalPrice(context.floatValue("DescribeEipPriceResponse.PriceInfo.Order.OriginalPrice"));
		order.setDiscountPrice(context.floatValue("DescribeEipPriceResponse.PriceInfo.Order.DiscountPrice"));
		order.setTradePrice(context.floatValue("DescribeEipPriceResponse.PriceInfo.Order.TradePrice"));
		order.setCurrency(context.stringValue("DescribeEipPriceResponse.PriceInfo.Order.Currency"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEipPriceResponse.PriceInfo.Order.RuleIdSet.Length"); i++) {
			ruleIdSet.add(context.stringValue("DescribeEipPriceResponse.PriceInfo.Order.RuleIdSet["+ i +"]"));
		}
		order.setRuleIdSet(ruleIdSet);
		priceInfo.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeEipPriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("DescribeEipPriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setTitle(context.stringValue("DescribeEipPriceResponse.PriceInfo.Rules["+ i +"].Title"));
			rule.setName(context.stringValue("DescribeEipPriceResponse.PriceInfo.Rules["+ i +"].Name"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describeEipPriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeEipPriceResponse;
	}
}