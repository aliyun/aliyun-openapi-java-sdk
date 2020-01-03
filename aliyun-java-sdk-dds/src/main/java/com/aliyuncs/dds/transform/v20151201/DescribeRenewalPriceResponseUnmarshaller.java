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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeRenewalPriceResponse;
import com.aliyuncs.dds.model.v20151201.DescribeRenewalPriceResponse.Order;
import com.aliyuncs.dds.model.v20151201.DescribeRenewalPriceResponse.Order.Coupon;
import com.aliyuncs.dds.model.v20151201.DescribeRenewalPriceResponse.Rule;
import com.aliyuncs.dds.model.v20151201.DescribeRenewalPriceResponse.SubOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRenewalPriceResponseUnmarshaller {

	public static DescribeRenewalPriceResponse unmarshall(DescribeRenewalPriceResponse describeRenewalPriceResponse, UnmarshallerContext _ctx) {
		
		describeRenewalPriceResponse.setRequestId(_ctx.stringValue("DescribeRenewalPriceResponse.RequestId"));

		Order order = new Order();
		order.setOriginalAmount(_ctx.floatValue("DescribeRenewalPriceResponse.Order.OriginalAmount"));
		order.setTradeAmount(_ctx.floatValue("DescribeRenewalPriceResponse.Order.TradeAmount"));
		order.setDiscountAmount(_ctx.floatValue("DescribeRenewalPriceResponse.Order.DiscountAmount"));
		order.setCurrency(_ctx.stringValue("DescribeRenewalPriceResponse.Order.Currency"));

		List<String> ruleIds1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.Order.RuleIds.Length"); i++) {
			ruleIds1.add(_ctx.stringValue("DescribeRenewalPriceResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds1(ruleIds1);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(_ctx.stringValue("DescribeRenewalPriceResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(_ctx.stringValue("DescribeRenewalPriceResponse.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(_ctx.stringValue("DescribeRenewalPriceResponse.Order.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		describeRenewalPriceResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(_ctx.longValue("DescribeRenewalPriceResponse.Rules["+ i +"].RuleDescId"));
			rule.setName(_ctx.stringValue("DescribeRenewalPriceResponse.Rules["+ i +"].Name"));
			rule.setTitle(_ctx.stringValue("DescribeRenewalPriceResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		describeRenewalPriceResponse.setRules(rules);

		List<SubOrder> subOrders = new ArrayList<SubOrder>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.SubOrders.Length"); i++) {
			SubOrder subOrder = new SubOrder();
			subOrder.setOriginalAmount(_ctx.floatValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].OriginalAmount"));
			subOrder.setTradeAmount(_ctx.floatValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].TradeAmount"));
			subOrder.setDiscountAmount(_ctx.floatValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].DiscountAmount"));
			subOrder.setInstanceId(_ctx.stringValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].InstanceId"));

			List<String> ruleIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.stringValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].RuleIds["+ j +"]"));
			}
			subOrder.setRuleIds(ruleIds);

			subOrders.add(subOrder);
		}
		describeRenewalPriceResponse.setSubOrders(subOrders);
	 
	 	return describeRenewalPriceResponse;
	}
}