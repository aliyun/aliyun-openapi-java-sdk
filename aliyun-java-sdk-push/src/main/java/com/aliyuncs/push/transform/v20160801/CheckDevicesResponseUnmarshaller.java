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

package com.aliyuncs.push.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.CheckDevicesResponse;
import com.aliyuncs.push.model.v20160801.CheckDevicesResponse.DeviceCheckInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDevicesResponseUnmarshaller {

	public static CheckDevicesResponse unmarshall(CheckDevicesResponse checkDevicesResponse, UnmarshallerContext _ctx) {
		
		checkDevicesResponse.setRequestId(_ctx.stringValue("CheckDevicesResponse.RequestId"));

		List<DeviceCheckInfo> deviceCheckInfos = new ArrayList<DeviceCheckInfo>();
		for (int i = 0; i < _ctx.lengthValue("CheckDevicesResponse.DeviceCheckInfos.Length"); i++) {
			DeviceCheckInfo deviceCheckInfo = new DeviceCheckInfo();
			deviceCheckInfo.setAvailable(_ctx.booleanValue("CheckDevicesResponse.DeviceCheckInfos["+ i +"].Available"));
			deviceCheckInfo.setDeviceId(_ctx.stringValue("CheckDevicesResponse.DeviceCheckInfos["+ i +"].DeviceId"));

			deviceCheckInfos.add(deviceCheckInfo);
		}
		checkDevicesResponse.setDeviceCheckInfos(deviceCheckInfos);
	 
	 	return checkDevicesResponse;
	}
}