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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerGroupPriceResponseUnmarshaller {

    public static DescribeContainerGroupPriceResponse unmarshall(DescribeContainerGroupPriceResponse describeContainerGroupPriceResponse, UnmarshallerContext context) {

        describeContainerGroupPriceResponse.setRequestId(context.stringValue("DescribeContainerGroupPriceResponse.RequestId"));

        DescribeContainerGroupPriceResponse.PriceInfo priceInfo = new DescribeContainerGroupPriceResponse.PriceInfo();
        DescribeContainerGroupPriceResponse.PriceInfo.Price price = new DescribeContainerGroupPriceResponse.PriceInfo.Price();

        price.setOriginalPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.OriginalPrice"));
        price.setDiscountPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DiscountPrice"));
        price.setTradePrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.TradePrice"));
        price.setCurrency(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.Currency"));


        DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos detailInfos = new DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos();

        List<DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo> detailInfo = new ArrayList<DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo>();
        for (int i = 0; i < context.lengthValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.Length"); i++) {
            DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo info = new DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo();
            info.setResource(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos[" + i + "].Resource"));
            info.setOriginalPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos[" + i + "].OriginalPrice"));
            info.setDiscountPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos[" + i + "].DiscountPrice"));
            info.setTradePrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos[" + i + "].TradePrice"));

            DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo.Rules rules1 = new DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo.Rules();

            List<DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo.Rules.Rule> rule = new ArrayList<DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo.Rules.Rule>();
            for (int j = 0; j < context.lengthValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos[" + i + "].Rules.Length"); j++) {
                DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo.Rules.Rule rule1 = new DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos.DetailInfo.Rules.Rule();
                rule1.setRuleId(context.longValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos[" + i + "].Rules[" + j + "].RuleId"));
                rule1.setDescription(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.Price.DetailInfos[" + i + "].Rules[" + j + "].Description"));
                rule.add(rule1);
            }
            rules1.setRule(rule);
            info.setRules(rules1);
            detailInfo.add(info);
        }
        detailInfos.setDetailInfo(detailInfo);
        price.setDetailInfos(detailInfos);
        priceInfo.setPrice(price);

        DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices spotPrices = new DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices();

        List<DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices.SpotPrice> spotPrice = new ArrayList<DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices.SpotPrice>();
        for (int i = 0; i < context.lengthValue("DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices.Length"); i++) {
            DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices.SpotPrice sp = new DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices.SpotPrice();
            sp.setSpotPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices[" + i + "].SpotPrice"));
            sp.setOriginPrice(context.floatValue("DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices[" + i + "].OriginPrice"));
            sp.setZoneId(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices[" + i + "].ZoneId"));
            sp.setInstanceType(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.SpotPrices[" + i + "].InstanceType"));
            spotPrice.add(sp);
        }
        spotPrices.setSpotPrice(spotPrice);
        priceInfo.setSpotPrices(spotPrices);

        DescribeContainerGroupPriceResponse.PriceInfo.Rules rules2 = new DescribeContainerGroupPriceResponse.PriceInfo.Rules();

        List<DescribeContainerGroupPriceResponse.PriceInfo.Rules.Rule> rules = new ArrayList<DescribeContainerGroupPriceResponse.PriceInfo.Rules.Rule>();
        for (int i = 0; i < context.lengthValue("DescribeContainerGroupPriceResponse.PriceInfo.Rules.Length"); i++) {
            DescribeContainerGroupPriceResponse.PriceInfo.Rules.Rule rule = new DescribeContainerGroupPriceResponse.PriceInfo.Rules.Rule();
            rule.setRuleId(context.longValue("DescribeContainerGroupPriceResponse.PriceInfo.Rules[" + i + "].RuleId"));
            rule.setDescription(context.stringValue("DescribeContainerGroupPriceResponse.PriceInfo.Rules[" + i + "].Description"));

            rules.add(rule);
        }
        rules2.setRule(rules);
        priceInfo.setRules(rules2);
        describeContainerGroupPriceResponse.setPriceInfo(priceInfo);

        return describeContainerGroupPriceResponse;
    }
}