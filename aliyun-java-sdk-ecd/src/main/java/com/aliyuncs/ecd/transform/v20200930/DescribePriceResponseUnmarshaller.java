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

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.TradePrice"));
		price.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Currency"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].OptionCode"));
			promotion.setPromotionId(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionId"));
			promotion.setPromotionName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionName"));
			promotion.setPromotionDesc(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionDesc"));
			promotion.setSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Selected"));

			promotions.add(promotion);
		}
		price.setPromotions(promotions);
		priceInfo.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describePriceResponse.setPriceInfo(priceInfo);
	 
	 	return describePriceResponse;
	}
}