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

import com.aliyuncs.aliyuncvc.model.v20191030.CreateMeetingInternationalResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.CreateMeetingInternationalResponse.MeetingInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMeetingInternationalResponseUnmarshaller {

	public static CreateMeetingInternationalResponse unmarshall(CreateMeetingInternationalResponse createMeetingInternationalResponse, UnmarshallerContext _ctx) {
		
		createMeetingInternationalResponse.setRequestId(_ctx.stringValue("CreateMeetingInternationalResponse.RequestId"));
		createMeetingInternationalResponse.setErrorCode(_ctx.integerValue("CreateMeetingInternationalResponse.ErrorCode"));
		createMeetingInternationalResponse.setMessage(_ctx.stringValue("CreateMeetingInternationalResponse.Message"));
		createMeetingInternationalResponse.setSuccess(_ctx.booleanValue("CreateMeetingInternationalResponse.Success"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingCode(_ctx.stringValue("CreateMeetingInternationalResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("CreateMeetingInternationalResponse.MeetingInfo.MeetingUUID"));
		createMeetingInternationalResponse.setMeetingInfo(meetingInfo);
	 
	 	return createMeetingInternationalResponse;
	}
}