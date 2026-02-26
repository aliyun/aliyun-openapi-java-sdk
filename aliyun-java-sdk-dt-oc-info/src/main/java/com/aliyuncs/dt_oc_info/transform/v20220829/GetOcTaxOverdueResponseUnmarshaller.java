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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxOverdueResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxOverdueResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcTaxOverdueResponseUnmarshaller {

	public static GetOcTaxOverdueResponse unmarshall(GetOcTaxOverdueResponse getOcTaxOverdueResponse, UnmarshallerContext _ctx) {
		
		getOcTaxOverdueResponse.setRequestId(_ctx.stringValue("GetOcTaxOverdueResponse.RequestId"));
		getOcTaxOverdueResponse.setCode(_ctx.stringValue("GetOcTaxOverdueResponse.Code"));
		getOcTaxOverdueResponse.setSuccess(_ctx.booleanValue("GetOcTaxOverdueResponse.Success"));
		getOcTaxOverdueResponse.setMessage(_ctx.stringValue("GetOcTaxOverdueResponse.Message"));
		getOcTaxOverdueResponse.setTotalNum(_ctx.integerValue("GetOcTaxOverdueResponse.TotalNum"));
		getOcTaxOverdueResponse.setPageIndex(_ctx.integerValue("GetOcTaxOverdueResponse.PageIndex"));
		getOcTaxOverdueResponse.setPageNum(_ctx.integerValue("GetOcTaxOverdueResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcTaxOverdueResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].EntName"));
			dataItem.setOverdueType(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].OverdueType"));
			dataItem.setEntAddress(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].EntAddress"));
			dataItem.setOverdueAmount(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].OverdueAmount"));
			dataItem.setLegalName(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].LegalName"));
			dataItem.setTaxpayerType(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].TaxpayerType"));
			dataItem.setTaxpayerNum(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].TaxpayerNum"));
			dataItem.setDepartment(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].Department"));
			dataItem.setCurrOverdueAmount(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].CurrOverdueAmount"));
			dataItem.setPublishDate(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"].PublishDate"));

			data.add(dataItem);
		}
		getOcTaxOverdueResponse.setData(data);
	 
	 	return getOcTaxOverdueResponse;
	}
}