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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcSeriousOffenseResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcSeriousOffenseResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcSeriousOffenseResponseUnmarshaller {

	public static GetOcIcSeriousOffenseResponse unmarshall(GetOcIcSeriousOffenseResponse getOcIcSeriousOffenseResponse, UnmarshallerContext _ctx) {
		
		getOcIcSeriousOffenseResponse.setRequestId(_ctx.stringValue("GetOcIcSeriousOffenseResponse.RequestId"));
		getOcIcSeriousOffenseResponse.setCode(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Code"));
		getOcIcSeriousOffenseResponse.setSuccess(_ctx.booleanValue("GetOcIcSeriousOffenseResponse.Success"));
		getOcIcSeriousOffenseResponse.setMessage(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Message"));
		getOcIcSeriousOffenseResponse.setTotalNum(_ctx.integerValue("GetOcIcSeriousOffenseResponse.TotalNum"));
		getOcIcSeriousOffenseResponse.setPageIndex(_ctx.integerValue("GetOcIcSeriousOffenseResponse.PageIndex"));
		getOcIcSeriousOffenseResponse.setPageNum(_ctx.integerValue("GetOcIcSeriousOffenseResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcSeriousOffenseResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Data["+ i +"].EntName"));
			dataItem.setInReason(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Data["+ i +"].InReason"));
			dataItem.setInDate(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Data["+ i +"].InDate"));
			dataItem.setOutReason(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Data["+ i +"].OutReason"));
			dataItem.setOutDate(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Data["+ i +"].OutDate"));
			dataItem.setInDepartment(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Data["+ i +"].InDepartment"));
			dataItem.setOutDepartment(_ctx.stringValue("GetOcIcSeriousOffenseResponse.Data["+ i +"].OutDepartment"));

			data.add(dataItem);
		}
		getOcIcSeriousOffenseResponse.setData(data);
	 
	 	return getOcIcSeriousOffenseResponse;
	}
}