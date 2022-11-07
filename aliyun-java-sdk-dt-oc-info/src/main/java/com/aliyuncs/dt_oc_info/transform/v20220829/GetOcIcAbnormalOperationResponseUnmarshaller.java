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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcAbnormalOperationResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcAbnormalOperationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcAbnormalOperationResponseUnmarshaller {

	public static GetOcIcAbnormalOperationResponse unmarshall(GetOcIcAbnormalOperationResponse getOcIcAbnormalOperationResponse, UnmarshallerContext _ctx) {
		
		getOcIcAbnormalOperationResponse.setRequestId(_ctx.stringValue("GetOcIcAbnormalOperationResponse.RequestId"));
		getOcIcAbnormalOperationResponse.setCode(_ctx.stringValue("GetOcIcAbnormalOperationResponse.Code"));
		getOcIcAbnormalOperationResponse.setSuccess(_ctx.booleanValue("GetOcIcAbnormalOperationResponse.Success"));
		getOcIcAbnormalOperationResponse.setMessage(_ctx.stringValue("GetOcIcAbnormalOperationResponse.Message"));
		getOcIcAbnormalOperationResponse.setTotalNum(_ctx.integerValue("GetOcIcAbnormalOperationResponse.TotalNum"));
		getOcIcAbnormalOperationResponse.setPageIndex(_ctx.integerValue("GetOcIcAbnormalOperationResponse.PageIndex"));
		getOcIcAbnormalOperationResponse.setPageNum(_ctx.integerValue("GetOcIcAbnormalOperationResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcAbnormalOperationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInDate(_ctx.stringValue("GetOcIcAbnormalOperationResponse.Data["+ i +"].InDate"));
			dataItem.setInReason(_ctx.stringValue("GetOcIcAbnormalOperationResponse.Data["+ i +"].InReason"));
			dataItem.setInDepartment(_ctx.stringValue("GetOcIcAbnormalOperationResponse.Data["+ i +"].InDepartment"));
			dataItem.setOutDate(_ctx.stringValue("GetOcIcAbnormalOperationResponse.Data["+ i +"].OutDate"));
			dataItem.setOutReason(_ctx.stringValue("GetOcIcAbnormalOperationResponse.Data["+ i +"].OutReason"));
			dataItem.setOutDepartment(_ctx.stringValue("GetOcIcAbnormalOperationResponse.Data["+ i +"].OutDepartment"));

			data.add(dataItem);
		}
		getOcIcAbnormalOperationResponse.setData(data);
	 
	 	return getOcIcAbnormalOperationResponse;
	}
}