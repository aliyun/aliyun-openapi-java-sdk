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
import com.aliyuncs.rds.model.v20140815.DescribePriceResponse.ServerlessPrice;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));
		describePriceResponse.setOrderParams(_ctx.stringValue("DescribePriceResponse.OrderParams"));
		describePriceResponse.setShowDiscount(_ctx.booleanValue("DescribePriceResponse.ShowDiscount"));
		describePriceResponse.setTradeMaxRCUAmount(_ctx.floatValue("DescribePriceResponse.TradeMaxRCUAmount"));
		describePriceResponse.setTradeMinRCUAmount(_ctx.floatValue("DescribePriceResponse.TradeMinRCUAmount"));

		PriceInfo priceInfo = new PriceInfo();
		priceInfo.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.OriginalPrice"));
		priceInfo.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.DiscountPrice"));
		priceInfo.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Currency"));
		priceInfo.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.TradePrice"));
		priceInfo.setTradeMinRCUAmount(_ctx.floatValue("DescribePriceResponse.PriceInfo.TradeMinRCUAmount"));
		priceInfo.setTradeMaxRCUAmount(_ctx.floatValue("DescribePriceResponse.PriceInfo.TradeMaxRCUAmount"));
		priceInfo.setOrderLines(_ctx.stringValue("DescribePriceResponse.PriceInfo.OrderLines"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.RuleIds.Length"); i++) {
			ruleIds.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.RuleIds["+ i +"]"));
		}
		priceInfo.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(_ctx.stringValue("DescribePriceResponse.PriceInfo.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(_ctx.stringValue("DescribePriceResponse.PriceInfo.ActivityInfo.Success"));
		priceInfo.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setIsSelected(_ctx.stringValue("DescribePriceResponse.PriceInfo.Coupons["+ i +"].IsSelected"));
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Coupons["+ i +"].CouponNo"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Coupons["+ i +"].Name"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Coupons["+ i +"].Description"));

			coupons.add(coupon);
		}
		priceInfo.setCoupons(coupons);
		describePriceResponse.setPriceInfo(priceInfo);

		ServerlessPrice serverlessPrice = new ServerlessPrice();
		serverlessPrice.setTotalOriginalMinAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.TotalOriginalMinAmount"));
		serverlessPrice.setTotalOriginalMaxAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.TotalOriginalMaxAmount"));
		serverlessPrice.setRCUOriginalMinAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.RCUOriginalMinAmount"));
		serverlessPrice.setRCUOriginalMaxAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.RCUOriginalMaxAmount"));
		serverlessPrice.setRCUDiscountMinAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.RCUDiscountMinAmount"));
		serverlessPrice.setRCUDiscountMaxAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.RCUDiscountMaxAmount"));
		serverlessPrice.setTradeMinRCUAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.TradeMinRCUAmount"));
		serverlessPrice.setTradeMaxRCUAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.TradeMaxRCUAmount"));
		serverlessPrice.setStorageOriginalAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.StorageOriginalAmount"));
		serverlessPrice.setStorageDiscountAmount(_ctx.floatValue("DescribePriceResponse.ServerlessPrice.storageDiscountAmount"));
		describePriceResponse.setServerlessPrice(serverlessPrice);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setName(_ctx.stringValue("DescribePriceResponse.Rules["+ i +"].Name"));
			rule.setDescription(_ctx.stringValue("DescribePriceResponse.Rules["+ i +"].Description"));
			rule.setRuleId(_ctx.longValue("DescribePriceResponse.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		describePriceResponse.setRules(rules);
	 
	 	return describePriceResponse;
	}
}