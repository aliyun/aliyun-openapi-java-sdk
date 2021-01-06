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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListPersonTraceResponse;
import com.aliyuncs.cdrs.model.v20201101.ListPersonTraceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonTraceResponseUnmarshaller {

	public static ListPersonTraceResponse unmarshall(ListPersonTraceResponse listPersonTraceResponse, UnmarshallerContext _ctx) {
		
		listPersonTraceResponse.setRequestId(_ctx.stringValue("ListPersonTraceResponse.RequestId"));
		listPersonTraceResponse.setCode(_ctx.stringValue("ListPersonTraceResponse.Code"));
		listPersonTraceResponse.setMessage(_ctx.stringValue("ListPersonTraceResponse.Message"));
		listPersonTraceResponse.setSuccess(_ctx.stringValue("ListPersonTraceResponse.Success"));
		listPersonTraceResponse.setTotalCount(_ctx.integerValue("ListPersonTraceResponse.TotalCount"));
		listPersonTraceResponse.setPageSize(_ctx.integerValue("ListPersonTraceResponse.PageSize"));
		listPersonTraceResponse.setPageNumber(_ctx.integerValue("ListPersonTraceResponse.PageNumber"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonTraceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDate(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].Date"));
			dataItem.setLastTime(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].LastTime"));
			dataItem.setStartTime(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].StartTime"));
			dataItem.setEndSourceImage(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].EndSourceImage"));
			dataItem.setDeviceId(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].DeviceId"));
			dataItem.setStartTargetImage(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].StartTargetImage"));
			dataItem.setGroupId(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].GroupId"));
			dataItem.setPersonId(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].PersonId"));
			dataItem.setStartSourceImage(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].StartSourceImage"));
			dataItem.setCorpId(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].CorpId"));
			dataItem.setEndTargetImage(_ctx.stringValue("ListPersonTraceResponse.Data["+ i +"].EndTargetImage"));

			data.add(dataItem);
		}
		listPersonTraceResponse.setData(data);
	 
	 	return listPersonTraceResponse;
	}
}