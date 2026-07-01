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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupon;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupon.AdditionalInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfo.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfo.Rule1;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotion;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon6;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon6.AdditionalInfo8;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotion5;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceModificationPriceResponseUnmarshaller {

	public static DescribeInstanceModificationPriceResponse unmarshall(DescribeInstanceModificationPriceResponse describeInstanceModificationPriceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceModificationPriceResponse.setRequestId(_ctx.stringValue("DescribeInstanceModificationPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setCurrency(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Currency"));
		price.setTradePrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.TradePrice"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.RuleIdSet["+ i +"]"));
		}
		price.setRuleIdSet(ruleIdSet);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setIsSelected(_ctx.booleanValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].IsSelected"));
			coupon.setCouponNo(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].CouponNo"));
			coupon.setDescription(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].Description"));
			coupon.setName(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].Name"));
			coupon.setDiscountOff(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].DiscountOff"));
			coupon.setOptionCode(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].OptionCode"));
			coupon.setEffective(_ctx.booleanValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].Effective"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon.setRuleIds(ruleIds);

			AdditionalInfo additionalInfo = new AdditionalInfo();
			additionalInfo.setCouponType(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo.setAvailableAmount(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo.setUpperLimitAmount(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo.setStartTime(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo.setEndTime(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo.setIneffectiveReason(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo.setDiscountRate(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo.setCertainAmount(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			additionalInfo.setVoucherTotalAmount(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			coupon.setAdditionalInfo(additionalInfo);

			coupons.add(coupon);
		}
		price.setCoupons(coupons);

		List<DetailInfo> detailInfos = new ArrayList<DetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos.Length"); i++) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setResource(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Resource"));
			detailInfo.setOriginalPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].OriginalPrice"));
			detailInfo.setDiscountPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DiscountPrice"));
			detailInfo.setTradePrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].TradePrice"));

			List<Rule1> subRules = new ArrayList<Rule1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule1 rule1 = new Rule1();
				rule1.setDescription(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].Description"));
				rule1.setRuleId(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule1);
			}
			detailInfo.setSubRules(subRules);

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setCode(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Code"));
				attribute.setValue(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Value"));

				attributes.add(attribute);
			}
			detailInfo.setAttributes(attributes);

			detailInfos.add(detailInfo);
		}
		price.setDetailInfos(detailInfos);

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setName(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].Name"));
			promotion.setDiscountOff(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].DiscountOff"));
			promotion.setType(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].Type"));
			promotion.setRemainQuota(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].RemainQuota"));

			List<Long> ruleIds2 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds2.add(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion.setRuleIds2(ruleIds2);

			promotions.add(promotion);
		}
		price.setPromotions(promotions);
		priceInfo.setPrice(price);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setMsg(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.PriceWarning.Msg"));
		priceWarning.setCode(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.PriceWarning.Code"));
		priceInfo.setPriceWarning(priceWarning);

		RelatedPrice relatedPrice = new RelatedPrice();

		MarketplaceImagePrice marketplaceImagePrice = new MarketplaceImagePrice();
		marketplaceImagePrice.setCurrency(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Currency"));
		marketplaceImagePrice.setOriginalPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.OriginalPrice"));
		marketplaceImagePrice.setDiscountPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.DiscountPrice"));
		marketplaceImagePrice.setTradePrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.TradePrice"));

		List<Promotion5> promotions3 = new ArrayList<Promotion5>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions.Length"); i++) {
			Promotion5 promotion5 = new Promotion5();
			promotion5.setRuleId(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].RuleId"));
			promotion5.setName(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].Name"));
			promotion5.setDiscountOff(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].DiscountOff"));
			promotion5.setType(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].Type"));

			promotions3.add(promotion5);
		}
		marketplaceImagePrice.setPromotions3(promotions3);

		List<Coupon6> coupons4 = new ArrayList<Coupon6>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons.Length"); i++) {
			Coupon6 coupon6 = new Coupon6();
			coupon6.setCouponNo(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].CouponNo"));
			coupon6.setDiscountOff(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].DiscountOff"));
			coupon6.setDescription(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Description"));
			coupon6.setIsSelected(_ctx.booleanValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].IsSelected"));
			coupon6.setOptionCode(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].OptionCode"));
			coupon6.setName(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Name"));
			coupon6.setEffective(_ctx.booleanValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Effective"));

			List<Long> ruleIds7 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds7.add(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon6.setRuleIds7(ruleIds7);

			AdditionalInfo8 additionalInfo8 = new AdditionalInfo8();
			additionalInfo8.setCouponType(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo8.setAvailableAmount(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo8.setUpperLimitAmount(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo8.setStartTime(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo8.setEndTime(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo8.setIneffectiveReason(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo8.setDiscountRate(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo8.setCertainAmount(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			additionalInfo8.setVoucherTotalAmount(_ctx.doubleValue("DescribeInstanceModificationPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			coupon6.setAdditionalInfo8(additionalInfo8);

			coupons4.add(coupon6);
		}
		marketplaceImagePrice.setCoupons4(coupons4);
		relatedPrice.setMarketplaceImagePrice(marketplaceImagePrice);
		priceInfo.setRelatedPrice(relatedPrice);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setDescription(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Rules["+ i +"].Description"));
			rule.setRuleId(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describeInstanceModificationPriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeInstanceModificationPriceResponse;
	}
}