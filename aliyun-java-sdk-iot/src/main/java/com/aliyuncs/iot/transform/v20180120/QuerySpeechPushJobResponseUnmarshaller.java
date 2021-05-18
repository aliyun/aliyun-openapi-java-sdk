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

import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechPushJobResponseUnmarshaller {

	public static QuerySpeechPushJobResponse unmarshall(QuerySpeechPushJobResponse querySpeechPushJobResponse, UnmarshallerContext _ctx) {
		
		querySpeechPushJobResponse.setRequestId(_ctx.stringValue("QuerySpeechPushJobResponse.RequestId"));
		querySpeechPushJobResponse.setSuccess(_ctx.booleanValue("QuerySpeechPushJobResponse.Success"));
		querySpeechPushJobResponse.setCode(_ctx.stringValue("QuerySpeechPushJobResponse.Code"));
		querySpeechPushJobResponse.setErrorMessage(_ctx.stringValue("QuerySpeechPushJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechPushJobResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechPushJobResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechPushJobResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechPushJobResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setCode(_ctx.stringValue("QuerySpeechPushJobResponse.Data.List["+ i +"].Code"));
			items.setExpiredTime(_ctx.longValue("QuerySpeechPushJobResponse.Data.List["+ i +"].ExpiredTime"));
			items.setPushMode(_ctx.stringValue("QuerySpeechPushJobResponse.Data.List["+ i +"].PushMode"));
			items.setIotId(_ctx.stringValue("QuerySpeechPushJobResponse.Data.List["+ i +"].IotId"));
			items.setStatus(_ctx.stringValue("QuerySpeechPushJobResponse.Data.List["+ i +"].Status"));
			items.setCreatedTime(_ctx.longValue("QuerySpeechPushJobResponse.Data.List["+ i +"].CreatedTime"));
			items.setTotalDeviceNum(_ctx.integerValue("QuerySpeechPushJobResponse.Data.List["+ i +"].TotalDeviceNum"));
			items.setSuccessDeviceNum(_ctx.integerValue("QuerySpeechPushJobResponse.Data.List["+ i +"].SuccessDeviceNum"));
			items.setSpeechStatus(_ctx.booleanValue("QuerySpeechPushJobResponse.Data.List["+ i +"].SpeechStatus"));
			items.setFailDeviceNum(_ctx.integerValue("QuerySpeechPushJobResponse.Data.List["+ i +"].FailDeviceNum"));
			items.setSpeechNum(_ctx.integerValue("QuerySpeechPushJobResponse.Data.List["+ i +"].SpeechNum"));
			items.setRunningDeviceNum(_ctx.integerValue("QuerySpeechPushJobResponse.Data.List["+ i +"].RunningDeviceNum"));
			items.setGroupId(_ctx.stringValue("QuerySpeechPushJobResponse.Data.List["+ i +"].GroupId"));
			items.setGroupName(_ctx.stringValue("QuerySpeechPushJobResponse.Data.List["+ i +"].GroupName"));
			items.setProductKey(_ctx.stringValue("QuerySpeechPushJobResponse.Data.List["+ i +"].ProductKey"));
			items.setDeviceName(_ctx.stringValue("QuerySpeechPushJobResponse.Data.List["+ i +"].DeviceName"));

			list.add(items);
		}
		data.setList(list);
		querySpeechPushJobResponse.setData(data);
	 
	 	return querySpeechPushJobResponse;
	}
}