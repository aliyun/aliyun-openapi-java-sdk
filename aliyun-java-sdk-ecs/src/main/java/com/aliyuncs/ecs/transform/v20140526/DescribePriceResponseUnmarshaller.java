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
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.Coupon12;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.Coupon12.AdditionalInfo14;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DepreciateInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Coupon10;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Coupon10.AdditionalInfo11;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.DepreciateInfo5;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Promotion8;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.DetailInfo.Rule9;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price.Promotion3;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon.AdditionalInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotion;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		RelatedPrice relatedPrice = new RelatedPrice();

		MarketplaceImagePrice marketplaceImagePrice = new MarketplaceImagePrice();
		marketplaceImagePrice.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.OriginalPrice"));
		marketplaceImagePrice.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Currency"));
		marketplaceImagePrice.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.DiscountPrice"));
		marketplaceImagePrice.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.TradePrice"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].DiscountOff"));
			promotion.setType(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].Type"));
			promotion.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].RuleId"));
			promotion.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].Name"));

			promotions.add(promotion);
		}
		marketplaceImagePrice.setPromotions(promotions);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].CouponNo"));
			coupon.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].DiscountOff"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Description"));
			coupon.setIsSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].IsSelected"));
			coupon.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].OptionCode"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Name"));
			coupon.setEffective(_ctx.booleanValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Effective"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon.setRuleIds(ruleIds);

			AdditionalInfo additionalInfo = new AdditionalInfo();
			additionalInfo.setVoucherTotalAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			additionalInfo.setEndTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo.setUpperLimitAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo.setCouponType(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo.setAvailableAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo.setIneffectiveReason(_ctx.stringValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo.setDiscountRate(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo.setCertainAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			coupon.setAdditionalInfo(additionalInfo);

			coupons.add(coupon);
		}
		marketplaceImagePrice.setCoupons(coupons);
		relatedPrice.setMarketplaceImagePrice(marketplaceImagePrice);
		priceInfo.setRelatedPrice(relatedPrice);

		Price price = new Price();
		price.setSpotInstanceTypeOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.SpotInstanceTypeOriginalPrice"));
		price.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setReservedInstanceHourTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.ReservedInstanceHourTradePrice"));
		price.setStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.StandardPrice"));
		price.setStandardDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.StandardDiscountPrice"));
		price.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.TradePrice"));
		price.setIsContractPromotion(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.IsContractPromotion"));
		price.setReservedInstanceHourDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.ReservedInstanceHourDiscountPrice"));
		price.setReservedInstanceHourPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.ReservedInstanceHourPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Currency"));
		price.setSpotInstanceTypePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.SpotInstanceTypePrice"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.RuleIdSet["+ i +"]"));
		}
		price.setRuleIdSet(ruleIdSet);

		DepreciateInfo depreciateInfo = new DepreciateInfo();
		depreciateInfo.setCheapStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.CheapStandardPrice"));
		depreciateInfo.setCheapRate(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.CheapRate"));
		depreciateInfo.setDifferentialName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialName"));
		depreciateInfo.setMonthPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.MonthPrice"));
		depreciateInfo.setOriginalStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.OriginalStandardPrice"));
		depreciateInfo.setDifferentialPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialPrice"));
		depreciateInfo.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.StartTime"));
		depreciateInfo.setIsShow(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.IsShow"));
		depreciateInfo.setListPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DepreciateInfo.ListPrice"));
		price.setDepreciateInfo(depreciateInfo);

		List<Promotion3> promotions1 = new ArrayList<Promotion3>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion3 promotion3 = new Promotion3();
			promotion3.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].DiscountOff"));
			promotion3.setType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Type"));
			promotion3.setRemainQuota(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RemainQuota"));
			promotion3.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].Name"));

			List<Long> ruleIds4 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds4.add(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion3.setRuleIds4(ruleIds4);

			promotions1.add(promotion3);
		}
		price.setPromotions1(promotions1);

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

			DepreciateInfo5 depreciateInfo5 = new DepreciateInfo5();
			depreciateInfo5.setCheapStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo5.setCheapRate(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo5.setDifferentialName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo5.setMonthPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo5.setOriginalStandardPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo5.setDifferentialPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo5.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.StartTime"));
			depreciateInfo5.setIsShow(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo5.setListPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.ListPrice"));
			detailInfo.setDepreciateInfo5(depreciateInfo5);

			List<Promotion8> promotions6 = new ArrayList<Promotion8>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions.Length"); j++) {
				Promotion8 promotion8 = new Promotion8();
				promotion8.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].DiscountOff"));
				promotion8.setType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].Type"));
				promotion8.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].RuleId"));
				promotion8.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Promotions["+ j +"].Name"));

				promotions6.add(promotion8);
			}
			detailInfo.setPromotions6(promotions6);

			List<Rule9> subRules = new ArrayList<Rule9>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule9 rule9 = new Rule9();
				rule9.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].Description"));
				rule9.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule9);
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

			List<Coupon10> coupons7 = new ArrayList<Coupon10>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons.Length"); j++) {
				Coupon10 coupon10 = new Coupon10();
				coupon10.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].CouponNo"));
				coupon10.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].DiscountOff"));
				coupon10.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].Name"));

				AdditionalInfo11 additionalInfo11 = new AdditionalInfo11();
				additionalInfo11.setVoucherTotalAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.VoucherTotalAmount"));
				additionalInfo11.setEndTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.EndTime"));
				additionalInfo11.setUpperLimitAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.UpperLimitAmount"));
				additionalInfo11.setCouponType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.CouponType"));
				additionalInfo11.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.StartTime"));
				additionalInfo11.setAvailableAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.AvailableAmount"));
				additionalInfo11.setIneffectiveReason(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.IneffectiveReason"));
				additionalInfo11.setDiscountRate(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.DiscountRate"));
				additionalInfo11.setCertainAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Coupons["+ j +"].AdditionalInfo.CertainAmount"));
				coupon10.setAdditionalInfo11(additionalInfo11);

				coupons7.add(coupon10);
			}
			detailInfo.setCoupons7(coupons7);

			detailInfos.add(detailInfo);
		}
		price.setDetailInfos(detailInfos);

		List<Coupon12> coupons2 = new ArrayList<Coupon12>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Coupons.Length"); i++) {
			Coupon12 coupon12 = new Coupon12();
			coupon12.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].CouponNo"));
			coupon12.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].DiscountOff"));
			coupon12.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Description"));
			coupon12.setIsSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].IsSelected"));
			coupon12.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].OptionCode"));
			coupon12.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Name"));
			coupon12.setEffective(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].Effective"));

			List<Long> ruleIds13 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds13.add(_ctx.longValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon12.setRuleIds13(ruleIds13);

			AdditionalInfo14 additionalInfo14 = new AdditionalInfo14();
			additionalInfo14.setVoucherTotalAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			additionalInfo14.setEndTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo14.setUpperLimitAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo14.setCouponType(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo14.setStartTime(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo14.setAvailableAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo14.setIneffectiveReason(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo14.setDiscountRate(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo14.setCertainAmount(_ctx.doubleValue("DescribePriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			coupon12.setAdditionalInfo14(additionalInfo14);

			coupons2.add(coupon12);
		}
		price.setCoupons2(coupons2);
		priceInfo.setPrice(price);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setMsg(_ctx.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Msg"));
		priceWarning.setCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Code"));
		priceInfo.setPriceWarning(priceWarning);

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