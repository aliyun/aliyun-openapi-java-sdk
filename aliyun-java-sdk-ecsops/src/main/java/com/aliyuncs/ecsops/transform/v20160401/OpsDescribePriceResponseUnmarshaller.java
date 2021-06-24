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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribePriceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePriceResponse.PriceInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePriceResponse.PriceInfo.Order;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePriceResponse.PriceInfo.Order.Coupon;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribePriceResponseUnmarshaller {

	public static OpsDescribePriceResponse unmarshall(OpsDescribePriceResponse opsDescribePriceResponse, UnmarshallerContext _ctx) {
		
		opsDescribePriceResponse.setRequestId(_ctx.stringValue("OpsDescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		List<String> orderParams = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribePriceResponse.PriceInfo.OrderParams.Length"); i++) {
			orderParams.add(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.OrderParams["+ i +"]"));
		}
		priceInfo.setOrderParams(orderParams);

		Order order = new Order();
		order.setDiscountPrice(_ctx.floatValue("OpsDescribePriceResponse.PriceInfo.Order.DiscountPrice"));
		order.setTradePrice(_ctx.floatValue("OpsDescribePriceResponse.PriceInfo.Order.TradePrice"));
		order.setOriginalPrice(_ctx.floatValue("OpsDescribePriceResponse.PriceInfo.Order.OriginalPrice"));
		order.setSpotInstanceTypePrice(_ctx.floatValue("OpsDescribePriceResponse.PriceInfo.Order.SpotInstanceTypePrice"));
		order.setCurrency(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.Order.Currency"));
		order.setSpotInstanceTypeOriginalPrice(_ctx.floatValue("OpsDescribePriceResponse.PriceInfo.Order.SpotInstanceTypeOriginalPrice"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribePriceResponse.PriceInfo.Order.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.Order.RuleIdSet["+ i +"]"));
		}
		order.setRuleIdSet(ruleIdSet);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribePriceResponse.PriceInfo.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setDescription(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].Description"));
			coupon.setDiscountOff(_ctx.floatValue("OpsDescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].DiscountOff"));
			coupon.setIsSelected(_ctx.booleanValue("OpsDescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].IsSelected"));
			coupon.setCouponNo(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].Name"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		priceInfo.setOrder(order);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setMsg(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.PriceWarning.Msg"));
		priceWarning.setCode(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.PriceWarning.Code"));
		priceInfo.setPriceWarning(priceWarning);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setTitle(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.Rules["+ i +"].Title"));
			rule.setName(_ctx.stringValue("OpsDescribePriceResponse.PriceInfo.Rules["+ i +"].Name"));
			rule.setRuleId(_ctx.longValue("OpsDescribePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		opsDescribePriceResponse.setPriceInfo(priceInfo);
	 
	 	return opsDescribePriceResponse;
	}
}