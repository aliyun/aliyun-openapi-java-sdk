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

import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalEventDataResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalEventDataResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalEventDataResponse.Data.EventInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceOriginalEventDataResponseUnmarshaller {

	public static QueryDeviceOriginalEventDataResponse unmarshall(QueryDeviceOriginalEventDataResponse queryDeviceOriginalEventDataResponse, UnmarshallerContext _ctx) {
		
		queryDeviceOriginalEventDataResponse.setRequestId(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.RequestId"));
		queryDeviceOriginalEventDataResponse.setSuccess(_ctx.booleanValue("QueryDeviceOriginalEventDataResponse.Success"));
		queryDeviceOriginalEventDataResponse.setCode(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.Code"));
		queryDeviceOriginalEventDataResponse.setErrorMessage(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setNextPageToken(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.Data.NextPageToken"));
		data.setNextValid(_ctx.booleanValue("QueryDeviceOriginalEventDataResponse.Data.NextValid"));

		List<EventInfo> list = new ArrayList<EventInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceOriginalEventDataResponse.Data.List.Length"); i++) {
			EventInfo eventInfo = new EventInfo();
			eventInfo.setTime(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.Data.List["+ i +"].Time"));
			eventInfo.setIdentifier(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.Data.List["+ i +"].Identifier"));
			eventInfo.setName(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.Data.List["+ i +"].Name"));
			eventInfo.setEventType(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.Data.List["+ i +"].EventType"));
			eventInfo.setOutputData(_ctx.stringValue("QueryDeviceOriginalEventDataResponse.Data.List["+ i +"].OutputData"));

			list.add(eventInfo);
		}
		data.setList(list);
		queryDeviceOriginalEventDataResponse.setData(data);
	 
	 	return queryDeviceOriginalEventDataResponse;
	}
}