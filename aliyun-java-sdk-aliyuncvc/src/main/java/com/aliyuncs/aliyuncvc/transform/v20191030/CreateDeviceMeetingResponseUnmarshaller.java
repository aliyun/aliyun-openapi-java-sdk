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

import com.aliyuncs.aliyuncvc.model.v20191030.CreateDeviceMeetingResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.CreateDeviceMeetingResponse.Devices;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeviceMeetingResponseUnmarshaller {

	public static CreateDeviceMeetingResponse unmarshall(CreateDeviceMeetingResponse createDeviceMeetingResponse, UnmarshallerContext _ctx) {
		
		createDeviceMeetingResponse.setRequestId(_ctx.stringValue("CreateDeviceMeetingResponse.RequestId"));
		createDeviceMeetingResponse.setErrorCode(_ctx.integerValue("CreateDeviceMeetingResponse.ErrorCode"));
		createDeviceMeetingResponse.setMessage(_ctx.stringValue("CreateDeviceMeetingResponse.Message"));
		createDeviceMeetingResponse.setSuccess(_ctx.booleanValue("CreateDeviceMeetingResponse.Success"));

		Devices devices = new Devices();
		devices.setMeetingCode(_ctx.stringValue("CreateDeviceMeetingResponse.Devices.MeetingCode"));
		devices.setMeetingUUID(_ctx.stringValue("CreateDeviceMeetingResponse.Devices.MeetingUUID"));
		createDeviceMeetingResponse.setDevices(devices);
	 
	 	return createDeviceMeetingResponse;
	}
}