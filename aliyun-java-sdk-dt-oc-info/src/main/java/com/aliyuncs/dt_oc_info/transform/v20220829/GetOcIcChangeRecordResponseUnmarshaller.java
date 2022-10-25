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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcChangeRecordResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcChangeRecordResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcChangeRecordResponseUnmarshaller {

	public static GetOcIcChangeRecordResponse unmarshall(GetOcIcChangeRecordResponse getOcIcChangeRecordResponse, UnmarshallerContext _ctx) {
		
		getOcIcChangeRecordResponse.setRequestId(_ctx.stringValue("GetOcIcChangeRecordResponse.RequestId"));
		getOcIcChangeRecordResponse.setCode(_ctx.stringValue("GetOcIcChangeRecordResponse.Code"));
		getOcIcChangeRecordResponse.setSuccess(_ctx.booleanValue("GetOcIcChangeRecordResponse.Success"));
		getOcIcChangeRecordResponse.setMessage(_ctx.stringValue("GetOcIcChangeRecordResponse.Message"));
		getOcIcChangeRecordResponse.setTotalNum(_ctx.integerValue("GetOcIcChangeRecordResponse.TotalNum"));
		getOcIcChangeRecordResponse.setPageIndex(_ctx.integerValue("GetOcIcChangeRecordResponse.PageIndex"));
		getOcIcChangeRecordResponse.setPageNum(_ctx.integerValue("GetOcIcChangeRecordResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcChangeRecordResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setType(_ctx.stringValue("GetOcIcChangeRecordResponse.Data["+ i +"].Type"));
			dataItem.setChangeDate(_ctx.stringValue("GetOcIcChangeRecordResponse.Data["+ i +"].ChangeDate"));
			dataItem.setBeforeContent(_ctx.stringValue("GetOcIcChangeRecordResponse.Data["+ i +"].BeforeContent"));
			dataItem.setAfterContent(_ctx.stringValue("GetOcIcChangeRecordResponse.Data["+ i +"].AfterContent"));

			data.add(dataItem);
		}
		getOcIcChangeRecordResponse.setData(data);
	 
	 	return getOcIcChangeRecordResponse;
	}
}