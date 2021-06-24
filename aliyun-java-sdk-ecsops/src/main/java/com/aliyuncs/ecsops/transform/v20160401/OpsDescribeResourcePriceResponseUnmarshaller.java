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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcePriceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcePriceResponse.PriceInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcePriceResponse.PriceInfo.Price;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourcePriceResponseUnmarshaller {

	public static OpsDescribeResourcePriceResponse unmarshall(OpsDescribeResourcePriceResponse opsDescribeResourcePriceResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourcePriceResponse.setRequestId(_ctx.stringValue("OpsDescribeResourcePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setReservedInstanceHourPrice(_ctx.floatValue("OpsDescribeResourcePriceResponse.PriceInfo.Price.ReservedInstanceHourPrice"));
		price.setDiscountPrice(_ctx.floatValue("OpsDescribeResourcePriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setTradePrice(_ctx.floatValue("OpsDescribeResourcePriceResponse.PriceInfo.Price.TradePrice"));
		price.setOriginalPrice(_ctx.floatValue("OpsDescribeResourcePriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setCurrency(_ctx.stringValue("OpsDescribeResourcePriceResponse.PriceInfo.Price.Currency"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourcePriceResponse.PriceInfo.Price.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("OpsDescribeResourcePriceResponse.PriceInfo.Price.RuleIdSet["+ i +"]"));
		}
		price.setRuleIdSet(ruleIdSet);
		priceInfo.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourcePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setTitle(_ctx.stringValue("OpsDescribeResourcePriceResponse.PriceInfo.Rules["+ i +"].Title"));
			rule.setName(_ctx.stringValue("OpsDescribeResourcePriceResponse.PriceInfo.Rules["+ i +"].Name"));
			rule.setRuleId(_ctx.longValue("OpsDescribeResourcePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		opsDescribeResourcePriceResponse.setPriceInfo(priceInfo);
	 
	 	return opsDescribeResourcePriceResponse;
	}
}