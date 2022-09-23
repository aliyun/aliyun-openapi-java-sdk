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

package com.aliyuncs.tingwu.transform.v20220930;

import com.aliyuncs.tingwu.model.v20220930.CreateMeetingTransResponse;
import com.aliyuncs.tingwu.model.v20220930.CreateMeetingTransResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMeetingTransResponseUnmarshaller {

	public static CreateMeetingTransResponse unmarshall(CreateMeetingTransResponse createMeetingTransResponse, UnmarshallerContext _ctx) {
		
		createMeetingTransResponse.setRequestId(_ctx.stringValue("CreateMeetingTransResponse.RequestId"));
		createMeetingTransResponse.setCode(_ctx.stringValue("CreateMeetingTransResponse.Code"));
		createMeetingTransResponse.setMessage(_ctx.stringValue("CreateMeetingTransResponse.Message"));

		Data data = new Data();
		data.setMeetingId(_ctx.stringValue("CreateMeetingTransResponse.Data.MeetingId"));
		data.setMeetingJoinUrl(_ctx.stringValue("CreateMeetingTransResponse.Data.MeetingJoinUrl"));
		data.setMeetingKey(_ctx.stringValue("CreateMeetingTransResponse.Data.MeetingKey"));
		createMeetingTransResponse.setData(data);
	 
	 	return createMeetingTransResponse;
	}
}