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

package com.aliyuncs.eci.transform.v20180808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupPriceResponse;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupPriceResponse.PriceInfo;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupPriceResponse.PriceInfo.Price;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfo;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfo.Rule2;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupPriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerGroupPriceResponseUnmarshaller {

	public static DescribeContainerGroupPriceResponse unmarshall(DescribeContainerGroupPriceResponse describeContainerGroupPriceResponse, UnmarshallerContext context) {
		
		describeContainerGroupPriceResponse.setRequestId(context.stringValue("DescribeContainerGroupPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setOriginalPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setDiscountPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setTradePrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.TradePrice"));
		price.setCurrency(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.Currency"));

		List<DetailInfo> detailInfos = new ArrayList<DetailInfo>();
		for (int i = 0; i < context.lengthValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.Length"); i++) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setResource(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Resource"));
			detailInfo.setOriginalPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].OriginalPrice"));
			detailInfo.setDiscountPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].DiscountPrice"));
			detailInfo.setTradePrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].TradePrice"));

			List<Rule2> rules1 = new ArrayList<Rule2>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Rules.Length"); j++) {
				Rule2 rule2 = new Rule2();
				rule2.setRuleId(context.longValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Rules["+ j +"].RuleId"));
				rule2.setDescription(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos["+ i +"].Rules["+ j +"].Description"));

				rules1.add(rule2);
			}
			detailInfo.setRules1(rules1);

			detailInfos.add(detailInfo);
		}
		price.setDetailInfos(detailInfos);
		priceInfo.setPrice(price);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeContainerGroupPriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("DescribeContainerGroupPriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setDescription(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.Rules["+ i +"].Description"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describeContainerGroupPriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeContainerGroupPriceResponse;
	}
}