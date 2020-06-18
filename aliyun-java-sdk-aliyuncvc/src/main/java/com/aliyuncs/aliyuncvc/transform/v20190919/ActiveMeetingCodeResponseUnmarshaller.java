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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import com.aliyuncs.aliyuncvc.model.v20190919.ActiveMeetingCodeResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.ActiveMeetingCodeResponse.MeetingInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActiveMeetingCodeResponseUnmarshaller {

	public static ActiveMeetingCodeResponse unmarshall(ActiveMeetingCodeResponse activeMeetingCodeResponse, UnmarshallerContext _ctx) {
		
		activeMeetingCodeResponse.setRequestId(_ctx.stringValue("ActiveMeetingCodeResponse.RequestId"));
		activeMeetingCodeResponse.setErrorCode(_ctx.integerValue("ActiveMeetingCodeResponse.ErrorCode"));
		activeMeetingCodeResponse.setMessage(_ctx.stringValue("ActiveMeetingCodeResponse.Message"));
		activeMeetingCodeResponse.setSuccess(_ctx.booleanValue("ActiveMeetingCodeResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setValidDate(_ctx.longValue("ActiveMeetingCodeResponse.MeetingInfo.ValidDate"));
		meetingInfo.setMeetingCode(_ctx.stringValue("ActiveMeetingCodeResponse.MeetingInfo.MeetingCode"));
		activeMeetingCodeResponse.setMeetingInfo(meetingInfo);
	 
	 	return activeMeetingCodeResponse;
	}
}