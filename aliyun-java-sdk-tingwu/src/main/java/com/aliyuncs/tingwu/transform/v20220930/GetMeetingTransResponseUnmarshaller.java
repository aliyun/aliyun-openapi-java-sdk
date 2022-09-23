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

import com.aliyuncs.tingwu.model.v20220930.GetMeetingTransResponse;
import com.aliyuncs.tingwu.model.v20220930.GetMeetingTransResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMeetingTransResponseUnmarshaller {

	public static GetMeetingTransResponse unmarshall(GetMeetingTransResponse getMeetingTransResponse, UnmarshallerContext _ctx) {
		
		getMeetingTransResponse.setRequestId(_ctx.stringValue("GetMeetingTransResponse.RequestId"));
		getMeetingTransResponse.setCode(_ctx.stringValue("GetMeetingTransResponse.Code"));
		getMeetingTransResponse.setMessage(_ctx.stringValue("GetMeetingTransResponse.Message"));

		Data data = new Data();
		data.setMeetingId(_ctx.stringValue("GetMeetingTransResponse.Data.MeetingId"));
		data.setMeetingStatus(_ctx.stringValue("GetMeetingTransResponse.Data.MeetingStatus"));
		data.setMeetingKey(_ctx.stringValue("GetMeetingTransResponse.Data.MeetingKey"));
		getMeetingTransResponse.setData(data);
	 
	 	return getMeetingTransResponse;
	}
}