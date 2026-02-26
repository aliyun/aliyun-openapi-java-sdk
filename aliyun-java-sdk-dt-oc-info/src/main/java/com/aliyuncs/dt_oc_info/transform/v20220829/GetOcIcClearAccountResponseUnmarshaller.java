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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcClearAccountResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcClearAccountResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcClearAccountResponseUnmarshaller {

	public static GetOcIcClearAccountResponse unmarshall(GetOcIcClearAccountResponse getOcIcClearAccountResponse, UnmarshallerContext _ctx) {
		
		getOcIcClearAccountResponse.setRequestId(_ctx.stringValue("GetOcIcClearAccountResponse.RequestId"));
		getOcIcClearAccountResponse.setCode(_ctx.stringValue("GetOcIcClearAccountResponse.Code"));
		getOcIcClearAccountResponse.setSuccess(_ctx.booleanValue("GetOcIcClearAccountResponse.Success"));
		getOcIcClearAccountResponse.setMessage(_ctx.stringValue("GetOcIcClearAccountResponse.Message"));
		getOcIcClearAccountResponse.setTotalNum(_ctx.integerValue("GetOcIcClearAccountResponse.TotalNum"));
		getOcIcClearAccountResponse.setPageIndex(_ctx.integerValue("GetOcIcClearAccountResponse.PageIndex"));
		getOcIcClearAccountResponse.setPageNum(_ctx.integerValue("GetOcIcClearAccountResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcClearAccountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLeader(_ctx.stringValue("GetOcIcClearAccountResponse.Data["+ i +"].Leader"));
			dataItem.setMember(_ctx.stringValue("GetOcIcClearAccountResponse.Data["+ i +"].Member"));

			data.add(dataItem);
		}
		getOcIcClearAccountResponse.setData(data);
	 
	 	return getOcIcClearAccountResponse;
	}
}