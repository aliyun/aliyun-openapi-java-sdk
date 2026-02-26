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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.GetResourceRenewPriceResponse;
import com.aliyuncs.appstream_center.model.v20210901.GetResourceRenewPriceResponse.Data;
import com.aliyuncs.appstream_center.model.v20210901.GetResourceRenewPriceResponse.Data.Price;
import com.aliyuncs.appstream_center.model.v20210901.GetResourceRenewPriceResponse.Data.Price.Promotion;
import com.aliyuncs.appstream_center.model.v20210901.GetResourceRenewPriceResponse.Data.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceRenewPriceResponseUnmarshaller {

	public static GetResourceRenewPriceResponse unmarshall(GetResourceRenewPriceResponse getResourceRenewPriceResponse, UnmarshallerContext _ctx) {
		
		getResourceRenewPriceResponse.setRequestId(_ctx.stringValue("GetResourceRenewPriceResponse.RequestId"));

		Data data = new Data();

		Price price = new Price();
		price.setOriginalPrice(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Price.DiscountPrice"));
		price.setTradePrice(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Price.TradePrice"));
		price.setCurrency(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Price.Currency"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceRenewPriceResponse.Data.Price.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setOptionCode(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Price.Promotions["+ i +"].OptionCode"));
			promotion.setPromotionId(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Price.Promotions["+ i +"].PromotionId"));
			promotion.setPromotionName(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Price.Promotions["+ i +"].PromotionName"));
			promotion.setPromotionDesc(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Price.Promotions["+ i +"].PromotionDesc"));
			promotion.setSelected(_ctx.booleanValue("GetResourceRenewPriceResponse.Data.Price.Promotions["+ i +"].Selected"));

			promotions.add(promotion);
		}
		price.setPromotions(promotions);
		data.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceRenewPriceResponse.Data.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("GetResourceRenewPriceResponse.Data.Rules["+ i +"].RuleId"));
			rule.setDescription(_ctx.stringValue("GetResourceRenewPriceResponse.Data.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		data.setRules(rules);
		getResourceRenewPriceResponse.setData(data);
	 
	 	return getResourceRenewPriceResponse;
	}
}