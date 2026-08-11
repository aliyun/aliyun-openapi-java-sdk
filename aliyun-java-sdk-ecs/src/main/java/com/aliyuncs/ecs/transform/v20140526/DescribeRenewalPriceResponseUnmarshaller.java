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
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Coupon7;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Coupon7.AdditionalInfo9;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.DepreciateInfo5;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.Rule6;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Promotion3;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice.DepreciateInfo11;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice.Promotion13;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Coupon.AdditionalInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.RelatedPrice.MarketplaceImagePrice.Promotion;
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

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.RuleIdSet["+ i +"]"));
		}
		price.setRuleIdSet(ruleIdSet);

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

		List<Promotion3> promotions1 = new ArrayList<Promotion3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion3 promotion3 = new Promotion3();
			promotion3.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].DiscountOff"));
			promotion3.setType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].Type"));
			promotion3.setRemainQuota(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RemainQuota"));
			promotion3.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].Name"));

			List<Long> ruleIds4 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds4.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion3.setRuleIds4(ruleIds4);

			promotions1.add(promotion3);
		}
		price.setPromotions1(promotions1);

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

			DepreciateInfo5 depreciateInfo5 = new DepreciateInfo5();
			depreciateInfo5.setCheapStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo5.setCheapRate(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo5.setDifferentialName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo5.setMonthPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo5.setOriginalStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo5.setDifferentialPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo5.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.StartTime"));
			depreciateInfo5.setIsShow(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo5.setListPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.ListPrice"));
			detailInfo.setDepreciateInfo5(depreciateInfo5);

			List<Rule6> subRules = new ArrayList<Rule6>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule6 rule6 = new Rule6();
				rule6.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].Description"));
				rule6.setRuleId(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule6);
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

		List<Coupon7> coupons2 = new ArrayList<Coupon7>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons.Length"); i++) {
			Coupon7 coupon7 = new Coupon7();
			coupon7.setCouponNo(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].CouponNo"));
			coupon7.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].DiscountOff"));
			coupon7.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Description"));
			coupon7.setIsSelected(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].IsSelected"));
			coupon7.setOptionCode(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].OptionCode"));
			coupon7.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Name"));
			coupon7.setEffective(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Effective"));

			List<Long> ruleIds8 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds8.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon7.setRuleIds8(ruleIds8);

			AdditionalInfo9 additionalInfo9 = new AdditionalInfo9();
			additionalInfo9.setVoucherTotalAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			additionalInfo9.setEndTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo9.setUpperLimitAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo9.setCouponType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo9.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo9.setAvailableAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo9.setIneffectiveReason(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo9.setDiscountRate(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo9.setCertainAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			coupon7.setAdditionalInfo9(additionalInfo9);

			coupons2.add(coupon7);
		}
		price.setCoupons2(coupons2);

		List<SubPrice> subPrices = new ArrayList<SubPrice>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices.Length"); i++) {
			SubPrice subPrice = new SubPrice();
			subPrice.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].OriginalPrice"));
			subPrice.setInstanceId(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].InstanceId"));
			subPrice.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DiscountPrice"));
			subPrice.setStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].StandardPrice"));
			subPrice.setStandardDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].StandardDiscountPrice"));
			subPrice.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].TradePrice"));
			subPrice.setIsContractPromotion(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].IsContractPromotion"));

			List<String> ruleIdSet10 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].RuleIdSet.Length"); j++) {
				ruleIdSet10.add(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].RuleIdSet["+ j +"]"));
			}
			subPrice.setRuleIdSet10(ruleIdSet10);

			DepreciateInfo11 depreciateInfo11 = new DepreciateInfo11();
			depreciateInfo11.setCheapStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo11.setCheapRate(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo11.setDifferentialName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo11.setMonthPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo11.setOriginalStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo11.setDifferentialPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo11.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.StartTime"));
			depreciateInfo11.setIsShow(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo11.setListPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.ListPrice"));
			subPrice.setDepreciateInfo11(depreciateInfo11);

			List<Promotion13> promotions12 = new ArrayList<Promotion13>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions.Length"); j++) {
				Promotion13 promotion13 = new Promotion13();
				promotion13.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].DiscountOff"));
				promotion13.setType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].Type"));
				promotion13.setRemainQuota(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RemainQuota"));
				promotion13.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].Name"));

				List<Long> ruleIds14 = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RuleIds.Length"); k++) {
					ruleIds14.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RuleIds["+ k +"]"));
				}
				promotion13.setRuleIds14(ruleIds14);

				promotions12.add(promotion13);
			}
			subPrice.setPromotions12(promotions12);

			subPrices.add(subPrice);
		}
		price.setSubPrices(subPrices);
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