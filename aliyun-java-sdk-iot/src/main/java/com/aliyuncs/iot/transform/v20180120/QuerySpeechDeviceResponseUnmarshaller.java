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

import com.aliyuncs.iot.model.v20180120.QuerySpeechDeviceResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechDeviceResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechDeviceResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechDeviceResponseUnmarshaller {

	public static QuerySpeechDeviceResponse unmarshall(QuerySpeechDeviceResponse querySpeechDeviceResponse, UnmarshallerContext _ctx) {
		
		querySpeechDeviceResponse.setRequestId(_ctx.stringValue("QuerySpeechDeviceResponse.RequestId"));
		querySpeechDeviceResponse.setSuccess(_ctx.booleanValue("QuerySpeechDeviceResponse.Success"));
		querySpeechDeviceResponse.setCode(_ctx.stringValue("QuerySpeechDeviceResponse.Code"));
		querySpeechDeviceResponse.setErrorMessage(_ctx.stringValue("QuerySpeechDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechDeviceResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechDeviceResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechDeviceResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechDeviceResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setProductKey(_ctx.stringValue("QuerySpeechDeviceResponse.Data.List["+ i +"].ProductKey"));
			items.setDeviceName(_ctx.stringValue("QuerySpeechDeviceResponse.Data.List["+ i +"].DeviceName"));
			items.setIotId(_ctx.stringValue("QuerySpeechDeviceResponse.Data.List["+ i +"].IotId"));
			items.setAvailableSpace(_ctx.floatValue("QuerySpeechDeviceResponse.Data.List["+ i +"].AvailableSpace"));

			list.add(items);
		}
		data.setList(list);
		querySpeechDeviceResponse.setData(data);
	 
	 	return querySpeechDeviceResponse;
	}
}