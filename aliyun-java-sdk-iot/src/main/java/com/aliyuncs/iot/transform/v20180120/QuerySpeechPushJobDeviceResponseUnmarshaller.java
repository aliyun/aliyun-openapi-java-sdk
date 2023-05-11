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

import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobDeviceResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobDeviceResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobDeviceResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechPushJobDeviceResponseUnmarshaller {

	public static QuerySpeechPushJobDeviceResponse unmarshall(QuerySpeechPushJobDeviceResponse querySpeechPushJobDeviceResponse, UnmarshallerContext _ctx) {
		
		querySpeechPushJobDeviceResponse.setRequestId(_ctx.stringValue("QuerySpeechPushJobDeviceResponse.RequestId"));
		querySpeechPushJobDeviceResponse.setSuccess(_ctx.booleanValue("QuerySpeechPushJobDeviceResponse.Success"));
		querySpeechPushJobDeviceResponse.setCode(_ctx.stringValue("QuerySpeechPushJobDeviceResponse.Code"));
		querySpeechPushJobDeviceResponse.setErrorMessage(_ctx.stringValue("QuerySpeechPushJobDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechPushJobDeviceResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechPushJobDeviceResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechPushJobDeviceResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechPushJobDeviceResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setGmtModified(_ctx.longValue("QuerySpeechPushJobDeviceResponse.Data.List["+ i +"].GmtModified"));
			items.setStatus(_ctx.stringValue("QuerySpeechPushJobDeviceResponse.Data.List["+ i +"].Status"));
			items.setDeviceName(_ctx.stringValue("QuerySpeechPushJobDeviceResponse.Data.List["+ i +"].DeviceName"));
			items.setErrorCode(_ctx.stringValue("QuerySpeechPushJobDeviceResponse.Data.List["+ i +"].ErrorCode"));
			items.setErrorMessage(_ctx.stringValue("QuerySpeechPushJobDeviceResponse.Data.List["+ i +"].ErrorMessage"));

			list.add(items);
		}
		data.setList(list);
		querySpeechPushJobDeviceResponse.setData(data);
	 
	 	return querySpeechPushJobDeviceResponse;
	}
}