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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSavingsPlanPriceResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSavingsPlanPriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeSavingsPlanPriceResponse.PriceInfo.Price;
import com.aliyuncs.ecs.model.v20140526.DescribeSavingsPlanPriceResponse.PriceInfo.RulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSavingsPlanPriceResponseUnmarshaller {

	public static DescribeSavingsPlanPriceResponse unmarshall(DescribeSavingsPlanPriceResponse describeSavingsPlanPriceResponse, UnmarshallerContext _ctx) {
		
		describeSavingsPlanPriceResponse.setRequestId(_ctx.stringValue("DescribeSavingsPlanPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(_ctx.floatValue("DescribeSavingsPlanPriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(_ctx.floatValue("DescribeSavingsPlanPriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setTradePrice(_ctx.floatValue("DescribeSavingsPlanPriceResponse.PriceInfo.Price.TradePrice"));
		price.setCurrency(_ctx.stringValue("DescribeSavingsPlanPriceResponse.PriceInfo.Price.Currency"));
		priceInfo.setPrice(price);

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSavingsPlanPriceResponse.PriceInfo.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setRuleId(_ctx.stringValue("DescribeSavingsPlanPriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rulesItem.setDescription(_ctx.stringValue("DescribeSavingsPlanPriceResponse.PriceInfo.Rules["+ i +"].Description"));

			rules.add(rulesItem);
		}
		priceInfo.setRules(rules);
		describeSavingsPlanPriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeSavingsPlanPriceResponse;
	}
}