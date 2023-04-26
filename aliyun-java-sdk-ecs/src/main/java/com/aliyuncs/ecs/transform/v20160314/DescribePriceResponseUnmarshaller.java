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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Order;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Order.Coupon;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Order.ResourcePriceModel;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Order.ResourcePriceModel.Rule1;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Order.SubOrder;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		List<String> orderParams = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.OrderParams.Length"); i++) {
			orderParams.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.OrderParams["+ i +"]"));
		}
		priceInfo.setOrderParams(orderParams);

		Order order = new Order();
		order.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.DiscountPrice"));
		order.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.TradePrice"));
		order.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.OriginalPrice"));
		order.setSpotInstanceTypePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.SpotInstanceTypePrice"));
		order.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Currency"));
		order.setSpotInstanceTypeOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.SpotInstanceTypeOriginalPrice"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.RuleIdSet["+ i +"]"));
		}
		order.setRuleIdSet(ruleIdSet);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setIsSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].IsSelected"));
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].CouponNo"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].Description"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].Name"));
			coupon.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].DiscountOff"));
			coupon.setOptionCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].OptionCode"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].RuleIds["+ j +"]"));
			}
			coupon.setRuleIds(ruleIds);

			coupons.add(coupon);
		}
		order.setCoupons(coupons);

		List<ResourcePriceModel> detailInfos = new ArrayList<ResourcePriceModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.DetailInfos.Length"); i++) {
			ResourcePriceModel resourcePriceModel = new ResourcePriceModel();
			resourcePriceModel.setResource(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.DetailInfos["+ i +"].Resource"));
			resourcePriceModel.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.DetailInfos["+ i +"].OriginalPrice"));
			resourcePriceModel.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.DetailInfos["+ i +"].DiscountPrice"));
			resourcePriceModel.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.DetailInfos["+ i +"].TradePrice"));

			List<Rule1> subRules = new ArrayList<Rule1>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.DetailInfos["+ i +"].SubRules.Length"); j++) {
				Rule1 rule1 = new Rule1();
				rule1.setTitle(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.DetailInfos["+ i +"].SubRules["+ j +"].Title"));
				rule1.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.DetailInfos["+ i +"].SubRules["+ j +"].Name"));
				rule1.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Order.DetailInfos["+ i +"].SubRules["+ j +"].RuleId"));

				subRules.add(rule1);
			}
			resourcePriceModel.setSubRules(subRules);

			detailInfos.add(resourcePriceModel);
		}
		order.setDetailInfos(detailInfos);

		List<SubOrder> subOrders = new ArrayList<SubOrder>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.SubOrders.Length"); i++) {
			SubOrder subOrder = new SubOrder();
			subOrder.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.SubOrders["+ i +"].OriginalPrice"));
			subOrder.setInstanceId(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.SubOrders["+ i +"].InstanceId"));
			subOrder.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.SubOrders["+ i +"].DiscountPrice"));
			subOrder.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.SubOrders["+ i +"].TradePrice"));

			List<String> ruleIdSet2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.SubOrders["+ i +"].RuleIdSet.Length"); j++) {
				ruleIdSet2.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.SubOrders["+ i +"].RuleIdSet["+ j +"]"));
			}
			subOrder.setRuleIdSet2(ruleIdSet2);

			subOrders.add(subOrder);
		}
		order.setSubOrders(subOrders);
		priceInfo.setOrder(order);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setMsg(_ctx.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Msg"));
		priceWarning.setCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Code"));
		priceInfo.setPriceWarning(priceWarning);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setTitle(_ctx.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Title"));
			rule.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Name"));
			rule.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describePriceResponse.setPriceInfo(priceInfo);
	 
	 	return describePriceResponse;
	}
}