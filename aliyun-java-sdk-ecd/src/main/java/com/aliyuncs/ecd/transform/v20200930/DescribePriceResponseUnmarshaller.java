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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribePriceResponse;
import com.aliyuncs.ecd.model.v20200930.DescribePriceResponse.PriceInfo;
import com.aliyuncs.ecd.model.v20200930.DescribePriceResponse.PriceInfo.Price;
import com.aliyuncs.ecd.model.v20200930.DescribePriceResponse.PriceInfo.Price.Promotion;
import com.aliyuncs.ecd.model.v20200930.DescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();
		priceInfo.setFreeCdsQuota(_ctx.booleanValue("DescribePriceResponse.PriceInfo.FreeCdsQuota"));
		priceInfo.setFreeCdsSize(_ctx.longValue("DescribePriceResponse.PriceInfo.FreeCdsSize"));

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Currency"));
		price.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.TradePrice"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setPromotionDesc(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionDesc"));
			promotion.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].OptionCode"));
			promotion.setSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Selected"));
			promotion.setPromotionId(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionId"));
			promotion.setPromotionName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionName"));

			promotions.add(promotion);
		}
		price.setPromotions(promotions);
		priceInfo.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Description"));
			rule.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describePriceResponse.setPriceInfo(priceInfo);
	 
	 	return describePriceResponse;
	}
}