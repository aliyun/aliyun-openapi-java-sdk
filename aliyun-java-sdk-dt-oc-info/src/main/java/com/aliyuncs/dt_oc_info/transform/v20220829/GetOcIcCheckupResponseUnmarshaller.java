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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcCheckupResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcCheckupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcCheckupResponseUnmarshaller {

	public static GetOcIcCheckupResponse unmarshall(GetOcIcCheckupResponse getOcIcCheckupResponse, UnmarshallerContext _ctx) {
		
		getOcIcCheckupResponse.setRequestId(_ctx.stringValue("GetOcIcCheckupResponse.RequestId"));
		getOcIcCheckupResponse.setCode(_ctx.stringValue("GetOcIcCheckupResponse.Code"));
		getOcIcCheckupResponse.setSuccess(_ctx.booleanValue("GetOcIcCheckupResponse.Success"));
		getOcIcCheckupResponse.setMessage(_ctx.stringValue("GetOcIcCheckupResponse.Message"));
		getOcIcCheckupResponse.setTotalNum(_ctx.integerValue("GetOcIcCheckupResponse.TotalNum"));
		getOcIcCheckupResponse.setPageIndex(_ctx.integerValue("GetOcIcCheckupResponse.PageIndex"));
		getOcIcCheckupResponse.setPageNum(_ctx.integerValue("GetOcIcCheckupResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcCheckupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDepartment(_ctx.stringValue("GetOcIcCheckupResponse.Data["+ i +"].Department"));
			dataItem.setDate(_ctx.stringValue("GetOcIcCheckupResponse.Data["+ i +"].Date"));
			dataItem.setType(_ctx.stringValue("GetOcIcCheckupResponse.Data["+ i +"].Type"));
			dataItem.setResult(_ctx.stringValue("GetOcIcCheckupResponse.Data["+ i +"].Result"));

			data.add(dataItem);
		}
		getOcIcCheckupResponse.setData(data);
	 
	 	return getOcIcCheckupResponse;
	}
}