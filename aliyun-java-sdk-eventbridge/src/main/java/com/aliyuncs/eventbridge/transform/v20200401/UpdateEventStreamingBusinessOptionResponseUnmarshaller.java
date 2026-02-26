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

import com.aliyuncs.eventbridge.model.v20200401.UpdateEventStreamingBusinessOptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEventStreamingBusinessOptionResponseUnmarshaller {

	public static UpdateEventStreamingBusinessOptionResponse unmarshall(UpdateEventStreamingBusinessOptionResponse updateEventStreamingBusinessOptionResponse, UnmarshallerContext _ctx) {
		
		updateEventStreamingBusinessOptionResponse.setRequestId(_ctx.stringValue("UpdateEventStreamingBusinessOptionResponse.RequestId"));
		updateEventStreamingBusinessOptionResponse.setMessage(_ctx.stringValue("UpdateEventStreamingBusinessOptionResponse.Message"));
		updateEventStreamingBusinessOptionResponse.setCode(_ctx.stringValue("UpdateEventStreamingBusinessOptionResponse.Code"));
		updateEventStreamingBusinessOptionResponse.setSuccess(_ctx.booleanValue("UpdateEventStreamingBusinessOptionResponse.Success"));
		updateEventStreamingBusinessOptionResponse.setData(_ctx.booleanValue("UpdateEventStreamingBusinessOptionResponse.Data"));
	 
	 	return updateEventStreamingBusinessOptionResponse;
	}
}