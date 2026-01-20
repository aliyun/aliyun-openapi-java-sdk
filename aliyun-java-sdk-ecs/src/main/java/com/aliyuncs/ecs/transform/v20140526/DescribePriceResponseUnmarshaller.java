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
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.Coupon.AdditionalInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DepreciateInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Coupon5;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Coupon5.AdditionalInfo6;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.DepreciateInfo1;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Promotion;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Rule4;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.Promotion7;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon10;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon10.AdditionalInfo12;
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
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].CouponNo"));
			coupon.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].DiscountOff"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Description"));
			coupon.setIsSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].IsSelected"));
			coupon.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].OptionCode"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Name"));
			coupon.setEffective(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Effective"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon.setRuleIds(ruleIds);

			AdditionalInfo additionalInfo = new AdditionalInfo();
			additionalInfo.setCouponType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo.setAvailableAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo.setUpperLimitAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo.setEndTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo.setIneffectiveReason(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo.setDiscountRate(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo.setCertainAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			additionalInfo.setVoucherTotalAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			coupon.setAdditionalInfo(additionalInfo);

			coupons.add(coupon);
		}
		price.setCoupons(coupons);

		List<DetailInfo> detailInfos = new ArrayList<DetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos.Length"); i++) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].OriginalPrice"));
			detailInfo.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DiscountPrice"));
			detailInfo.setResource(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Resource"));
			detailInfo.setStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardPrice"));
			detailInfo.setStandardDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardDiscountPrice"));
			detailInfo.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].TradePrice"));
			detailInfo.setIsContractPromotion(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].IsContractPromotion"));

			DepreciateInfo1 depreciateInfo1 = new DepreciateInfo1();
			depreciateInfo1.setCheapStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo1.setCheapRate(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo1.setDifferentialName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo1.setMonthPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo1.setOriginalStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo1.setDifferentialPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo1.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.StartTime"));
			depreciateInfo1.setIsShow(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo1.setListPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.ListPrice"));
			detailInfo.setDepreciateInfo1(depreciateInfo1);

			List<Rule4> subRules = new ArrayList<Rule4>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule4 rule4 = new Rule4();
				rule4.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].Description"));
				rule4.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule4);
			}
			detailInfo.setSubRules(subRules);

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setValue(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Value"));
				attribute.setCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Code"));

				attributes.add(attribute);
			}
			detailInfo.setAttributes(attributes);

			List<Promotion> promotions2 = new ArrayList<Promotion>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions.Length"); j++) {
				Promotion promotion = new Promotion();
				promotion.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].RuleId"));
				promotion.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].Name"));
				promotion.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].DiscountOff"));
				promotion.setType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].Type"));

				promotions2.add(promotion);
			}
			detailInfo.setPromotions2(promotions2);

			List<Coupon5> coupons3 = new ArrayList<Coupon5>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons.Length"); j++) {
				Coupon5 coupon5 = new Coupon5();
				coupon5.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].CouponNo"));
				coupon5.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].Name"));
				coupon5.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].DiscountOff"));

				AdditionalInfo6 additionalInfo6 = new AdditionalInfo6();
				additionalInfo6.setCouponType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.CouponType"));
				additionalInfo6.setAvailableAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.AvailableAmount"));
				additionalInfo6.setUpperLimitAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.UpperLimitAmount"));
				additionalInfo6.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.StartTime"));
				additionalInfo6.setEndTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.EndTime"));
				additionalInfo6.setIneffectiveReason(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.IneffectiveReason"));
				additionalInfo6.setDiscountRate(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.DiscountRate"));
				additionalInfo6.setCertainAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.CertainAmount"));
				additionalInfo6.setVoucherTotalAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.VoucherTotalAmount"));
				coupon5.setAdditionalInfo6(additionalInfo6);

				coupons3.add(coupon5);
			}
			detailInfo.setCoupons3(coupons3);

			detailInfos.add(detailInfo);
		}
		price.setDetailInfos(detailInfos);

		List<Promotion7> promotions = new ArrayList<Promotion7>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion7 promotion7 = new Promotion7();
			promotion7.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].DiscountOff"));
			promotion7.setType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Type"));
			promotion7.setRemainQuota(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RemainQuota"));
			promotion7.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Name"));

			List<Long> ruleIds8 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds8.add(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion7.setRuleIds8(ruleIds8);

			promotions.add(promotion7);
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

		List<Coupon10> coupons9 = new ArrayList<Coupon10>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons.Length"); i++) {
			Coupon10 coupon10 = new Coupon10();
			coupon10.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].CouponNo"));
			coupon10.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].DiscountOff"));
			coupon10.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Description"));
			coupon10.setIsSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].IsSelected"));
			coupon10.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].OptionCode"));
			coupon10.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Name"));
			coupon10.setEffective(_ctx.booleanValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Effective"));

			List<Long> ruleIds11 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds11.add(_ctx.longValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon10.setRuleIds11(ruleIds11);

			AdditionalInfo12 additionalInfo12 = new AdditionalInfo12();
			additionalInfo12.setCouponType(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo12.setAvailableAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo12.setUpperLimitAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo12.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo12.setEndTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo12.setIneffectiveReason(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo12.setDiscountRate(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo12.setCertainAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			additionalInfo12.setVoucherTotalAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			coupon10.setAdditionalInfo12(additionalInfo12);

			coupons9.add(coupon10);
		}
		marketplaceImagePrice.setCoupons9(coupons9);
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