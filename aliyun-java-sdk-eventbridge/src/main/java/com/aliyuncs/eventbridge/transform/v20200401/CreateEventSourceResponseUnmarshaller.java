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

import com.aliyuncs.eventbridge.model.v20200401.CreateEventSourceResponse;
import com.aliyuncs.eventbridge.model.v20200401.CreateEventSourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEventSourceResponseUnmarshaller {

	public static CreateEventSourceResponse unmarshall(CreateEventSourceResponse createEventSourceResponse, UnmarshallerContext _ctx) {
		
		createEventSourceResponse.setRequestId(_ctx.stringValue("CreateEventSourceResponse.RequestId"));
		createEventSourceResponse.setMessage(_ctx.stringValue("CreateEventSourceResponse.Message"));
		createEventSourceResponse.setCode(_ctx.stringValue("CreateEventSourceResponse.Code"));
		createEventSourceResponse.setSuccess(_ctx.booleanValue("CreateEventSourceResponse.Success"));

		Data data = new Data();
		data.setEventSourceARN(_ctx.stringValue("CreateEventSourceResponse.Data.EventSourceARN"));
		createEventSourceResponse.setData(data);
	 
	 	return createEventSourceResponse;
	}
}