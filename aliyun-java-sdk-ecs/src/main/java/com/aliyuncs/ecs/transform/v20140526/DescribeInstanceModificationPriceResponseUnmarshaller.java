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
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfo.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfo.DepreciateInfo1;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfo.Rule2;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotion;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceModificationPriceResponse.PriceInfo.PriceWarning;
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
		price.setStandardPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.StandardPrice"));
		price.setStandardDiscountPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.StandardDiscountPrice"));
		price.setIsContractPromotion(_ctx.booleanValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.IsContractPromotion"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.RuleIdSet["+ i +"]"));
		}
		price.setRuleIdSet(ruleIdSet);

		DepreciateInfo depreciateInfo = new DepreciateInfo();
		depreciateInfo.setListPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.ListPrice"));
		depreciateInfo.setOriginalStandardPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.OriginalStandardPrice"));
		depreciateInfo.setCheapStandardPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.CheapStandardPrice"));
		depreciateInfo.setCheapRate(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.CheapRate"));
		depreciateInfo.setDifferentialPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialPrice"));
		depreciateInfo.setDifferentialName(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.DifferentialName"));
		depreciateInfo.setMonthPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.MonthPrice"));
		depreciateInfo.setIsShow(_ctx.booleanValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.IsShow"));
		depreciateInfo.setStartTime(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DepreciateInfo.StartTime"));
		price.setDepreciateInfo(depreciateInfo);

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
			detailInfo.setStandardPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardPrice"));
			detailInfo.setStandardDiscountPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].StandardDiscountPrice"));
			detailInfo.setIsContractPromotion(_ctx.booleanValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].IsContractPromotion"));

			DepreciateInfo1 depreciateInfo1 = new DepreciateInfo1();
			depreciateInfo1.setListPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.ListPrice"));
			depreciateInfo1.setOriginalStandardPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.OriginalStandardPrice"));
			depreciateInfo1.setCheapStandardPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapStandardPrice"));
			depreciateInfo1.setCheapRate(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.CheapRate"));
			depreciateInfo1.setDifferentialPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialPrice"));
			depreciateInfo1.setDifferentialName(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.DifferentialName"));
			depreciateInfo1.setMonthPrice(_ctx.floatValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.MonthPrice"));
			depreciateInfo1.setIsShow(_ctx.booleanValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.IsShow"));
			depreciateInfo1.setStartTime(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DepreciateInfo.StartTime"));
			detailInfo.setDepreciateInfo1(depreciateInfo1);

			List<Rule2> subRules = new ArrayList<Rule2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule2 rule2 = new Rule2();
				rule2.setDescription(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].Description"));
				rule2.setRuleId(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule2);
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

			List<Long> ruleIds3 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds.Length"); j++) {
				ruleIds3.add(_ctx.longValue("DescribeInstanceModificationPriceResponse.PriceInfo.Price.Promotions["+ i +"].RuleIds["+ j +"]"));
			}
			promotion.setRuleIds3(ruleIds3);

			promotions.add(promotion);
		}
		price.setPromotions(promotions);
		priceInfo.setPrice(price);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setMsg(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.PriceWarning.Msg"));
		priceWarning.setCode(_ctx.stringValue("DescribeInstanceModificationPriceResponse.PriceInfo.PriceWarning.Code"));
		priceInfo.setPriceWarning(priceWarning);

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