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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcListedCompanyResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcListedCompanyResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcListedCompanyResponseUnmarshaller {

	public static GetOcListedCompanyResponse unmarshall(GetOcListedCompanyResponse getOcListedCompanyResponse, UnmarshallerContext _ctx) {
		
		getOcListedCompanyResponse.setRequestId(_ctx.stringValue("GetOcListedCompanyResponse.RequestId"));
		getOcListedCompanyResponse.setCode(_ctx.stringValue("GetOcListedCompanyResponse.Code"));
		getOcListedCompanyResponse.setSuccess(_ctx.booleanValue("GetOcListedCompanyResponse.Success"));
		getOcListedCompanyResponse.setMessage(_ctx.stringValue("GetOcListedCompanyResponse.Message"));
		getOcListedCompanyResponse.setTotalNum(_ctx.integerValue("GetOcListedCompanyResponse.TotalNum"));
		getOcListedCompanyResponse.setPageIndex(_ctx.integerValue("GetOcListedCompanyResponse.PageIndex"));
		getOcListedCompanyResponse.setPageNum(_ctx.integerValue("GetOcListedCompanyResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcListedCompanyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].EntName"));
			dataItem.setEntNameEng(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].EntNameEng"));
			dataItem.setSecuritiesCode(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].SecuritiesCode"));
			dataItem.setSecuritiesName(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].SecuritiesName"));
			dataItem.setSecuritiesMarket(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].SecuritiesMarket"));
			dataItem.setListDate(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].ListDate"));
			dataItem.setTotalShares(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].TotalShares"));
			dataItem.setTotalFlowShares(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].TotalFlowShares"));
			dataItem.setCirculationMarketValue(_ctx.stringValue("GetOcListedCompanyResponse.Data["+ i +"].CirculationMarketValue"));

			data.add(dataItem);
		}
		getOcListedCompanyResponse.setData(data);
	 
	 	return getOcListedCompanyResponse;
	}
}