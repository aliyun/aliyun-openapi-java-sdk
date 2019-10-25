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

import com.aliyuncs.aliyuncvc.model.v20190919.CreateMeetingResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.CreateMeetingResponse.MeetingInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMeetingResponseUnmarshaller {

	public static CreateMeetingResponse unmarshall(CreateMeetingResponse createMeetingResponse, UnmarshallerContext _ctx) {
		
		createMeetingResponse.setRequestId(_ctx.stringValue("CreateMeetingResponse.RequestId"));
		createMeetingResponse.setErrorCode(_ctx.integerValue("CreateMeetingResponse.ErrorCode"));
		createMeetingResponse.setMessage(_ctx.stringValue("CreateMeetingResponse.Message"));
		createMeetingResponse.setSuccess(_ctx.booleanValue("CreateMeetingResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingCode(_ctx.stringValue("CreateMeetingResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("CreateMeetingResponse.MeetingInfo.MeetingUUID"));
		createMeetingResponse.setMeetingInfo(meetingInfo);
	 
	 	return createMeetingResponse;
	}
}