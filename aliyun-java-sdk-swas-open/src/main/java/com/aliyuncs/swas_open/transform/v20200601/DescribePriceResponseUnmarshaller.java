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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribePriceResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribePriceResponse.PriceInfo;
import com.aliyuncs.swas_open.model.v20200601.DescribePriceResponse.PriceInfo.Price;
import com.aliyuncs.swas_open.model.v20200601.DescribePriceResponse.PriceInfo.Price.Coupon;
import com.aliyuncs.swas_open.model.v20200601.DescribePriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.swas_open.model.v20200601.DescribePriceResponse.PriceInfo.Price.DetailInfo.PromotionsItem;
import com.aliyuncs.swas_open.model.v20200601.DescribePriceResponse.PriceInfo.Price.Promotion;
import com.aliyuncs.swas_open.model.v20200601.DescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Currency"));
		price.setStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.StandardPrice"));
		price.setStandardDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.StandardDiscountPrice"));
		price.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.TradePrice"));
		price.setIsContractPromotion(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.IsContractPromotion"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].DiscountOff"));
			promotion.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Name"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion.setRuleIds(ruleIds);

			promotions.add(promotion);
		}
		price.setPromotions(promotions);

		List<DetailInfo> detailInfos = new ArrayList<DetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos.Length"); i++) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].OriginalPrice"));
			detailInfo.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DiscountPrice"));
			detailInfo.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].TradePrice"));
			detailInfo.setCommodityType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].CommodityType"));

			List<PromotionsItem> promotions1 = new ArrayList<PromotionsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions.Length"); j++) {
				PromotionsItem promotionsItem = new PromotionsItem();
				promotionsItem.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].DiscountOff"));
				promotionsItem.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].RuleId"));
				promotionsItem.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].Name"));

				promotions1.add(promotionsItem);
			}
			detailInfo.setPromotions1(promotions1);

			detailInfos.add(detailInfo);
		}
		price.setDetailInfos(detailInfos);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].CouponNo"));
			coupon.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].DiscountOff"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Description"));
			coupon.setIsSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].IsSelected"));
			coupon.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].OptionCode"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Name"));

			coupons.add(coupon);
		}
		price.setCoupons(coupons);
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