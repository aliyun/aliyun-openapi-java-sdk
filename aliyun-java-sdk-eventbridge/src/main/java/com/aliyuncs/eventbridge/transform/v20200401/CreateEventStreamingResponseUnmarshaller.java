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

import com.aliyuncs.eventbridge.model.v20200401.CreateEventStreamingResponse;
import com.aliyuncs.eventbridge.model.v20200401.CreateEventStreamingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEventStreamingResponseUnmarshaller {

	public static CreateEventStreamingResponse unmarshall(CreateEventStreamingResponse createEventStreamingResponse, UnmarshallerContext _ctx) {
		
		createEventStreamingResponse.setRequestId(_ctx.stringValue("CreateEventStreamingResponse.RequestId"));
		createEventStreamingResponse.setMessage(_ctx.stringValue("CreateEventStreamingResponse.Message"));
		createEventStreamingResponse.setCode(_ctx.stringValue("CreateEventStreamingResponse.Code"));
		createEventStreamingResponse.setSuccess(_ctx.booleanValue("CreateEventStreamingResponse.Success"));

		Data data = new Data();
		data.setEventStreamingARN(_ctx.stringValue("CreateEventStreamingResponse.Data.EventStreamingARN"));
		createEventStreamingResponse.setData(data);
	 
	 	return createEventStreamingResponse;
	}
}