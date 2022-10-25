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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcInvestmentResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcInvestmentResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcInvestmentResponseUnmarshaller {

	public static GetOcIcInvestmentResponse unmarshall(GetOcIcInvestmentResponse getOcIcInvestmentResponse, UnmarshallerContext _ctx) {
		
		getOcIcInvestmentResponse.setRequestId(_ctx.stringValue("GetOcIcInvestmentResponse.RequestId"));
		getOcIcInvestmentResponse.setCode(_ctx.stringValue("GetOcIcInvestmentResponse.Code"));
		getOcIcInvestmentResponse.setSuccess(_ctx.booleanValue("GetOcIcInvestmentResponse.Success"));
		getOcIcInvestmentResponse.setMessage(_ctx.stringValue("GetOcIcInvestmentResponse.Message"));
		getOcIcInvestmentResponse.setTotalNum(_ctx.integerValue("GetOcIcInvestmentResponse.TotalNum"));
		getOcIcInvestmentResponse.setPageIndex(_ctx.integerValue("GetOcIcInvestmentResponse.PageIndex"));
		getOcIcInvestmentResponse.setPageNum(_ctx.integerValue("GetOcIcInvestmentResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcInvestmentResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].EntName"));
			dataItem.setInvestName(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].InvestName"));
			dataItem.setInvestCreditCode(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].InvestCreditCode"));
			dataItem.setInvestLicenseNo(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].InvestLicenseNo"));
			dataItem.setInvestEsDate(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].InvestEsDate"));
			dataItem.setInvestLegalName(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].InvestLegalName"));
			dataItem.setInvestRegCap(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].InvestRegCap"));
			dataItem.setInvestStatus(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].InvestStatus"));
			dataItem.setShouldCap(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].ShouldCap"));
			dataItem.setStockPercentage(_ctx.stringValue("GetOcIcInvestmentResponse.Data["+ i +"].StockPercentage"));

			data.add(dataItem);
		}
		getOcIcInvestmentResponse.setData(data);
	 
	 	return getOcIcInvestmentResponse;
	}
}