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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcEmployeeResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcEmployeeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcEmployeeResponseUnmarshaller {

	public static GetOcIcEmployeeResponse unmarshall(GetOcIcEmployeeResponse getOcIcEmployeeResponse, UnmarshallerContext _ctx) {
		
		getOcIcEmployeeResponse.setRequestId(_ctx.stringValue("GetOcIcEmployeeResponse.RequestId"));
		getOcIcEmployeeResponse.setCode(_ctx.stringValue("GetOcIcEmployeeResponse.Code"));
		getOcIcEmployeeResponse.setSuccess(_ctx.booleanValue("GetOcIcEmployeeResponse.Success"));
		getOcIcEmployeeResponse.setMessage(_ctx.stringValue("GetOcIcEmployeeResponse.Message"));
		getOcIcEmployeeResponse.setTotalNum(_ctx.integerValue("GetOcIcEmployeeResponse.TotalNum"));
		getOcIcEmployeeResponse.setPageIndex(_ctx.integerValue("GetOcIcEmployeeResponse.PageIndex"));
		getOcIcEmployeeResponse.setPageNum(_ctx.integerValue("GetOcIcEmployeeResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcEmployeeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("GetOcIcEmployeeResponse.Data["+ i +"].Name"));
			dataItem.setJobTitle(_ctx.stringValue("GetOcIcEmployeeResponse.Data["+ i +"].JobTitle"));

			data.add(dataItem);
		}
		getOcIcEmployeeResponse.setData(data);
	 
	 	return getOcIcEmployeeResponse;
	}
}