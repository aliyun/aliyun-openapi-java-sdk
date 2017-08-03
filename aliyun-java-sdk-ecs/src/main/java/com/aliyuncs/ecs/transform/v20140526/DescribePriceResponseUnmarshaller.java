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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Price;
import com.aliyuncs.ecs.model.v20140526.DescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext context) {
		
		describePriceResponse.setRequestId(context.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(context.floatValue("DescribePriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(context.floatValue("DescribePriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setTradePrice(context.floatValue("DescribePriceResponse.PriceInfo.Price.TradePrice"));
		price.setCurrency(context.stringValue("DescribePriceResponse.PriceInfo.Price.Currency"));
		priceInfo.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setDescription(context.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describePriceResponse.setPriceInfo(priceInfo);
	 
	 	return describePriceResponse;
	}
}