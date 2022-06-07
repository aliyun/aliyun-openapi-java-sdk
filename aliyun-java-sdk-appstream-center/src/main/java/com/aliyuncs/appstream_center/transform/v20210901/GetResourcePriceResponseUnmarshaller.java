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

import com.aliyuncs.appstream_center.model.v20210901.GetResourcePriceResponse;
import com.aliyuncs.appstream_center.model.v20210901.GetResourcePriceResponse.PriceModel;
import com.aliyuncs.appstream_center.model.v20210901.GetResourcePriceResponse.PriceModel.Price;
import com.aliyuncs.appstream_center.model.v20210901.GetResourcePriceResponse.PriceModel.Price.Promotion;
import com.aliyuncs.appstream_center.model.v20210901.GetResourcePriceResponse.PriceModel.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourcePriceResponseUnmarshaller {

	public static GetResourcePriceResponse unmarshall(GetResourcePriceResponse getResourcePriceResponse, UnmarshallerContext _ctx) {
		
		getResourcePriceResponse.setRequestId(_ctx.stringValue("GetResourcePriceResponse.RequestId"));
		getResourcePriceResponse.setCode(_ctx.stringValue("GetResourcePriceResponse.Code"));
		getResourcePriceResponse.setMessage(_ctx.stringValue("GetResourcePriceResponse.Message"));

		PriceModel priceModel = new PriceModel();

		Price price = new Price();
		price.setOriginalPrice(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Price.DiscountPrice"));
		price.setTradePrice(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Price.TradePrice"));
		price.setCurrency(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Price.Currency"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("GetResourcePriceResponse.PriceModel.Price.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setOptionCode(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Price.Promotions["+ i +"].OptionCode"));
			promotion.setPromotionId(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Price.Promotions["+ i +"].PromotionId"));
			promotion.setPromotionName(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Price.Promotions["+ i +"].PromotionName"));
			promotion.setPromotionDesc(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Price.Promotions["+ i +"].PromotionDesc"));
			promotion.setSelected(_ctx.booleanValue("GetResourcePriceResponse.PriceModel.Price.Promotions["+ i +"].Selected"));

			promotions.add(promotion);
		}
		price.setPromotions(promotions);
		priceModel.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("GetResourcePriceResponse.PriceModel.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("GetResourcePriceResponse.PriceModel.Rules["+ i +"].RuleId"));
			rule.setDescription(_ctx.stringValue("GetResourcePriceResponse.PriceModel.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		priceModel.setRules(rules);
		getResourcePriceResponse.setPriceModel(priceModel);
	 
	 	return getResourcePriceResponse;
	}
}