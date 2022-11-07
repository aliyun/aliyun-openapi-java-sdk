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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeExecutedResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeExecutedResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeExecutedResponseUnmarshaller {

	public static GetOcJusticeExecutedResponse unmarshall(GetOcJusticeExecutedResponse getOcJusticeExecutedResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeExecutedResponse.setRequestId(_ctx.stringValue("GetOcJusticeExecutedResponse.RequestId"));
		getOcJusticeExecutedResponse.setCode(_ctx.stringValue("GetOcJusticeExecutedResponse.Code"));
		getOcJusticeExecutedResponse.setSuccess(_ctx.booleanValue("GetOcJusticeExecutedResponse.Success"));
		getOcJusticeExecutedResponse.setMessage(_ctx.stringValue("GetOcJusticeExecutedResponse.Message"));
		getOcJusticeExecutedResponse.setTotalNum(_ctx.integerValue("GetOcJusticeExecutedResponse.TotalNum"));
		getOcJusticeExecutedResponse.setPageIndex(_ctx.integerValue("GetOcJusticeExecutedResponse.PageIndex"));
		getOcJusticeExecutedResponse.setPageNum(_ctx.integerValue("GetOcJusticeExecutedResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeExecutedResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCaseNum(_ctx.stringValue("GetOcJusticeExecutedResponse.Data["+ i +"].CaseNum"));
			dataItem.setFilingDate(_ctx.stringValue("GetOcJusticeExecutedResponse.Data["+ i +"].FilingDate"));
			dataItem.setCourt(_ctx.stringValue("GetOcJusticeExecutedResponse.Data["+ i +"].Court"));
			dataItem.setAmount(_ctx.stringValue("GetOcJusticeExecutedResponse.Data["+ i +"].Amount"));

			data.add(dataItem);
		}
		getOcJusticeExecutedResponse.setData(data);
	 
	 	return getOcJusticeExecutedResponse;
	}
}