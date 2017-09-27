/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRenewalPriceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRenewalPriceResponse.PriceInfo;
import com.aliyuncs.rds.model.v20140815.DescribeRenewalPriceResponse.PriceInfo.ActivityInfo;
import com.aliyuncs.rds.model.v20140815.DescribeRenewalPriceResponse.PriceInfo.Coupon;
import com.aliyuncs.rds.model.v20140815.DescribeRenewalPriceResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRenewalPriceResponseUnmarshaller {

	public static DescribeRenewalPriceResponse unmarshall(DescribeRenewalPriceResponse describeRenewalPriceResponse, UnmarshallerContext context) {
		
		describeRenewalPriceResponse.setRequestId(context.stringValue("DescribeRenewalPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();
		priceInfo.setCurrency(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.Currency"));
		priceInfo.setOriginalPrice(context.floatValue("DescribeRenewalPriceResponse.PriceInfo.OriginalPrice"));
		priceInfo.setTradePrice(context.floatValue("DescribeRenewalPriceResponse.PriceInfo.TradePrice"));
		priceInfo.setDiscountPrice(context.floatValue("DescribeRenewalPriceResponse.PriceInfo.DiscountPrice"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.RuleIds["+ i +"]"));
		}
		priceInfo.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.ActivityInfo.Success"));
		priceInfo.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("DescribeRenewalPriceResponse.PriceInfo.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		priceInfo.setCoupons(coupons);
		describeRenewalPriceResponse.setPriceInfo(priceInfo);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeRenewalPriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("DescribeRenewalPriceResponse.Rules["+ i +"].RuleId"));
			rule.setName(context.stringValue("DescribeRenewalPriceResponse.Rules["+ i +"].Name"));
			rule.setDescription(context.stringValue("DescribeRenewalPriceResponse.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		describeRenewalPriceResponse.setRules(rules);
	 
	 	return describeRenewalPriceResponse;
	}
}