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

import com.aliyuncs.rds.model.v20140815.DescribePriceResponse;
import com.aliyuncs.rds.model.v20140815.DescribePriceResponse.PriceInfo;
import com.aliyuncs.rds.model.v20140815.DescribePriceResponse.PriceInfo.ActivityInfo;
import com.aliyuncs.rds.model.v20140815.DescribePriceResponse.PriceInfo.Coupon;
import com.aliyuncs.rds.model.v20140815.DescribePriceResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext context) {
		
		describePriceResponse.setRequestId(context.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();
		priceInfo.setCurrency(context.stringValue("DescribePriceResponse.PriceInfo.Currency"));
		priceInfo.setOriginalPrice(context.floatValue("DescribePriceResponse.PriceInfo.OriginalPrice"));
		priceInfo.setTradePrice(context.floatValue("DescribePriceResponse.PriceInfo.TradePrice"));
		priceInfo.setDiscountPrice(context.floatValue("DescribePriceResponse.PriceInfo.DiscountPrice"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.PriceInfo.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("DescribePriceResponse.PriceInfo.RuleIds["+ i +"]"));
		}
		priceInfo.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(context.stringValue("DescribePriceResponse.PriceInfo.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(context.stringValue("DescribePriceResponse.PriceInfo.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(context.stringValue("DescribePriceResponse.PriceInfo.ActivityInfo.Success"));
		priceInfo.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.PriceInfo.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("DescribePriceResponse.PriceInfo.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("DescribePriceResponse.PriceInfo.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("DescribePriceResponse.PriceInfo.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("DescribePriceResponse.PriceInfo.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		priceInfo.setCoupons(coupons);
		describePriceResponse.setPriceInfo(priceInfo);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("DescribePriceResponse.Rules["+ i +"].RuleId"));
			rule.setName(context.stringValue("DescribePriceResponse.Rules["+ i +"].Name"));
			rule.setDescription(context.stringValue("DescribePriceResponse.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		describePriceResponse.setRules(rules);
	 
	 	return describePriceResponse;
	}
}