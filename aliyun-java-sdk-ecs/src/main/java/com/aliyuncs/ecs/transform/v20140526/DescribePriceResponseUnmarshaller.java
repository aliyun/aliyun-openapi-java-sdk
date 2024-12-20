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

import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.Coupon;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DepreciateInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.DepreciateInfo1;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Rule2;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.Promotion;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setReservedInstanceHourPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.ReservedInstanceHourPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Currency"));
		price.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.TradePrice"));
		price.setStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.StandardPrice"));
		price.setStandardDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.StandardDiscountPrice"));
		price.setIsContractPromotion(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.IsContractPromotion"));
		price.setSpotInstanceTypePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.SpotInstanceTypePrice"));
		price.setSpotInstanceTypeOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.SpotInstanceTypeOriginalPrice"));
		price.setReservedInstanceHourTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.ReservedInstanceHourTradePrice"));
		price.setReservedInstanceHourDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.ReservedInstanceHourDiscountPrice"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.RuleIdSet["+ i +"]"));
		}
		price.setRuleIdSet(ruleIdSet);

		DepreciateInfo depreciateInfo = new DepreciateInfo();
		depreciateInfo.setListPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.ListPrice"));
		depreciateInfo.setOriginalStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.OriginalStandardPrice"));
		depreciateInfo.setCheapStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.CheapStandardPrice"));
		depreciateInfo.setCheapRate(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.CheapRate"));
		depreciateInfo.setDifferentialPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialPrice"));
		depreciateInfo.setDifferentialName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialName"));
		depreciateInfo.setMonthPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.MonthPrice"));
		depreciateInfo.setIsShow(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.IsShow"));
		depreciateInfo.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.StartTime"));
		price.setDepreciateInfo(depreciateInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setIsSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].IsSelected"));
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].CouponNo"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Description"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Name"));
			coupon.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].DiscountOff"));
			coupon.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].OptionCode"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon.setRuleIds(ruleIds);

			coupons.add(coupon);
		}
		price.setCoupons(coupons);

		List<DetailInfo> detailInfos = new ArrayList<DetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos.Length"); i++) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setResource(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Resource"));
			detailInfo.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].OriginalPrice"));
			detailInfo.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DiscountPrice"));
			detailInfo.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].TradePrice"));
			detailInfo.setStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardPrice"));
			detailInfo.setStandardDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardDiscountPrice"));
			detailInfo.setIsContractPromotion(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].IsContractPromotion"));

			DepreciateInfo1 depreciateInfo1 = new DepreciateInfo1();
			depreciateInfo1.setListPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.ListPrice"));
			depreciateInfo1.setOriginalStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo1.setCheapStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo1.setCheapRate(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo1.setDifferentialPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo1.setDifferentialName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo1.setMonthPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo1.setIsShow(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo1.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.StartTime"));
			detailInfo.setDepreciateInfo1(depreciateInfo1);

			List<Rule2> subRules = new ArrayList<Rule2>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule2 rule2 = new Rule2();
				rule2.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].Description"));
				rule2.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule2);
			}
			detailInfo.setSubRules(subRules);

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Code"));
				attribute.setValue(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Value"));

				attributes.add(attribute);
			}
			detailInfo.setAttributes(attributes);

			detailInfos.add(detailInfo);
		}
		price.setDetailInfos(detailInfos);

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Name"));
			promotion.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].DiscountOff"));
			promotion.setType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Type"));
			promotion.setRemainQuota(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RemainQuota"));

			List<Long> ruleIds3 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds3.add(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion.setRuleIds3(ruleIds3);

			promotions.add(promotion);
		}
		price.setPromotions(promotions);
		priceInfo.setPrice(price);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setMsg(_ctx.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Msg"));
		priceWarning.setCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Code"));
		priceInfo.setPriceWarning(priceWarning);

		RelatedPrice relatedPrice = new RelatedPrice();

		MarketplaceImagePrice marketplaceImagePrice = new MarketplaceImagePrice();
		marketplaceImagePrice.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Currency"));
		marketplaceImagePrice.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.OriginalPrice"));
		marketplaceImagePrice.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.DiscountPrice"));
		marketplaceImagePrice.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.TradePrice"));
		relatedPrice.setMarketplaceImagePrice(marketplaceImagePrice);
		priceInfo.setRelatedPrice(relatedPrice);

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