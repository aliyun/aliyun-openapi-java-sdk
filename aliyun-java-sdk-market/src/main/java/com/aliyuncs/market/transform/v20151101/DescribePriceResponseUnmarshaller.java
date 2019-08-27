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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.DescribePriceResponse;
import com.aliyuncs.market.model.v20151101.DescribePriceResponse.PromotionRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setProductCode(_ctx.stringValue("DescribePriceResponse.ProductCode"));
		describePriceResponse.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.OriginalPrice"));
		describePriceResponse.setTradePrice(_ctx.floatValue("DescribePriceResponse.TradePrice"));
		describePriceResponse.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.DiscountPrice"));

		List<PromotionRule> promotionRules = new ArrayList<PromotionRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PromotionRules.Length"); i++) {
			PromotionRule promotionRule = new PromotionRule();
			promotionRule.setRuleId(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].RuleId"));
			promotionRule.setName(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].Name"));
			promotionRule.setTitle(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].Title"));

			promotionRules.add(promotionRule);
		}
		describePriceResponse.setPromotionRules(promotionRules);
	 
	 	return describePriceResponse;
	}
}