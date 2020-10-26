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

import com.aliyuncs.iot.model.v20180120.QuerySpeechModelPushJobResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechModelPushJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechModelPushJobResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechModelPushJobResponseUnmarshaller {

	public static QuerySpeechModelPushJobResponse unmarshall(QuerySpeechModelPushJobResponse querySpeechModelPushJobResponse, UnmarshallerContext _ctx) {
		
		querySpeechModelPushJobResponse.setRequestId(_ctx.stringValue("QuerySpeechModelPushJobResponse.RequestId"));
		querySpeechModelPushJobResponse.setSuccess(_ctx.booleanValue("QuerySpeechModelPushJobResponse.Success"));
		querySpeechModelPushJobResponse.setCode(_ctx.stringValue("QuerySpeechModelPushJobResponse.Code"));
		querySpeechModelPushJobResponse.setErrorMessage(_ctx.stringValue("QuerySpeechModelPushJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechModelPushJobResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechModelPushJobResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechModelPushJobResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechModelPushJobResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setCode(_ctx.stringValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].Code"));
			items.setExpiredTime(_ctx.longValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].ExpiredTime"));
			items.setPushMode(_ctx.stringValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].PushMode"));
			items.setIotId(_ctx.stringValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].IotId"));
			items.setStatus(_ctx.stringValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].Status"));
			items.setCreatedTime(_ctx.longValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].CreatedTime"));
			items.setTotalDeviceNum(_ctx.integerValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].TotalDeviceNum"));
			items.setSuccessDeviceNum(_ctx.integerValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].SuccessDeviceNum"));
			items.setSpeechModelStatus(_ctx.booleanValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].SpeechModelStatus"));
			items.setFailDeviceNum(_ctx.integerValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].FailDeviceNum"));
			items.setSpeechModelNum(_ctx.integerValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].SpeechModelNum"));
			items.setRunningDeviceNum(_ctx.integerValue("QuerySpeechModelPushJobResponse.Data.List["+ i +"].RunningDeviceNum"));

			list.add(items);
		}
		data.setList(list);
		querySpeechModelPushJobResponse.setData(data);
	 
	 	return querySpeechModelPushJobResponse;
	}
}