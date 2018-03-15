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

import com.aliyuncs.rds.model.v20140815.QueryPriceForBuyResponse;
import com.aliyuncs.rds.model.v20140815.QueryPriceForBuyResponse.PriceInfo;
import com.aliyuncs.rds.model.v20140815.QueryPriceForBuyResponse.PriceInfo.ActivityInfo;
import com.aliyuncs.rds.model.v20140815.QueryPriceForBuyResponse.PriceInfo.Coupon;
import com.aliyuncs.rds.model.v20140815.QueryPriceForBuyResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceForBuyResponseUnmarshaller {

	public static QueryPriceForBuyResponse unmarshall(QueryPriceForBuyResponse queryPriceForBuyResponse, UnmarshallerContext context) {
		
		queryPriceForBuyResponse.setRequestId(context.stringValue("QueryPriceForBuyResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();
		priceInfo.setCurrency(context.stringValue("QueryPriceForBuyResponse.PriceInfo.Currency"));
		priceInfo.setOriginalPrice(context.floatValue("QueryPriceForBuyResponse.PriceInfo.OriginalPrice"));
		priceInfo.setTradePrice(context.floatValue("QueryPriceForBuyResponse.PriceInfo.TradePrice"));
		priceInfo.setDiscountPrice(context.floatValue("QueryPriceForBuyResponse.PriceInfo.DiscountPrice"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryPriceForBuyResponse.PriceInfo.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("QueryPriceForBuyResponse.PriceInfo.RuleIds["+ i +"]"));
		}
		priceInfo.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(context.stringValue("QueryPriceForBuyResponse.PriceInfo.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(context.stringValue("QueryPriceForBuyResponse.PriceInfo.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(context.stringValue("QueryPriceForBuyResponse.PriceInfo.ActivityInfo.Success"));
		priceInfo.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("QueryPriceForBuyResponse.PriceInfo.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("QueryPriceForBuyResponse.PriceInfo.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("QueryPriceForBuyResponse.PriceInfo.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("QueryPriceForBuyResponse.PriceInfo.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("QueryPriceForBuyResponse.PriceInfo.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		priceInfo.setCoupons(coupons);
		queryPriceForBuyResponse.setPriceInfo(priceInfo);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("QueryPriceForBuyResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("QueryPriceForBuyResponse.Rules["+ i +"].RuleId"));
			rule.setName(context.stringValue("QueryPriceForBuyResponse.Rules["+ i +"].Name"));
			rule.setDescription(context.stringValue("QueryPriceForBuyResponse.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		queryPriceForBuyResponse.setRules(rules);
	 
	 	return queryPriceForBuyResponse;
	}
}