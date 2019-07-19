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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPayAsYouGoPriceResponseUnmarshaller {

	public static GetPayAsYouGoPriceResponse unmarshall(GetPayAsYouGoPriceResponse getPayAsYouGoPriceResponse, UnmarshallerContext _ctx) {
		
		getPayAsYouGoPriceResponse.setRequestId(_ctx.stringValue("GetPayAsYouGoPriceResponse.RequestId"));
		getPayAsYouGoPriceResponse.setSuccess(_ctx.booleanValue("GetPayAsYouGoPriceResponse.Success"));
		getPayAsYouGoPriceResponse.setCode(_ctx.stringValue("GetPayAsYouGoPriceResponse.Code"));
		getPayAsYouGoPriceResponse.setMessage(_ctx.stringValue("GetPayAsYouGoPriceResponse.Message"));

		Data data = new Data();
		data.setCurrency(_ctx.stringValue("GetPayAsYouGoPriceResponse.Data.Currency"));

		List<ModuleDetail> moduleDetails = new ArrayList<ModuleDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails.Length"); i++) {
			ModuleDetail moduleDetail = new ModuleDetail();
			moduleDetail.setModuleCode(_ctx.stringValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].ModuleCode"));
			moduleDetail.setOriginalCost(_ctx.floatValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].OriginalCost"));
			moduleDetail.setInvoiceDiscount(_ctx.floatValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].InvoiceDiscount"));
			moduleDetail.setCostAfterDiscount(_ctx.floatValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].CostAfterDiscount"));
			moduleDetail.setUnitPrice(_ctx.floatValue("GetPayAsYouGoPriceResponse.Data.ModuleDetails["+ i +"].UnitPrice"));

			moduleDetails.add(moduleDetail);
		}
		data.setModuleDetails(moduleDetails);

		List<PromotionDetail> promotionDetails = new ArrayList<PromotionDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetPayAsYouGoPriceResponse.Data.PromotionDetails.Length"); i++) {
			PromotionDetail promotionDetail = new PromotionDetail();
			promotionDetail.setPromotionName(_ctx.stringValue("GetPayAsYouGoPriceResponse.Data.PromotionDetails["+ i +"].PromotionName"));
			promotionDetail.setPromotionDesc(_ctx.stringValue("GetPayAsYouGoPriceResponse.Data.PromotionDetails["+ i +"].PromotionDesc"));
			promotionDetail.setPromotionId(_ctx.longValue("GetPayAsYouGoPriceResponse.Data.PromotionDetails["+ i +"].PromotionId"));

			promotionDetails.add(promotionDetail);
		}
		data.setPromotionDetails(promotionDetails);
		getPayAsYouGoPriceResponse.setData(data);
	 
	 	return getPayAsYouGoPriceResponse;
	}
}