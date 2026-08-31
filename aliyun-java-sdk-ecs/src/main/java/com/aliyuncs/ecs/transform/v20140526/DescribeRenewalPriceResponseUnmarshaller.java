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

import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Coupon12;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Coupon12.AdditionalInfo14;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.DepreciateInfo10;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.Rule11;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Promotion8;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice15;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice15.DepreciateInfo17;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice15.Promotion19;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon.AdditionalInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotion;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrice;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrice.Promotion2;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRenewalPriceResponseUnmarshaller {

	public static DescribeRenewalPriceResponse unmarshall(DescribeRenewalPriceResponse describeRenewalPriceResponse, UnmarshallerContext _ctx) {
		
		describeRenewalPriceResponse.setRequestId(_ctx.stringValue("DescribeRenewalPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		RelatedPrice relatedPrice = new RelatedPrice();

		MarketplaceImagePrice marketplaceImagePrice = new MarketplaceImagePrice();
		marketplaceImagePrice.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.OriginalPrice"));
		marketplaceImagePrice.setCurrency(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Currency"));
		marketplaceImagePrice.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.DiscountPrice"));
		marketplaceImagePrice.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.TradePrice"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].DiscountOff"));
			promotion.setType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].Type"));
			promotion.setRuleId(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].RuleId"));
			promotion.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotions["+ i +"].Name"));

			promotions.add(promotion);
		}
		marketplaceImagePrice.setPromotions(promotions);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].CouponNo"));
			coupon.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].DiscountOff"));
			coupon.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Description"));
			coupon.setIsSelected(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].IsSelected"));
			coupon.setOptionCode(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].OptionCode"));
			coupon.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Name"));
			coupon.setEffective(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].Effective"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon.setRuleIds(ruleIds);

			AdditionalInfo additionalInfo = new AdditionalInfo();
			additionalInfo.setVoucherTotalAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			additionalInfo.setEndTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo.setUpperLimitAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo.setCouponType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo.setAvailableAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo.setIneffectiveReason(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo.setDiscountRate(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo.setCertainAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			coupon.setAdditionalInfo(additionalInfo);

			coupons.add(coupon);
		}
		marketplaceImagePrice.setCoupons(coupons);

		List<SubPrice> subPrices = new ArrayList<SubPrice>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices.Length"); i++) {
			SubPrice subPrice = new SubPrice();
			subPrice.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].OriginalPrice"));
			subPrice.setInstanceId(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].InstanceId"));
			subPrice.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].DiscountPrice"));
			subPrice.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].TradePrice"));

			List<String> ruleIdSet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].RuleIdSet.Length"); j++) {
				ruleIdSet.add(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].RuleIdSet["+ j +"]"));
			}
			subPrice.setRuleIdSet(ruleIdSet);

			List<Promotion2> promotions1 = new ArrayList<Promotion2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].Promotions.Length"); j++) {
				Promotion2 promotion2 = new Promotion2();
				promotion2.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].Promotions["+ j +"].DiscountOff"));
				promotion2.setType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].Promotions["+ j +"].Type"));
				promotion2.setRemainQuota(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].Promotions["+ j +"].RemainQuota"));
				promotion2.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].Promotions["+ j +"].Name"));

				List<Long> ruleIds3 = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].Promotions["+ j +"].RuleIds.Length"); k++) {
					ruleIds3.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.SubPrices["+ i +"].Promotions["+ j +"].RuleIds["+ k +"]"));
				}
				promotion2.setRuleIds3(ruleIds3);

				promotions1.add(promotion2);
			}
			subPrice.setPromotions1(promotions1);

			subPrices.add(subPrice);
		}
		marketplaceImagePrice.setSubPrices(subPrices);
		relatedPrice.setMarketplaceImagePrice(marketplaceImagePrice);
		priceInfo.setRelatedPrice(relatedPrice);

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.StandardPrice"));
		price.setStandardDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.StandardDiscountPrice"));
		price.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.TradePrice"));
		price.setIsContractPromotion(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.IsContractPromotion"));
		price.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setCurrency(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Currency"));

		List<String> ruleIdSet4 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.RuleIdSet.Length"); i++) {
			ruleIdSet4.add(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.RuleIdSet["+ i +"]"));
		}
		price.setRuleIdSet4(ruleIdSet4);

		DepreciateInfo depreciateInfo = new DepreciateInfo();
		depreciateInfo.setCheapStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.CheapStandardPrice"));
		depreciateInfo.setCheapRate(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.CheapRate"));
		depreciateInfo.setDifferentialName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialName"));
		depreciateInfo.setMonthPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.MonthPrice"));
		depreciateInfo.setOriginalStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.OriginalStandardPrice"));
		depreciateInfo.setDifferentialPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialPrice"));
		depreciateInfo.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.StartTime"));
		depreciateInfo.setIsShow(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.IsShow"));
		depreciateInfo.setListPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.ListPrice"));
		price.setDepreciateInfo(depreciateInfo);

		List<Promotion8> promotions5 = new ArrayList<Promotion8>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion8 promotion8 = new Promotion8();
			promotion8.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].DiscountOff"));
			promotion8.setType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].Type"));
			promotion8.setRemainQuota(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RemainQuota"));
			promotion8.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].Name"));

			List<Long> ruleIds9 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds9.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion8.setRuleIds9(ruleIds9);

			promotions5.add(promotion8);
		}
		price.setPromotions5(promotions5);

		List<DetailInfo> detailInfos = new ArrayList<DetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos.Length"); i++) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].OriginalPrice"));
			detailInfo.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DiscountPrice"));
			detailInfo.setResource(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Resource"));
			detailInfo.setStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardPrice"));
			detailInfo.setStandardDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardDiscountPrice"));
			detailInfo.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].TradePrice"));
			detailInfo.setIsContractPromotion(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].IsContractPromotion"));

			DepreciateInfo10 depreciateInfo10 = new DepreciateInfo10();
			depreciateInfo10.setCheapStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo10.setCheapRate(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo10.setDifferentialName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo10.setMonthPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo10.setOriginalStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo10.setDifferentialPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo10.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.StartTime"));
			depreciateInfo10.setIsShow(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo10.setListPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.ListPrice"));
			detailInfo.setDepreciateInfo10(depreciateInfo10);

			List<Rule11> subRules = new ArrayList<Rule11>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule11 rule11 = new Rule11();
				rule11.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].Description"));
				rule11.setRuleId(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule11);
			}
			detailInfo.setSubRules(subRules);

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setValue(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Value"));
				attribute.setCode(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Code"));

				attributes.add(attribute);
			}
			detailInfo.setAttributes(attributes);

			detailInfos.add(detailInfo);
		}
		price.setDetailInfos(detailInfos);

		List<Coupon12> coupons6 = new ArrayList<Coupon12>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons.Length"); i++) {
			Coupon12 coupon12 = new Coupon12();
			coupon12.setCouponNo(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].CouponNo"));
			coupon12.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].DiscountOff"));
			coupon12.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Description"));
			coupon12.setIsSelected(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].IsSelected"));
			coupon12.setOptionCode(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].OptionCode"));
			coupon12.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Name"));
			coupon12.setEffective(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Effective"));

			List<Long> ruleIds13 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds13.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon12.setRuleIds13(ruleIds13);

			AdditionalInfo14 additionalInfo14 = new AdditionalInfo14();
			additionalInfo14.setVoucherTotalAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			additionalInfo14.setEndTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo14.setUpperLimitAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo14.setCouponType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo14.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo14.setAvailableAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo14.setIneffectiveReason(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo14.setDiscountRate(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo14.setCertainAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			coupon12.setAdditionalInfo14(additionalInfo14);

			coupons6.add(coupon12);
		}
		price.setCoupons6(coupons6);

		List<SubPrice15> subPrices7 = new ArrayList<SubPrice15>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices.Length"); i++) {
			SubPrice15 subPrice15 = new SubPrice15();
			subPrice15.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].OriginalPrice"));
			subPrice15.setInstanceId(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].InstanceId"));
			subPrice15.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DiscountPrice"));
			subPrice15.setStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].StandardPrice"));
			subPrice15.setStandardDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].StandardDiscountPrice"));
			subPrice15.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].TradePrice"));
			subPrice15.setIsContractPromotion(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].IsContractPromotion"));

			List<String> ruleIdSet16 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].RuleIdSet.Length"); j++) {
				ruleIdSet16.add(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].RuleIdSet["+ j +"]"));
			}
			subPrice15.setRuleIdSet16(ruleIdSet16);

			DepreciateInfo17 depreciateInfo17 = new DepreciateInfo17();
			depreciateInfo17.setCheapStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo17.setCheapRate(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo17.setDifferentialName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo17.setMonthPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo17.setOriginalStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo17.setDifferentialPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo17.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.StartTime"));
			depreciateInfo17.setIsShow(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo17.setListPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.ListPrice"));
			subPrice15.setDepreciateInfo17(depreciateInfo17);

			List<Promotion19> promotions18 = new ArrayList<Promotion19>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions.Length"); j++) {
				Promotion19 promotion19 = new Promotion19();
				promotion19.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].DiscountOff"));
				promotion19.setType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].Type"));
				promotion19.setRemainQuota(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RemainQuota"));
				promotion19.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].Name"));

				List<Long> ruleIds20 = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RuleIds.Length"); k++) {
					ruleIds20.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RuleIds["+ k +"]"));
				}
				promotion19.setRuleIds20(ruleIds20);

				promotions18.add(promotion19);
			}
			subPrice15.setPromotions18(promotions18);

			subPrices7.add(subPrice15);
		}
		price.setSubPrices7(subPrices7);
		priceInfo.setPrice(price);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setMsg(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.PriceWarning.Msg"));
		priceWarning.setCode(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.PriceWarning.Code"));
		priceInfo.setPriceWarning(priceWarning);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Rules["+ i +"].Description"));
			rule.setRuleId(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describeRenewalPriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeRenewalPriceResponse;
	}
}