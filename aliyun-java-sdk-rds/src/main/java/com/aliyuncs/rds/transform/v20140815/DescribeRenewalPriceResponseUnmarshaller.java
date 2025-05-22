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

	public static DescribeRenewalPriceResponse unmarshall(DescribeRenewalPriceResponse describeRenewalPriceResponse, UnmarshallerContext _ctx) {
		
		describeRenewalPriceResponse.setRequestId(_ctx.stringValue("DescribeRenewalPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();
		priceInfo.setCurrency(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Currency"));
		priceInfo.setDiscountPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.DiscountPrice"));
		priceInfo.setOriginalPrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.OriginalPrice"));
		priceInfo.setTradePrice(_ctx.floatValue("DescribeRenewalPriceResponse.PriceInfo.TradePrice"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.RuleIds.Length"); i++) {
			ruleIds.add(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.RuleIds["+ i +"]"));
		}
		priceInfo.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.ActivityInfo.Success"));
		priceInfo.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.PriceInfo.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Coupons["+ i +"].CouponNo"));
			coupon.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Coupons["+ i +"].Description"));
			coupon.setIsSelected(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Coupons["+ i +"].IsSelected"));
			coupon.setName(_ctx.stringValue("DescribeRenewalPriceResponse.PriceInfo.Coupons["+ i +"].Name"));

			coupons.add(coupon);
		}
		priceInfo.setCoupons(coupons);
		describeRenewalPriceResponse.setPriceInfo(priceInfo);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenewalPriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setDescription(_ctx.stringValue("DescribeRenewalPriceResponse.Rules["+ i +"].Description"));
			rule.setName(_ctx.stringValue("DescribeRenewalPriceResponse.Rules["+ i +"].Name"));
			rule.setRuleId(_ctx.longValue("DescribeRenewalPriceResponse.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		describeRenewalPriceResponse.setRules(rules);
	 
	 	return describeRenewalPriceResponse;
	}
}