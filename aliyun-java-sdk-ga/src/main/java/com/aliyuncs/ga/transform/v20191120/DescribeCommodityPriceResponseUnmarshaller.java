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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.DescribeCommodityPriceResponse;
import com.aliyuncs.ga.model.v20191120.DescribeCommodityPriceResponse.OrderDetailsItem;
import com.aliyuncs.ga.model.v20191120.DescribeCommodityPriceResponse.OrderDetailsItem.ModuleDetailsItem;
import com.aliyuncs.ga.model.v20191120.DescribeCommodityPriceResponse.OrderDetailsItem.PromDetailsItem;
import com.aliyuncs.ga.model.v20191120.DescribeCommodityPriceResponse.PromotionDetails;
import com.aliyuncs.ga.model.v20191120.DescribeCommodityPriceResponse.RuleDetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommodityPriceResponseUnmarshaller {

	public static DescribeCommodityPriceResponse unmarshall(DescribeCommodityPriceResponse describeCommodityPriceResponse, UnmarshallerContext _ctx) {
		
		describeCommodityPriceResponse.setRequestId(_ctx.stringValue("DescribeCommodityPriceResponse.RequestId"));
		describeCommodityPriceResponse.setCurrency(_ctx.stringValue("DescribeCommodityPriceResponse.Currency"));
		describeCommodityPriceResponse.setOriginalPrice(_ctx.doubleValue("DescribeCommodityPriceResponse.OriginalPrice"));
		describeCommodityPriceResponse.setDiscountPrice(_ctx.doubleValue("DescribeCommodityPriceResponse.DiscountPrice"));
		describeCommodityPriceResponse.setTradePrice(_ctx.doubleValue("DescribeCommodityPriceResponse.TradePrice"));

		List<OrderDetailsItem> orderDetails = new ArrayList<OrderDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommodityPriceResponse.OrderDetails.Length"); i++) {
			OrderDetailsItem orderDetailsItem = new OrderDetailsItem();
			orderDetailsItem.setCommodityCode(_ctx.stringValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].CommodityCode"));
			orderDetailsItem.setCommodityName(_ctx.stringValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].CommodityName"));
			orderDetailsItem.setOriginalPrice(_ctx.doubleValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].OriginalPrice"));
			orderDetailsItem.setDiscountPrice(_ctx.doubleValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].DiscountPrice"));
			orderDetailsItem.setTradePrice(_ctx.doubleValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].TradePrice"));
			orderDetailsItem.setQuantity(_ctx.longValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].Quantity"));

			List<Long> ruleIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.longValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].RuleIds["+ j +"]"));
			}
			orderDetailsItem.setRuleIds(ruleIds);

			List<ModuleDetailsItem> moduleDetails = new ArrayList<ModuleDetailsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].ModuleDetails.Length"); j++) {
				ModuleDetailsItem moduleDetailsItem = new ModuleDetailsItem();
				moduleDetailsItem.setModuleCode(_ctx.stringValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].ModuleDetails["+ j +"].ModuleCode"));
				moduleDetailsItem.setModuleName(_ctx.stringValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].ModuleDetails["+ j +"].ModuleName"));
				moduleDetailsItem.setOriginalPrice(_ctx.doubleValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].ModuleDetails["+ j +"].OriginalPrice"));
				moduleDetailsItem.setDiscountPrice(_ctx.doubleValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].ModuleDetails["+ j +"].DiscountPrice"));
				moduleDetailsItem.setTradePrice(_ctx.doubleValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].ModuleDetails["+ j +"].TradePrice"));

				moduleDetails.add(moduleDetailsItem);
			}
			orderDetailsItem.setModuleDetails(moduleDetails);

			List<PromDetailsItem> promDetails = new ArrayList<PromDetailsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].PromDetails.Length"); j++) {
				PromDetailsItem promDetailsItem = new PromDetailsItem();
				promDetailsItem.setPromotionId(_ctx.stringValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].PromDetails["+ j +"].PromotionId"));
				promDetailsItem.setPromotionName(_ctx.stringValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].PromDetails["+ j +"].PromotionName"));
				promDetailsItem.setFinalPromFee(_ctx.doubleValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].PromDetails["+ j +"].FinalPromFee"));
				promDetailsItem.setPromType(_ctx.stringValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].PromDetails["+ j +"].PromType"));
				promDetailsItem.setOptionCode(_ctx.stringValue("DescribeCommodityPriceResponse.OrderDetails["+ i +"].PromDetails["+ j +"].OptionCode"));

				promDetails.add(promDetailsItem);
			}
			orderDetailsItem.setPromDetails(promDetails);

			orderDetails.add(orderDetailsItem);
		}
		describeCommodityPriceResponse.setOrderDetails(orderDetails);

		List<RuleDetailsItem> ruleDetails = new ArrayList<RuleDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommodityPriceResponse.RuleDetails.Length"); i++) {
			RuleDetailsItem ruleDetailsItem = new RuleDetailsItem();
			ruleDetailsItem.setRuleId(_ctx.stringValue("DescribeCommodityPriceResponse.RuleDetails["+ i +"].RuleId"));
			ruleDetailsItem.setRuleName(_ctx.stringValue("DescribeCommodityPriceResponse.RuleDetails["+ i +"].RuleName"));

			ruleDetails.add(ruleDetailsItem);
		}
		describeCommodityPriceResponse.setRuleDetails(ruleDetails);

		List<PromotionDetails> promotions = new ArrayList<PromotionDetails>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommodityPriceResponse.Promotions.Length"); i++) {
			PromotionDetails promotionDetails = new PromotionDetails();
			promotionDetails.setPromotionOptionNo(_ctx.stringValue("DescribeCommodityPriceResponse.Promotions["+ i +"].PromotionOptionNo"));
			promotionDetails.setPromotionName(_ctx.stringValue("DescribeCommodityPriceResponse.Promotions["+ i +"].PromotionName"));
			promotionDetails.setCanPromFee(_ctx.doubleValue("DescribeCommodityPriceResponse.Promotions["+ i +"].CanPromFee"));
			promotionDetails.setSelected(_ctx.booleanValue("DescribeCommodityPriceResponse.Promotions["+ i +"].Selected"));
			promotionDetails.setOptionCode(_ctx.stringValue("DescribeCommodityPriceResponse.Promotions["+ i +"].OptionCode"));

			promotions.add(promotionDetails);
		}
		describeCommodityPriceResponse.setPromotions(promotions);
	 
	 	return describeCommodityPriceResponse;
	}
}