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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.BatchGetDeviceStateResponse;
import com.aliyuncs.iot.model.v20180120.BatchGetDeviceStateResponse.DeviceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetDeviceStateResponseUnmarshaller {

	public static BatchGetDeviceStateResponse unmarshall(BatchGetDeviceStateResponse batchGetDeviceStateResponse, UnmarshallerContext _ctx) {
		
		batchGetDeviceStateResponse.setRequestId(_ctx.stringValue("BatchGetDeviceStateResponse.RequestId"));
		batchGetDeviceStateResponse.setSuccess(_ctx.booleanValue("BatchGetDeviceStateResponse.Success"));
		batchGetDeviceStateResponse.setCode(_ctx.stringValue("BatchGetDeviceStateResponse.Code"));
		batchGetDeviceStateResponse.setErrorMessage(_ctx.stringValue("BatchGetDeviceStateResponse.ErrorMessage"));

		List<DeviceStatus> deviceStatusList = new ArrayList<DeviceStatus>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetDeviceStateResponse.DeviceStatusList.Length"); i++) {
			DeviceStatus deviceStatus = new DeviceStatus();
			deviceStatus.setDeviceId(_ctx.stringValue("BatchGetDeviceStateResponse.DeviceStatusList["+ i +"].DeviceId"));
			deviceStatus.setDeviceName(_ctx.stringValue("BatchGetDeviceStateResponse.DeviceStatusList["+ i +"].DeviceName"));
			deviceStatus.setStatus(_ctx.stringValue("BatchGetDeviceStateResponse.DeviceStatusList["+ i +"].Status"));
			deviceStatus.setAsAddress(_ctx.stringValue("BatchGetDeviceStateResponse.DeviceStatusList["+ i +"].AsAddress"));
			deviceStatus.setLastOnlineTime(_ctx.stringValue("BatchGetDeviceStateResponse.DeviceStatusList["+ i +"].LastOnlineTime"));
			deviceStatus.setIotId(_ctx.stringValue("BatchGetDeviceStateResponse.DeviceStatusList["+ i +"].IotId"));

			deviceStatusList.add(deviceStatus);
		}
		batchGetDeviceStateResponse.setDeviceStatusList(deviceStatusList);
	 
	 	return batchGetDeviceStateResponse;
	}
}