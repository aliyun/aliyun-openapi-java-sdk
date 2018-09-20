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

import com.aliyuncs.bssopenapi.model.v20171214.GetPayAsYouGoPriceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.GetPayAsYouGoPriceResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.GetPayAsYouGoPriceResponse.Data.ModuleDetail;
import com.aliyuncs.bssopenapi.model.v20171214.GetPayAsYouGoPriceResponse.Data.PromotionDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPayAsYouGoPriceResponseUnmarshaller {

	public static GetPayAsYouGoPriceResponse unmarshall(GetPayAsYouGoPriceResponse getPayAsYouGoPriceResponse, UnmarshallerContext context) {
		
		getPayAsYouGoPriceResponse.setRequestId(context.stringValue("GetPayAsYouGoPriceResponse.RequestId"));
		getPayAsYouGoPriceResponse.setSuccess(context.booleanValue("GetPayAsYouGoPriceResponse.Success"));
		getPayAsYouGoPriceResponse.setCode(context.stringValue("GetPayAsYouGoPriceResponse.Code"));
		getPayAsYouGoPriceResponse.setMessage(context.stringValue("GetPayAsYouGoPriceResponse.Message"));

		Data data = new Data();
		data.setCurrency(context.stringValue("GetPayAsYouGoPriceResponse.Data.Currency"));

		List<ModuleDetail> moduleDetails = new ArrayList<ModuleDetail>();
		for (int i = 0; i < context.lengthValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails.Length"); i++) {
			ModuleDetail moduleDetail = new ModuleDetail();
			moduleDetail.setModuleCode(context.stringValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].ModuleCode"));
			moduleDetail.setOriginalCost(context.floatValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].OriginalCost"));
			moduleDetail.setInvoiceDiscount(context.floatValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].InvoiceDiscount"));
			moduleDetail.setCostAfterDiscount(context.floatValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].CostAfterDiscount"));
			moduleDetail.setUnitPrice(context.floatValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].UnitPrice"));

			moduleDetails.add(moduleDetail);
		}
		data.setModuleDetails(moduleDetails);

		List<PromotionDetail> promotionDetails = new ArrayList<PromotionDetail>();
		for (int i = 0; i < context.lengthValue("GetPayAsYouGoPriceResponse.Data.PromotionDetails.Length"); i++) {
			PromotionDetail promotionDetail = new PromotionDetail();
			promotionDetail.setPromotionName(context.stringValue("GetPayAsYouGoPriceResponse.Data.PromotionDetails["+ i +"].PromotionName"));
			promotionDetail.setPromotionDesc(context.stringValue("GetPayAsYouGoPriceResponse.Data.PromotionDetails["+ i +"].PromotionDesc"));
			promotionDetail.setPromotionId(context.longValue("GetPayAsYouGoPriceResponse.Data.PromotionDetails["+ i +"].PromotionId"));

			promotionDetails.add(promotionDetail);
		}
		data.setPromotionDetails(promotionDetails);
		getPayAsYouGoPriceResponse.setData(data);
	 
	 	return getPayAsYouGoPriceResponse;
	}
}