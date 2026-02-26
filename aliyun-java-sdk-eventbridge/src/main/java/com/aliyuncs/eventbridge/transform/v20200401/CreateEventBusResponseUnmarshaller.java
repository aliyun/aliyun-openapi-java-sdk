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

import com.aliyuncs.eventbridge.model.v20200401.CreateEventBusResponse;
import com.aliyuncs.eventbridge.model.v20200401.CreateEventBusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEventBusResponseUnmarshaller {

	public static CreateEventBusResponse unmarshall(CreateEventBusResponse createEventBusResponse, UnmarshallerContext _ctx) {
		
		createEventBusResponse.setRequestId(_ctx.stringValue("CreateEventBusResponse.RequestId"));
		createEventBusResponse.setMessage(_ctx.stringValue("CreateEventBusResponse.Message"));
		createEventBusResponse.setCode(_ctx.stringValue("CreateEventBusResponse.Code"));
		createEventBusResponse.setSuccess(_ctx.booleanValue("CreateEventBusResponse.Success"));

		Data data = new Data();
		data.setEventBusARN(_ctx.stringValue("CreateEventBusResponse.Data.EventBusARN"));
		createEventBusResponse.setData(data);
	 
	 	return createEventBusResponse;
	}
}