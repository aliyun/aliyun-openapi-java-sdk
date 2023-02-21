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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcFinancingResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcFinancingResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcFinancingResponseUnmarshaller {

	public static GetOcFinancingResponse unmarshall(GetOcFinancingResponse getOcFinancingResponse, UnmarshallerContext _ctx) {
		
		getOcFinancingResponse.setRequestId(_ctx.stringValue("GetOcFinancingResponse.RequestId"));
		getOcFinancingResponse.setCode(_ctx.stringValue("GetOcFinancingResponse.Code"));
		getOcFinancingResponse.setSuccess(_ctx.booleanValue("GetOcFinancingResponse.Success"));
		getOcFinancingResponse.setMessage(_ctx.stringValue("GetOcFinancingResponse.Message"));
		getOcFinancingResponse.setTotalNum(_ctx.integerValue("GetOcFinancingResponse.TotalNum"));
		getOcFinancingResponse.setPageIndex(_ctx.integerValue("GetOcFinancingResponse.PageIndex"));
		getOcFinancingResponse.setPageNum(_ctx.integerValue("GetOcFinancingResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcFinancingResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcFinancingResponse.Data["+ i +"].EntName"));
			dataItem.setFinDate(_ctx.stringValue("GetOcFinancingResponse.Data["+ i +"].FinDate"));
			dataItem.setFinTurn(_ctx.stringValue("GetOcFinancingResponse.Data["+ i +"].FinTurn"));
			dataItem.setFinAmount(_ctx.stringValue("GetOcFinancingResponse.Data["+ i +"].FinAmount"));
			dataItem.setInvestors(_ctx.stringValue("GetOcFinancingResponse.Data["+ i +"].Investors"));

			data.add(dataItem);
		}
		getOcFinancingResponse.setData(data);
	 
	 	return getOcFinancingResponse;
	}
}