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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRenewalPriceResponseUnmarshaller {

	public static DescribeRenewalPriceResponse unmarshall(DescribeRenewalPriceResponse describeRenewalPriceResponse, UnmarshallerContext context) {
		
		describeRenewalPriceResponse.setRequestId(context.stringValue("DescribeRenewalPriceResponse.RequestId"));

		Order order = new Order();
		order.setOriginalAmount(context.floatValue("DescribeRenewalPriceResponse.Order.OriginalAmount"));
		order.setTradeAmount(context.floatValue("DescribeRenewalPriceResponse.Order.TradeAmount"));
		order.setDiscountAmount(context.floatValue("DescribeRenewalPriceResponse.Order.DiscountAmount"));
		order.setCurrency(context.stringValue("DescribeRenewalPriceResponse.Order.Currency"));

		List<String> ruleIds1 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeRenewalPriceResponse.Order.RuleIds.Length"); i++) {
			ruleIds1.add(context.stringValue("DescribeRenewalPriceResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds1(ruleIds1);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("DescribeRenewalPriceResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("DescribeRenewalPriceResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("DescribeRenewalPriceResponse.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("DescribeRenewalPriceResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("DescribeRenewalPriceResponse.Order.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		describeRenewalPriceResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeRenewalPriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(context.longValue("DescribeRenewalPriceResponse.Rules["+ i +"].RuleDescId"));
			rule.setName(context.stringValue("DescribeRenewalPriceResponse.Rules["+ i +"].Name"));
			rule.setTitle(context.stringValue("DescribeRenewalPriceResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		describeRenewalPriceResponse.setRules(rules);

		List<SubOrder> subOrders = new ArrayList<SubOrder>();
		for (int i = 0; i < context.lengthValue("DescribeRenewalPriceResponse.SubOrders.Length"); i++) {
			SubOrder subOrder = new SubOrder();
			subOrder.setOriginalAmount(context.floatValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].OriginalAmount"));
			subOrder.setTradeAmount(context.floatValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].TradeAmount"));
			subOrder.setDiscountAmount(context.floatValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].DiscountAmount"));
			subOrder.setInstanceId(context.stringValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].InstanceId"));

			List<String> ruleIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(context.stringValue("DescribeRenewalPriceResponse.SubOrders["+ i +"].RuleIds["+ j +"]"));
			}
			subOrder.setRuleIds(ruleIds);

			subOrders.add(subOrder);
		}
		describeRenewalPriceResponse.setSubOrders(subOrders);
	 
	 	return describeRenewalPriceResponse;
	}
}