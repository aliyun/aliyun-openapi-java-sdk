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
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Coupon;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Coupon.AdditionalInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.DepreciateInfo1;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfo.Rule2;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.Promotion7;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice.DepreciateInfo4;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Price.SubPrice.Promotion;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRenewalPriceResponseUnmarshaller {

	public static DescribeRenewalPriceResponse unmarshall(DescribeRenewalPriceResponse describeRenewalPriceResponse, UnmarshallerContext _ctx) {
		
		describeRenewalPriceResponse.setRequestId(_ctx.stringValue("DescribeRenewalPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setCurrency(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Currency"));
		price.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.TradePrice"));
		price.setStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.StandardPrice"));
		price.setStandardDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.StandardDiscountPrice"));
		price.setIsContractPromotion(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.IsContractPromotion"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.RuleIdSet["+ i +"]"));
		}
		price.setRuleIdSet(ruleIdSet);

		DepreciateInfo depreciateInfo = new DepreciateInfo();
		depreciateInfo.setListPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.ListPrice"));
		depreciateInfo.setOriginalStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.OriginalStandardPrice"));
		depreciateInfo.setCheapStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.CheapStandardPrice"));
		depreciateInfo.setCheapRate(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.CheapRate"));
		depreciateInfo.setDifferentialPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialPrice"));
		depreciateInfo.setDifferentialName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialName"));
		depreciateInfo.setMonthPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.MonthPrice"));
		depreciateInfo.setIsShow(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.IsShow"));
		depreciateInfo.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DepreciateInfo.StartTime"));
		price.setDepreciateInfo(depreciateInfo);

		List<DetailInfo> detailInfos = new ArrayList<DetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos.Length"); i++) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setResource(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Resource"));
			detailInfo.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].OriginalPrice"));
			detailInfo.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DiscountPrice"));
			detailInfo.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].TradePrice"));
			detailInfo.setStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardPrice"));
			detailInfo.setStandardDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardDiscountPrice"));
			detailInfo.setIsContractPromotion(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].IsContractPromotion"));

			DepreciateInfo1 depreciateInfo1 = new DepreciateInfo1();
			depreciateInfo1.setListPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.ListPrice"));
			depreciateInfo1.setOriginalStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo1.setCheapStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo1.setCheapRate(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo1.setDifferentialPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo1.setDifferentialName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo1.setMonthPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo1.setIsShow(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo1.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.StartTime"));
			detailInfo.setDepreciateInfo1(depreciateInfo1);

			List<Rule2> subRules = new ArrayList<Rule2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule2 rule2 = new Rule2();
				rule2.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].Description"));
				rule2.setRuleId(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule2);
			}
			detailInfo.setSubRules(subRules);

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setCode(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Code"));
				attribute.setValue(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Attributes["+ j +"].Value"));

				attributes.add(attribute);
			}
			detailInfo.setAttributes(attributes);

			detailInfos.add(detailInfo);
		}
		price.setDetailInfos(detailInfos);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setIsSelected(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].IsSelected"));
			coupon.setCouponNo(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].CouponNo"));
			coupon.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Description"));
			coupon.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Name"));
			coupon.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].DiscountOff"));
			coupon.setOptionCode(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].OptionCode"));
			coupon.setEffective(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].Effective"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon.setRuleIds(ruleIds);

			AdditionalInfo additionalInfo = new AdditionalInfo();
			additionalInfo.setCouponType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CouponType"));
			additionalInfo.setAvailableAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.AvailableAmount"));
			additionalInfo.setUpperLimitAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.UpperLimitAmount"));
			additionalInfo.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.StartTime"));
			additionalInfo.setEndTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.EndTime"));
			additionalInfo.setIneffectiveReason(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.IneffectiveReason"));
			additionalInfo.setDiscountRate(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.DiscountRate"));
			additionalInfo.setCertainAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.CertainAmount"));
			additionalInfo.setVoucherTotalAmount(_ctx.doubleValue("DescribeRenewalPriceResponse.PriceInfo.Price.Coupons["+ i +"].AdditionalInfo.VoucherTotalAmount"));
			coupon.setAdditionalInfo(additionalInfo);

			coupons.add(coupon);
		}
		price.setCoupons(coupons);

		List<SubPrice> subPrices = new ArrayList<SubPrice>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices.Length"); i++) {
			SubPrice subPrice = new SubPrice();
			subPrice.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].OriginalPrice"));
			subPrice.setInstanceId(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].InstanceId"));
			subPrice.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DiscountPrice"));
			subPrice.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].TradePrice"));
			subPrice.setStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].StandardPrice"));
			subPrice.setStandardDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].StandardDiscountPrice"));
			subPrice.setIsContractPromotion(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].IsContractPromotion"));

			List<String> ruleIdSet3 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].RuleIdSet.Length"); j++) {
				ruleIdSet3.add(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].RuleIdSet["+ j +"]"));
			}
			subPrice.setRuleIdSet3(ruleIdSet3);

			DepreciateInfo4 depreciateInfo4 = new DepreciateInfo4();
			depreciateInfo4.setListPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.ListPrice"));
			depreciateInfo4.setOriginalStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo4.setCheapStandardPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo4.setCheapRate(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo4.setDifferentialPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo4.setDifferentialName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo4.setMonthPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo4.setIsShow(_ctx.booleanValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo4.setStartTime(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].DepreciateInfo.StartTime"));
			subPrice.setDepreciateInfo4(depreciateInfo4);

			List<Promotion> promotions5 = new ArrayList<Promotion>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions.Length"); j++) {
				Promotion promotion = new Promotion();
				promotion.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].Name"));
				promotion.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].DiscountOff"));
				promotion.setType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].Type"));
				promotion.setRemainQuota(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RemainQuota"));

				List<Long> ruleIds6 = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RuleIds.Length"); k++) {
					ruleIds6.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.SubPrices["+ i +"].Promotions["+ j +"].RuleIds["+ k +"]"));
				}
				promotion.setRuleIds6(ruleIds6);

				promotions5.add(promotion);
			}
			subPrice.setPromotions5(promotions5);

			subPrices.add(subPrice);
		}
		price.setSubPrices(subPrices);

		List<Promotion7> promotions = new ArrayList<Promotion7>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions.Length"); i++) {
			Promotion7 promotion7 = new Promotion7();
			promotion7.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].Name"));
			promotion7.setDiscountOff(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].DiscountOff"));
			promotion7.setType(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].Type"));
			promotion7.setRemainQuota(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RemainQuota"));

			List<Long> ruleIds8 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds8.add(_ctx.longValue("DescribeRenewalPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion7.setRuleIds8(ruleIds8);

			promotions.add(promotion7);
		}
		price.setPromotions(promotions);
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