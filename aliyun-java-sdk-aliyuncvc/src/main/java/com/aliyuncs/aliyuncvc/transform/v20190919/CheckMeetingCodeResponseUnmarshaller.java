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

import com.aliyuncs.aliyuncvc.model.v20190919.CheckMeetingCodeResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.CheckMeetingCodeResponse.MeetingInfo;
import com.aliyuncs.aliyuncvc.model.v20190919.CheckMeetingCodeResponse.MeetingInfo.SlsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckMeetingCodeResponseUnmarshaller {

	public static CheckMeetingCodeResponse unmarshall(CheckMeetingCodeResponse checkMeetingCodeResponse, UnmarshallerContext _ctx) {
		
		checkMeetingCodeResponse.setRequestId(_ctx.stringValue("CheckMeetingCodeResponse.RequestId"));
		checkMeetingCodeResponse.setErrorCode(_ctx.integerValue("CheckMeetingCodeResponse.ErrorCode"));
		checkMeetingCodeResponse.setSuccess(_ctx.booleanValue("CheckMeetingCodeResponse.Success"));
		checkMeetingCodeResponse.setMessage(_ctx.stringValue("CheckMeetingCodeResponse.Message"));

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingDomain(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.MeetingDomain"));
		meetingInfo.setMeetingToken(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.MeetingToken"));
		meetingInfo.setMeetingCode(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.MeetingCode"));
		meetingInfo.setMemberUUID(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.MemberUUID"));
		meetingInfo.setClientAppId(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.ClientAppId"));
		meetingInfo.setMeetingUUID(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.MeetingUUID"));
		meetingInfo.setMeetingAppId(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.MeetingAppId"));

		SlsInfo slsInfo = new SlsInfo();
		slsInfo.setLogServiceEndpoint(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.SlsInfo.LogServiceEndpoint"));
		slsInfo.setLogstore(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.SlsInfo.Logstore"));
		slsInfo.setProject(_ctx.stringValue("CheckMeetingCodeResponse.MeetingInfo.SlsInfo.Project"));
		meetingInfo.setSlsInfo(slsInfo);
		checkMeetingCodeResponse.setMeetingInfo(meetingInfo);
	 
	 	return checkMeetingCodeResponse;
	}
}