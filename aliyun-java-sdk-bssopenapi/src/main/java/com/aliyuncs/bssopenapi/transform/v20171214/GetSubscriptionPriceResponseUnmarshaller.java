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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.GetSubscriptionPriceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.GetSubscriptionPriceResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.GetSubscriptionPriceResponse.Data.ModuleDetail;
import com.aliyuncs.bssopenapi.model.v20171214.GetSubscriptionPriceResponse.Data.PromotionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubscriptionPriceResponseUnmarshaller {

	public static GetSubscriptionPriceResponse unmarshall(GetSubscriptionPriceResponse getSubscriptionPriceResponse, UnmarshallerContext context) {
		
		getSubscriptionPriceResponse.setRequestId(context.stringValue("GetSubscriptionPriceResponse.RequestId"));
		getSubscriptionPriceResponse.setSuccess(context.booleanValue("GetSubscriptionPriceResponse.Success"));
		getSubscriptionPriceResponse.setCode(context.stringValue("GetSubscriptionPriceResponse.Code"));
		getSubscriptionPriceResponse.setMessage(context.stringValue("GetSubscriptionPriceResponse.Message"));

		Data data = new Data();
		data.setOriginalPrice(context.floatValue("GetSubscriptionPriceResponse.Data.OriginalPrice"));
		data.setDiscountPrice(context.floatValue("GetSubscriptionPriceResponse.Data.DiscountPrice"));
		data.setTradePrice(context.floatValue("GetSubscriptionPriceResponse.Data.TradePrice"));
		data.setCurrency(context.stringValue("GetSubscriptionPriceResponse.Data.Currency"));
		data.setQuantity(context.integerValue("GetSubscriptionPriceResponse.Data.Quantity"));

		List<ModuleDetail> moduleDetails = new ArrayList<ModuleDetail>();
		for (int i = 0; i < context.lengthValue("GetSubscriptionPriceResponse.Data.ModuleDetails.Length"); i++) {
			ModuleDetail moduleDetail = new ModuleDetail();
			moduleDetail.setModuleCode(context.stringValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].ModuleCode"));
			moduleDetail.setOriginalCost(context.floatValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].OriginalCost"));
			moduleDetail.setInvoiceDiscount(context.floatValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].InvoiceDiscount"));
			moduleDetail.setCostAfterDiscount(context.floatValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].CostAfterDiscount"));
			moduleDetail.setUnitPrice(context.floatValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].UnitPrice"));

			moduleDetails.add(moduleDetail);
		}
		data.setModuleDetails(moduleDetails);

		List<PromotionDetail> promotionDetails = new ArrayList<PromotionDetail>();
		for (int i = 0; i < context.lengthValue("GetSubscriptionPriceResponse.Data.PromotionDetails.Length"); i++) {
			PromotionDetail promotionDetail = new PromotionDetail();
			promotionDetail.setPromotionName(context.stringValue("GetSubscriptionPriceResponse.Data.PromotionDetails["+ i +"].PromotionName"));
			promotionDetail.setPromotionDesc(context.stringValue("GetSubscriptionPriceResponse.Data.PromotionDetails["+ i +"].PromotionDesc"));
			promotionDetail.setPromotionId(context.longValue("GetSubscriptionPriceResponse.Data.PromotionDetails["+ i +"].PromotionId"));

			promotionDetails.add(promotionDetail);
		}
		data.setPromotionDetails(promotionDetails);
		getSubscriptionPriceResponse.setData(data);
	 
	 	return getSubscriptionPriceResponse;
	}
}