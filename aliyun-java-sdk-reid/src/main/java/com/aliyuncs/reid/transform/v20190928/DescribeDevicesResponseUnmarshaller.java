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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.DescribeDevicesResponse;
import com.aliyuncs.reid.model.v20190928.DescribeDevicesResponse.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDevicesResponseUnmarshaller {

	public static DescribeDevicesResponse unmarshall(DescribeDevicesResponse describeDevicesResponse, UnmarshallerContext _ctx) {
		
		describeDevicesResponse.setRequestId(_ctx.stringValue("DescribeDevicesResponse.RequestId"));
		describeDevicesResponse.setErrorCode(_ctx.stringValue("DescribeDevicesResponse.ErrorCode"));
		describeDevicesResponse.setErrorMessage(_ctx.stringValue("DescribeDevicesResponse.ErrorMessage"));
		describeDevicesResponse.setMessage(_ctx.stringValue("DescribeDevicesResponse.Message"));
		describeDevicesResponse.setCode(_ctx.stringValue("DescribeDevicesResponse.Code"));
		describeDevicesResponse.setDynamicCode(_ctx.stringValue("DescribeDevicesResponse.DynamicCode"));
		describeDevicesResponse.setSuccess(_ctx.booleanValue("DescribeDevicesResponse.Success"));
		describeDevicesResponse.setDynamicMessage(_ctx.stringValue("DescribeDevicesResponse.DynamicMessage"));

		List<Device> devices = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDevicesResponse.Devices.Length"); i++) {
			Device device = new Device();
			device.setAgentStatus(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].AgentStatus"));
			device.setIpcStatus(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].IpcStatus"));
			device.setAgentIp(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].AgentIp"));
			device.setIpcIp(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].IpcIp"));
			device.setAgentReceiveTime(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].AgentReceiveTime"));
			device.setAgentMac(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].AgentMac"));
			device.setIpcReceiveTime(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].IpcReceiveTime"));

			devices.add(device);
		}
		describeDevicesResponse.setDevices(devices);
	 
	 	return describeDevicesResponse;
	}
}