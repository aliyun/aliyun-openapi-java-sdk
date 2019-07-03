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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDeviceEventDataResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceEventDataResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceEventDataResponse.Data.EventInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceEventDataResponseUnmarshaller {

	public static QueryDeviceEventDataResponse unmarshall(QueryDeviceEventDataResponse queryDeviceEventDataResponse, UnmarshallerContext _ctx) {
		
		queryDeviceEventDataResponse.setRequestId(_ctx.stringValue("QueryDeviceEventDataResponse.RequestId"));
		queryDeviceEventDataResponse.setSuccess(_ctx.booleanValue("QueryDeviceEventDataResponse.Success"));
		queryDeviceEventDataResponse.setCode(_ctx.stringValue("QueryDeviceEventDataResponse.Code"));
		queryDeviceEventDataResponse.setErrorMessage(_ctx.stringValue("QueryDeviceEventDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setNextTime(_ctx.longValue("QueryDeviceEventDataResponse.Data.NextTime"));
		data.setNextValid(_ctx.booleanValue("QueryDeviceEventDataResponse.Data.NextValid"));

		List<EventInfo> list = new ArrayList<EventInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceEventDataResponse.Data.List.Length"); i++) {
			EventInfo eventInfo = new EventInfo();
			eventInfo.setTime(_ctx.stringValue("QueryDeviceEventDataResponse.Data.List["+ i +"].Time"));
			eventInfo.setIdentifier(_ctx.stringValue("QueryDeviceEventDataResponse.Data.List["+ i +"].Identifier"));
			eventInfo.setName(_ctx.stringValue("QueryDeviceEventDataResponse.Data.List["+ i +"].Name"));
			eventInfo.setEventType(_ctx.stringValue("QueryDeviceEventDataResponse.Data.List["+ i +"].EventType"));
			eventInfo.setOutputData(_ctx.stringValue("QueryDeviceEventDataResponse.Data.List["+ i +"].OutputData"));

			list.add(eventInfo);
		}
		data.setList(list);
		queryDeviceEventDataResponse.setData(data);
	 
	 	return queryDeviceEventDataResponse;
	}
}