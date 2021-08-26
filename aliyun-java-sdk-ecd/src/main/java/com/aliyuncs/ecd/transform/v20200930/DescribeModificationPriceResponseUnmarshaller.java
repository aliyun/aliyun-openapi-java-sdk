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

import com.aliyuncs.ecd.model.v20200930.DescribeModificationPriceResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeModificationPriceResponse.PriceInfo;
import com.aliyuncs.ecd.model.v20200930.DescribeModificationPriceResponse.PriceInfo.Price;
import com.aliyuncs.ecd.model.v20200930.DescribeModificationPriceResponse.PriceInfo.Price.Promotion;
import com.aliyuncs.ecd.model.v20200930.DescribeModificationPriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModificationPriceResponseUnmarshaller {

	public static DescribeModificationPriceResponse unmarshall(DescribeModificationPriceResponse describeModificationPriceResponse, UnmarshallerContext _ctx) {
		
		describeModificationPriceResponse.setRequestId(_ctx.stringValue("DescribeModificationPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribeModificationPriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribeModificationPriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setCurrency(_ctx.stringValue("DescribeModificationPriceResponse.PriceInfo.Price.Currency"));
		price.setTradePrice(_ctx.floatValue("DescribeModificationPriceResponse.PriceInfo.Price.TradePrice"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModificationPriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setPromotionDesc(_ctx.stringValue("DescribeModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionDesc"));
			promotion.setOptionCode(_ctx.stringValue("DescribeModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].OptionCode"));
			promotion.setSelected(_ctx.booleanValue("DescribeModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].Selected"));
			promotion.setPromotionId(_ctx.stringValue("DescribeModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionId"));
			promotion.setPromotionName(_ctx.stringValue("DescribeModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].PromotionName"));

			promotions.add(promotion);
		}
		price.setPromotions(promotions);
		priceInfo.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModificationPriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setDescription(_ctx.stringValue("DescribeModificationPriceResponse.PriceInfo.Rules["+ i +"].Description"));
			rule.setRuleId(_ctx.longValue("DescribeModificationPriceResponse.PriceInfo.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describeModificationPriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeModificationPriceResponse;
	}
}