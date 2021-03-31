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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceModificationPriceResponseUnmarshaller {

	public static DescribeInstanceModificationPriceResponse unmarshall(DescribeInstanceModificationPriceResponse describeInstanceModificationPriceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceModificationPriceResponse.setRequestId(_ctx.stringValue("DescribeInstanceModificationPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setTradePrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.TradePrice"));
		price.setCurrency(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Currency"));
		priceInfo.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setDescription(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describeInstanceModificationPriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeInstanceModificationPriceResponse;
	}
}