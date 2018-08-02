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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribePriceResponse;
import com.aliyuncs.petadata.model.v20160101.DescribePriceResponse.Order;
import com.aliyuncs.petadata.model.v20160101.DescribePriceResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext context) {
		
		describePriceResponse.setRequestId(context.stringValue("DescribePriceResponse.RequestId"));

		Order order = new Order();
		order.setOriginalAmount(context.floatValue("DescribePriceResponse.Order.OriginalAmount"));
		order.setTradeAmount(context.floatValue("DescribePriceResponse.Order.TradeAmount"));
		order.setDiscountAmount(context.floatValue("DescribePriceResponse.Order.DiscountAmount"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.Order.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("DescribePriceResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds(ruleIds);
		describePriceResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(context.longValue("DescribePriceResponse.Rules["+ i +"].RuleDescId"));
			rule.setName(context.stringValue("DescribePriceResponse.Rules["+ i +"].Name"));
			rule.setTitle(context.stringValue("DescribePriceResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		describePriceResponse.setRules(rules);
	 
	 	return describePriceResponse;
	}
}