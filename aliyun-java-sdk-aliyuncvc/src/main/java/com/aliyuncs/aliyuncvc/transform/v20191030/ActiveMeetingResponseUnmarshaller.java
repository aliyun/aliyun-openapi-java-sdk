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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.ActiveMeetingResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.ActiveMeetingResponse.MeetingInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActiveMeetingResponseUnmarshaller {

	public static ActiveMeetingResponse unmarshall(ActiveMeetingResponse activeMeetingResponse, UnmarshallerContext _ctx) {
		
		activeMeetingResponse.setRequestId(_ctx.stringValue("ActiveMeetingResponse.RequestId"));
		activeMeetingResponse.setErrorCode(_ctx.integerValue("ActiveMeetingResponse.ErrorCode"));
		activeMeetingResponse.setMessage(_ctx.stringValue("ActiveMeetingResponse.Message"));
		activeMeetingResponse.setSuccess(_ctx.booleanValue("ActiveMeetingResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setValidTime(_ctx.longValue("ActiveMeetingResponse.MeetingInfo.ValidTime"));
		meetingInfo.setMeetingCode(_ctx.stringValue("ActiveMeetingResponse.MeetingInfo.MeetingCode"));
		activeMeetingResponse.setMeetingInfo(meetingInfo);
	 
	 	return activeMeetingResponse;
	}
}