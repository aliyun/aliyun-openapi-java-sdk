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

	public static GetSubscriptionPriceResponse unmarshall(GetSubscriptionPriceResponse getSubscriptionPriceResponse, UnmarshallerContext _ctx) {
		
		getSubscriptionPriceResponse.setRequestId(_ctx.stringValue("GetSubscriptionPriceResponse.RequestId"));
		getSubscriptionPriceResponse.setSuccess(_ctx.booleanValue("GetSubscriptionPriceResponse.Success"));
		getSubscriptionPriceResponse.setCode(_ctx.stringValue("GetSubscriptionPriceResponse.Code"));
		getSubscriptionPriceResponse.setMessage(_ctx.stringValue("GetSubscriptionPriceResponse.Message"));

		Data data = new Data();
		data.setOriginalPrice(_ctx.floatValue("GetSubscriptionPriceResponse.Data.OriginalPrice"));
		data.setDiscountPrice(_ctx.floatValue("GetSubscriptionPriceResponse.Data.DiscountPrice"));
		data.setTradePrice(_ctx.floatValue("GetSubscriptionPriceResponse.Data.TradePrice"));
		data.setCurrency(_ctx.stringValue("GetSubscriptionPriceResponse.Data.Currency"));
		data.setQuantity(_ctx.integerValue("GetSubscriptionPriceResponse.Data.Quantity"));

		List<ModuleDetail> moduleDetails = new ArrayList<ModuleDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetSubscriptionPriceResponse.Data.ModuleDetails.Length"); i++) {
			ModuleDetail moduleDetail = new ModuleDetail();
			moduleDetail.setModuleCode(_ctx.stringValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].ModuleCode"));
			moduleDetail.setOriginalCost(_ctx.floatValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].OriginalCost"));
			moduleDetail.setInvoiceDiscount(_ctx.floatValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].InvoiceDiscount"));
			moduleDetail.setCostAfterDiscount(_ctx.floatValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].CostAfterDiscount"));
			moduleDetail.setUnitPrice(_ctx.floatValue("GetSubscriptionPriceResponse.Data.ModuleDetails["+ i +"].UnitPrice"));

			moduleDetails.add(moduleDetail);
		}
		data.setModuleDetails(moduleDetails);

		List<PromotionDetail> promotionDetails = new ArrayList<PromotionDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetSubscriptionPriceResponse.Data.PromotionDetails.Length"); i++) {
			PromotionDetail promotionDetail = new PromotionDetail();
			promotionDetail.setPromotionName(_ctx.stringValue("GetSubscriptionPriceResponse.Data.PromotionDetails["+ i +"].PromotionName"));
			promotionDetail.setPromotionDesc(_ctx.stringValue("GetSubscriptionPriceResponse.Data.PromotionDetails["+ i +"].PromotionDesc"));
			promotionDetail.setPromotionId(_ctx.longValue("GetSubscriptionPriceResponse.Data.PromotionDetails["+ i +"].PromotionId"));

			promotionDetails.add(promotionDetail);
		}
		data.setPromotionDetails(promotionDetails);
		getSubscriptionPriceResponse.setData(data);
	 
	 	return getSubscriptionPriceResponse;
	}
}