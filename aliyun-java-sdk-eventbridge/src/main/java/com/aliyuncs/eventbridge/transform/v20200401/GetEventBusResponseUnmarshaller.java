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

package com.aliyuncs.eventbridge.transform.v20200401;

import com.aliyuncs.eventbridge.model.v20200401.GetEventBusResponse;
import com.aliyuncs.eventbridge.model.v20200401.GetEventBusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEventBusResponseUnmarshaller {

	public static GetEventBusResponse unmarshall(GetEventBusResponse getEventBusResponse, UnmarshallerContext _ctx) {
		
		getEventBusResponse.setRequestId(_ctx.stringValue("GetEventBusResponse.RequestId"));
		getEventBusResponse.setMessage(_ctx.stringValue("GetEventBusResponse.Message"));
		getEventBusResponse.setCode(_ctx.stringValue("GetEventBusResponse.Code"));
		getEventBusResponse.setSuccess(_ctx.booleanValue("GetEventBusResponse.Success"));

		Data data = new Data();
		data.setEventBusARN(_ctx.stringValue("GetEventBusResponse.Data.EventBusARN"));
		data.setEventBusName(_ctx.stringValue("GetEventBusResponse.Data.EventBusName"));
		data.setDescription(_ctx.stringValue("GetEventBusResponse.Data.Description"));
		data.setCreateTimestamp(_ctx.longValue("GetEventBusResponse.Data.CreateTimestamp"));
		getEventBusResponse.setData(data);
	 
	 	return getEventBusResponse;
	}
}