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

import com.aliyuncs.aliyuncvc.model.v20191030.JoinDeviceMeetingResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.JoinDeviceMeetingResponse.Device;
import com.aliyuncs.aliyuncvc.model.v20191030.JoinDeviceMeetingResponse.Device.SlsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinDeviceMeetingResponseUnmarshaller {

	public static JoinDeviceMeetingResponse unmarshall(JoinDeviceMeetingResponse joinDeviceMeetingResponse, UnmarshallerContext _ctx) {
		
		joinDeviceMeetingResponse.setRequestId(_ctx.stringValue("JoinDeviceMeetingResponse.RequestId"));
		joinDeviceMeetingResponse.setErrorCode(_ctx.integerValue("JoinDeviceMeetingResponse.ErrorCode"));
		joinDeviceMeetingResponse.setMessage(_ctx.stringValue("JoinDeviceMeetingResponse.Message"));
		joinDeviceMeetingResponse.setSuccess(_ctx.booleanValue("JoinDeviceMeetingResponse.Success"));

		Device device = new Device();
		device.setMeetingDomain(_ctx.stringValue("JoinDeviceMeetingResponse.Device.MeetingDomain"));
		device.setMeetingToken(_ctx.stringValue("JoinDeviceMeetingResponse.Device.MeetingToken"));
		device.setMeetingCode(_ctx.stringValue("JoinDeviceMeetingResponse.Device.MeetingCode"));
		device.setMemberUUID(_ctx.stringValue("JoinDeviceMeetingResponse.Device.MemberUUID"));
		device.setClientAppId(_ctx.stringValue("JoinDeviceMeetingResponse.Device.ClientAppId"));
		device.setMeetingUUID(_ctx.stringValue("JoinDeviceMeetingResponse.Device.MeetingUUID"));
		device.setMeetingAppId(_ctx.stringValue("JoinDeviceMeetingResponse.Device.MeetingAppId"));

		SlsInfo slsInfo = new SlsInfo();
		slsInfo.setLogServiceEndpoint(_ctx.stringValue("JoinDeviceMeetingResponse.Device.SlsInfo.LogServiceEndpoint"));
		slsInfo.setProject(_ctx.stringValue("JoinDeviceMeetingResponse.Device.SlsInfo.Project"));
		slsInfo.setLogstore(_ctx.stringValue("JoinDeviceMeetingResponse.Device.SlsInfo.Logstore"));
		device.setSlsInfo(slsInfo);
		joinDeviceMeetingResponse.setDevice(device);
	 
	 	return joinDeviceMeetingResponse;
	}
}