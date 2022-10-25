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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcDoubleCheckupResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcDoubleCheckupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcDoubleCheckupResponseUnmarshaller {

	public static GetOcIcDoubleCheckupResponse unmarshall(GetOcIcDoubleCheckupResponse getOcIcDoubleCheckupResponse, UnmarshallerContext _ctx) {
		
		getOcIcDoubleCheckupResponse.setRequestId(_ctx.stringValue("GetOcIcDoubleCheckupResponse.RequestId"));
		getOcIcDoubleCheckupResponse.setCode(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Code"));
		getOcIcDoubleCheckupResponse.setSuccess(_ctx.booleanValue("GetOcIcDoubleCheckupResponse.Success"));
		getOcIcDoubleCheckupResponse.setMessage(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Message"));
		getOcIcDoubleCheckupResponse.setTotalNum(_ctx.integerValue("GetOcIcDoubleCheckupResponse.TotalNum"));
		getOcIcDoubleCheckupResponse.setPageIndex(_ctx.integerValue("GetOcIcDoubleCheckupResponse.PageIndex"));
		getOcIcDoubleCheckupResponse.setPageNum(_ctx.integerValue("GetOcIcDoubleCheckupResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcDoubleCheckupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInspectPlanId(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectPlanId"));
			dataItem.setInspectPlanName(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectPlanName"));
			dataItem.setInspectTaskId(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectTaskId"));
			dataItem.setInspectTaskName(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectTaskName"));
			dataItem.setInspectTypeName(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectTypeName"));
			dataItem.setInspectDepartment(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectDepartment"));
			dataItem.setInspectDate(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectDate"));
			dataItem.setInspectItem(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectItem"));
			dataItem.setInspectResult(_ctx.stringValue("GetOcIcDoubleCheckupResponse.Data["+ i +"].InspectResult"));

			data.add(dataItem);
		}
		getOcIcDoubleCheckupResponse.setData(data);
	 
	 	return getOcIcDoubleCheckupResponse;
	}
}